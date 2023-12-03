import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Week10 {
    String[] lines;
    int count = 0;
    String[] program;
    String pakageName;
    List<String> importName = new ArrayList<>();
    String className;
    List<String> functionList = new ArrayList<>();
    Map<String, String> fqtn = new HashMap<>();

    private void getProgram(String fileContent) {
        lines = fileContent.split("\n");
        program = new String[lines.length];

        for (int i = 0; i < lines.length; i++) {
            // remove comment to progam
            lines[i] = lines[i].trim();
            if (lines[i].length() == 0) {
                continue;
            }
            if (lines[i].startsWith("//") || lines[i].startsWith("*")) {
                continue;
            } else if (lines[i].startsWith("/*")) {
                while (!lines[i].endsWith("*/")) {
                    lines[i] = "";
                    i++;
                }
                continue;
            }
            program[count] = lines[i];
            count++;
        }
    }

    private void normalizeContent() {
        for (int i = 0; i < count; i++) {
            if (program[i].charAt(program[i].length() - 1) == '(') {
                String tmp = "";
                int pos = i;
                while ((program[pos].length() != 0
                        && program[pos].charAt(program[pos].length() - 1) != '{'
                        && program[pos].charAt(program[pos].length() - 1) != ';')
                        || program[pos].length() == 0) {
                    tmp += program[pos];
                    program[pos] = "";
                    pos++;
                }
                tmp += program[pos];
                program[pos] = "";
                program[i] = tmp;
                i = pos;
            }
        }
    }

    private void getPakageName() {
        for (int i = 0; i < count; i++) {
            if (program[i].startsWith("package")) {
                pakageName = program[i].substring(8, program[i].length() - 1);
                break;
            }
        }
    }

    private void getImportName() {
        for (int i = 0; i < count; i++) {
            if (program[i].startsWith("import")) {
                String tmp = "";

                int lastPos = program[i].length() - 2;
                int firstPos = lastPos;

                while (program[i].charAt(firstPos) != ' ') {
                    firstPos--;
                }

                tmp = program[i].substring(firstPos + 1, lastPos + 1);
                importName.add(tmp);
            }
        }
    }

    private void getClassName() {
        for (int i = 0; i < count; i++) {
            if (program[i].contains("class")) {
                int firstPos = program[i].indexOf("class") + 6;
                int lastPos = firstPos;
                while ((program[i].charAt(lastPos) >= 'a'
                        && program[i].charAt(lastPos) <= 'z')
                        || (program[i].charAt(lastPos) >= 'A'
                                && program[i].charAt(lastPos) <= 'Z')
                        || (program[i].charAt(lastPos) >= '0'
                                && program[i].charAt(lastPos) <= '9')) {
                    lastPos++;
                }
                className = program[i].substring(firstPos, lastPos);
                break;
            }
        }
    }

    private void getfqtn() {
        for (String s : importName) {
            // // System.out.println(s);
            // int firstPos = s.lastIndexOf(".") + 1;
            // int lastPos = s.length();
            // String tmp = s.substring(firstPos, lastPos);
            // fqtn.put(tmp, s);

            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '.' && s.charAt(i + 1) >= 'A' && s.charAt(i + 1) <= 'Z') {
                    int firstPos = i + 1;
                    int lastPos = firstPos;

                    // while s.charAt(lastPos) not '.' or end of string lastPos++
                    while (lastPos < s.length() && s.charAt(lastPos) != '.') {
                        lastPos++;
                    }

                    String tmp1 = s.substring(firstPos, lastPos);
                    String tmp2 = s.substring(0, lastPos);

                    fqtn.put(tmp1, tmp2);
                }
            }
        }

        for (int i = 0; i < count; i++) {
            // contain interface
            if (program[i].contains("interface")) {
                int firstPos = program[i].indexOf("interface") + 10;
                int lastPos = program[i].indexOf('{') - 1;

                String tmp = program[i].substring(firstPos, lastPos);

                fqtn.put(tmp, pakageName + "." + tmp);
            }
        }
    }

    private boolean isFunction(String s) {
        if (s.contains("static") && s.contains("(") && s.contains(")") && s.contains("{")) {
            return true;
        }
        return false;
    }

    private String getFunctionName(String s) {
        String res = "";
        int lastPos = s.indexOf("(") - 1;
        int firstPos = lastPos;

        while ((s.charAt(firstPos) >= 'a' && s.charAt(firstPos) <= 'z')
                || (s.charAt(firstPos) >= 'A' && s.charAt(firstPos) <= 'Z')
                || (s.charAt(firstPos) >= '0' && s.charAt(firstPos) <= '9')) {
            firstPos--;
        }

        res = s.substring(firstPos + 1, lastPos + 1);

        return res;
    }

    private String getFunctionfqtn(String s) {
        if (fqtn.containsKey(s)) {
            return fqtn.get(s);
        }

        if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z' && (s.charAt(0) != 'T' && s.length() != 1)) {
            return "java.lang." + s;
        } else {
            return s;
        }

    }

    private List<String> getParameter(String s) {
        List<String> res = new ArrayList<>();
        int firstPos = s.indexOf("(");
        int lastPos = s.indexOf(")");

        while (firstPos <= lastPos) {
            if (s.charAt(firstPos) == '(' || s.charAt(firstPos) == ',') {
                String param = "";
                if (s.charAt(firstPos) == '(') {
                    firstPos++;
                } else {
                    firstPos += 2;
                }
                while (s.charAt(firstPos) != ' '
                        && s.charAt(firstPos) != '.'
                        && s.charAt(firstPos) != '{') {
                    param += s.charAt(firstPos);
                    firstPos++;
                }

                if (param.contains("<")) {
                    String param1 = param.substring(0, param.indexOf("<"));
                    String param2 = param.substring(param.indexOf("<") + 1, param.length() - 1);
                    if (param2.equals(className)) {
                        fqtn.put(param2, pakageName + "." + param2);
                    }
                    res.add(getFunctionfqtn(param1) + "<"
                            + getFunctionfqtn(param2) + ">");
                } else {
                    if (param.equals(className)) {
                        fqtn.put(param, pakageName + "." + param);
                    }
                    res.add(getFunctionfqtn(param));
                }
            }
            firstPos++;
        }

        if (res.size() == 1 && res.get(0).equals(")")) {
            res.remove(0);
        }

        return res;
    }

    private void printProgram() {
        for (int i = 0; i < count; i++) {
            System.out.println(program[i]);
        }
    }

    private void printfqtn() {
        for (Map.Entry<String, String> entry : fqtn.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private void printImportName() {
        for (String string : importName) {
            System.out.println(string);
        }
    }

    List<String> getAllFunctions(String fileContent) {
        getProgram(fileContent);
        normalizeContent();
        getPakageName();
        getImportName();
        getClassName();
        getfqtn();

        // printProgram();

        for (int i = 0; i < count; i++) {
            if (isFunction(program[i])) {
                String res = " ";
                String functionName = getFunctionName(program[i]);
                List<String> parameterList = new ArrayList<>();
                parameterList = getParameter(program[i]);

                res = functionName;

                if (parameterList.size() == 0) {
                    res += "()";
                    functionList.add(res);
                } else {
                    res += "(";
                    for (String string : parameterList) {
                        res += string + ",";
                    }
                    res = res.substring(0, res.length() - 1);
                    res += ")";
                    functionList.add(res);
                }
            }
        }

        return functionList;
    }
}
