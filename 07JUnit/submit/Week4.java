// package junit;

public class Week4 {
    public static int max2Int(int a, int b) {
        // Tim gia tri lon nhat cua 2 so nguyen
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int minArray(int[] array) {
        // Tim gia tri nho nhat cua 1 mang so nguyen
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }

        return min;
    }

    public static String calculateBMI(double weight, double height) {
        // Tinh BMI
        double bmi = weight / (height * height);
        String result = "";

        if (bmi < 18.5) {
            result = "Thiếu cân";
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            result = "Bình thường";
        } else if (bmi >= 23 && bmi <= 24.9) {
            result = "Thừa cân";
        } else {
            result = "Béo phì";
        }

        return result;
    }
}
