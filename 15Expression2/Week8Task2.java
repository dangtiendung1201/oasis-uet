import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class Week8Task2 {
    /**
     * NullPointerException.
     */
    public void nullPointerEx() throws NullPointerException {
        String chuyenthaibinh = null;
        System.out.println(chuyenthaibinh.length());
    }

    /**
     * ArrayIndexOutOfBoundsException.
     */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        String[] arr = new String[5];
        arr[6] = "Chuyên Thái Bình là nhà!";
    }

    /**
     * ArithmeticException.
     */
    public void arithmeticEx() throws ArithmeticException {
        int a = 12012004;
        int b = 0;
        System.out.println(a / b);
    }

    /**
     * FileNotFoundException.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        File file = new File("uetuyetvoi.huste");
        Scanner sc = new Scanner(file);
        sc.close();
    }

    /**
     * IOException.
     */
    public void ioEx() throws IOException {
        URL url = new URL("https://uet.vnu.edu.vn/HUSTgahonUET");
        InputStream is = url.openStream();
        is.close();
    }

    /**
     * NullPointerException Test.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
            return "Không có lỗi";
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
    }

    /**
     * ArrayIndexOutOfBoundsException Test.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
            return "Không có lỗi";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
    }

    /**
     * ArithmeticException Test.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
            return "Không có lỗi";
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
    }

    /**
     * FileNotFoundException Test.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
            return "Không có lỗi";
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
    }

    /**
     * IOException Test.
     */
    public String ioExTest() {
        try {
            ioEx();
            return "Không có lỗi";
        } catch (IOException e) {
            return "Lỗi IO";
        }
    }
}
