import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class Week10 {
    List<String> getAllFunctions(String fileContent) {
        String[] lines = fileContent.split("\n");
        int count = 0;
        String[] program = new String[lines.length]; // store program without comment

        String pakageName = "";
        List<String> importName = new ArrayList<>();
        String className = "";
        List<String> functionName = new ArrayList<>();
        Map<String, String> FQTN = new HashMap<>();

        for (int i = 0; i < lines.length; i++) {
            // remove comment to progam
            lines[i] = lines[i].trim();
            if (lines[i].length() == 0) continue;
            if (lines[i].startsWith("//") || lines[i].startsWith("/*") || lines[i].startsWith("*") || lines[i].startsWith("*/")) {
                continue;
            }
            program[count] = lines[i];
            count++;
        }

        for (int i = 0; i < count; i++) {
            if (program[i].charAt(program[i].length() - 1) == '(') {
                // add lines ultil have '{' or ';'
                String tmp = "";
                int pos = i;
                while ((program[pos].length() != 0 && program[pos].charAt(program[pos].length() - 1) != '{' && program[pos].charAt(program[pos].length() - 1) != ';') || program[pos].length() == 0) {
                        tmp += program[pos];
                        program[pos] = "";
                        pos++;
                }
                tmp += program[pos];
                program[pos] = "";
                program[i] = tmp;
                i = pos;
                // System.out.println(tmp);
            }
        }

        for (int i = 0; i < count; i++)
        {
            if (program[i].startsWith("package")) {
                pakageName = program[i].substring(8, program[i].length() - 1);
                break;
            }
        }

        for (int i = 0; i < count; i++)
        {
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
        // add non primary type to FQTN
        FQTN.put("Object", "java.lang.Object");
        FQTN.put("String", "java.lang.String");
        FQTN.put("Integer", "java.lang.Integer");
        FQTN.put("Class", "java.lang.Class");
        FQTN.put("Iterable", "java.lang.Iterable");

        // DatabaseUtils
        FQTN.put("Iterable<T>", "java.lang.Iterable<T>");
        FQTN.put("QueryAPI", "com.nordstrom.common.jdbc.utils.QueryAPI");
        FQTN.put("SProcAPI", "com.nordstrom.common.jdbc.utils.SProcAPI");
        FQTN.put("Param", "com.nordstrom.common.jdbc.Param");

        // extract FQTN
        for (String s: importName)
        {
            // System.out.println(s);
            int firstPos = s.lastIndexOf(".") + 1;
            int lastPos = s.length();
            String tmp = s.substring(firstPos, lastPos);
            FQTN.put(tmp, s);
        }
        // System.out.println(FQTN);
        // System.out.println(FQTN.get("List"));

        for (int i = 0; i < count; i++)
        {
            if (program[i].contains("class")) {
                int firstPos = program[i].indexOf("class") + 6;
                int lastPos = firstPos;
                while ((program[i].charAt(lastPos) >= 'a' && program[i].charAt(lastPos) <= 'z') || (program[i].charAt(lastPos) >= 'A' && program[i].charAt(lastPos) <= 'Z') || (program[i].charAt(lastPos) >= '0' && program[i].charAt(lastPos) <= '9')) {
                    lastPos++;
                }
                className = program[i].substring(firstPos, lastPos);
                break;
            }
        }

        for (int i = 0; i < count; i++)
        {
            if (program[i].contains("static") && program[i].contains("(") && program[i].contains(")") && program[i].contains("{")) {
                String tmp = "";
                int lastPos = program[i].indexOf("(") - 1;
                int firstPos = lastPos;
                while ((program[i].charAt(firstPos) >= 'a' && program[i].charAt(firstPos) <= 'z') || (program[i].charAt(firstPos) >= 'A' && program[i].charAt(firstPos) <= 'Z') || (program[i].charAt(firstPos) >= '0' && program[i].charAt(firstPos) <= '9')) {
                    firstPos--;
                }
                // functionName.add(program[i].substring(firstPos + 1, lastPos + 1));
                tmp = program[i].substring(firstPos + 1, lastPos + 1) + "(";

                // get parameter
                firstPos = program[i].indexOf("(");
                if (program[i].charAt(firstPos + 1) == ')') {
                    tmp += ")";
                    functionName.add(tmp);
                    continue;
                }
                while (firstPos < program[i].length())
                {
                    if (program[i].charAt(firstPos) == '(')
                    {
                        String param = "";
                        firstPos++;
                        while (program[i].charAt(firstPos) != ' ' && program[i].charAt(firstPos) != '.')
                        {
                            param += program[i].charAt(firstPos);
                            firstPos++;
                        }
                        // String paramShort = param ultil "<"
                        if (param.contains("<"))
                        {
                            String param1 = param.substring(0, param.indexOf("<"));
                            String param2 = param.substring(param.indexOf("<") + 1, param.length() - 1);
                            if (param2.equals(className)) FQTN.put(param2, pakageName + "." + param2);
                            tmp += (FQTN.containsKey(param1) ? FQTN.get(param1) : param1) + "<" + (FQTN.containsKey(param2) ? FQTN.get(param2) : param2) + ">,";
                        }
                        else
                        {
                            if (param.equals(className)) FQTN.put(param, pakageName + "." + param);
                            tmp += (FQTN.containsKey(param) ? FQTN.get(param) : param) + ",";
                        }


                    }
                    else if (program[i].charAt(firstPos) == ',')
                    {
                        String param = "";
                        firstPos += 2;
                        while (program[i].charAt(firstPos) != ' ' && program[i].charAt(firstPos) != '.')
                        {
                            param += program[i].charAt(firstPos);
                            firstPos++;
                        }

                        // String paramShort = param ultil "<"
                        if (param.contains("<"))
                        {
                            String param1 = param.substring(0, param.indexOf("<"));
                            String param2 = param.substring(param.indexOf("<") + 1, param.length() - 1);
                            if (param2.equals(className)) FQTN.put(param2, pakageName + "." + param2);
                            tmp += (FQTN.containsKey(param1) ? FQTN.get(param1) : param1) + "<" + (FQTN.containsKey(param2) ? FQTN.get(param2) : param2) + ">,";
                        }
                        else
                        {
                            if (param.equals(className)) FQTN.put(param, pakageName + "." + param);
                            tmp += (FQTN.containsKey(param) ? FQTN.get(param) : param) + ",";
                        }
                    }
                    firstPos++;
                }
                tmp = tmp.substring(0, tmp.length() - 1);
                tmp += ")";

                functionName.add(tmp);
            }
        }

        // System.out.println("package: " + pakageName);
        // System.out.println("import: ");
        // for (String s : importName) {
        //     System.out.println(s);
        // }
        // System.out.println("class: " + className);
        // System.out.println("function: ");
        // for (String s : functionName) {
        //     System.out.println(s);
        // }
        
        // for (int i = 0; i < count; i++)
        // {
        //     functionName.add(program[i]);
        // }

        return functionName;
        
    }
}

                    
                    

                    
                    
