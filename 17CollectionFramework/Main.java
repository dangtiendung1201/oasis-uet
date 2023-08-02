import java.util.List;

import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        // File file = new File("DatabaseUtils.java");
        // File file = new File("DateUtils.java");
        // File file = new File("OSInfo.java");
        // File file = new File("PathUtils.java");
        // File file = new File("RandomArrayUtils.java");
        // File file = new File("RandomDateUtils.java");
        // File file = new File("RandomNumberUtils.java");
        // File file = new File("VolumeInfo.java");
        File file = new File("UET.java");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String fileContent = "";
        String line;
        while ((line = br.readLine()) != null) {
            fileContent += line + "\n";
        }
        br.close();
        Week10 Test = new Week10();
        List<String> result = Test.getAllFunctions(fileContent);
        System.out.println(result);
        // for (String string : result) {
        //     System.out.println(string);
        // }
    }
}
