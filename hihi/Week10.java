import java.util.ArrayList;
import java.util.List;
public class Week10 {
    List<String> getAllFunctions(String fileContent) {
        List<String> result = new ArrayList<>();
        String[] lines = fileContent.split("\n");
        int count = 0;
        String[] program = new String[lines.length]; // store program without comment

        String pakageName = "";
        List<String> importName = new ArrayList<>();
        String className = "";
        List<String> functionName = new ArrayList<>();

        for (int i = 0; i < lines.length; i++) {
            // remove comment to progam
            lines[i] = lines[i].trim();
            if (lines[i].startsWith("//") || lines[i].startsWith("/*") || lines[i].startsWith("*") || lines[i].startsWith("*/")) {
                continue;
            }
            else{
                program[count] = lines[i];
                count++;
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
                importName.add(program[i].substring(7, program[i].length() - 1));
            }
        }

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
                        while (program[i].charAt(firstPos) != ' ')
                        {
                            param += program[i].charAt(firstPos);
                            firstPos++;
                        }
                        tmp += param + ", ";
                    }
                    else if (program[i].charAt(firstPos) == ',')
                    {
                        String param = "";
                        firstPos += 2;
                        while (program[i].charAt(firstPos) != ' ')
                        {
                            param += program[i].charAt(firstPos);
                            firstPos++;
                        }
                        tmp += param + ", ";
                    }
                    firstPos++;
                }
                tmp = tmp.substring(0, tmp.length() - 2);
                tmp += ")";
                functionName.add(tmp);
            }
        }

        System.out.println("package: " + pakageName);
        System.out.println("import: ");
        for (String s : importName) {
            System.out.println(s);
        }
        System.out.println("class: " + className);
        System.out.println("function: ");
        for (String s : functionName) {
            System.out.println(s);
        }
        
        
        // for (int i = 0; i < count; i++)
        // {
        //     result.add(program[i]);
        // }
        return result;
        
    }
}

                    
                    

                    
                    
