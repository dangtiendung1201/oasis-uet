package junit;

public class Week4 {
    public static int max2Int(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int minArray(int[] array) {
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i])
                minValue = array[i];
        }

        return minValue;
    }

    public static String calculateBMI(double weight, double height) {
        double bmi = Math.round(weight / (height * height) * 10) / 10.0;
        String result = "";

        if (bmi < 18.5) {
            result = "Thiếu cân";
        } else if (bmi <= 22.9) {
            result = "Bình thường";
        } else if (bmi <= 24.9) {
            result = "Thừa cân";
        } else {
            result = "Béo phì";
        }

        return result;
    }
}
