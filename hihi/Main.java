import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        // read from "OSInfo.java"
        File file = new File("OSInfo.java");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String fileContent = "";
        String line;
        while ((line = br.readLine()) != null) {
            fileContent += line + "\n";
        }
        br.close();
        System.out.println(fileContent);
    }
}
