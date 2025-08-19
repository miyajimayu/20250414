package sample;

import java.util.Random;

public class Curriculum_New_1_18 {

    // Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッド
    public static void printHello(String text, int number) {
        System.out.println("Hello JavaSE 11");
    }

    // Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッド
    public static void multiply(int a, int b) {
        System.out.println("乗算結果: " + (a * b));
    }

    // Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッド
    public static void printIntArray(int[] arr) {
        System.out.println("配列の中身:");
        for (int value : arr) {
            System.out.println(value);
        }
    }

    // Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力
    public static void multiply(double a, double b) {
        System.out.println("小数の和: " + (a + b));
    }

    // Q5：1～100までのランダムな数字を引数の回数分格納して出力し、返す（0は除く）
    public static int[] generateRandomNumbers(int count) {
        Random random = new Random();
        int[] result = new int[count];

        System.out.println("ランダムな数値:");
        for (int i = 0; i < count; i++) {
            int num;
            do {
                num = random.nextInt(101); // 0〜100
            } while (num == 0);
            result[i] = num;
            System.out.println(num);
        }
        return result;
    }

    // Q6：配列の平均値を小数でコンソールに出力
    public static double printAverage(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double avg = sum / arr.length;
        System.out.println("平均値: " + avg);
        return avg;
    }

    // Q7：平均値が50以上ならtrue、そうでなければfalseを出力
    public static boolean isAverageAbove50(double avg) {
        boolean result = avg >= 50;
        System.out.println("平均が50以上か？: " + result);
        return result;
    }

    // メインメソッド：各メソッドの呼び出し例
    public static void main(String[] args) {
        // Q1
        printHello("Java", 11);

        // Q2
        multiply(5, 4);

        // Q3
        int[] numbers = {10, 20, 30, 40};
        printIntArray(numbers);

        // Q4
        multiply(3.5, 2.5);

        // Q5
        int[] randomNumbers = generateRandomNumbers(5);

        // Q6
        double avg = printAverage(randomNumbers);

        // Q7
        isAverageAbove50(avg);
    }
}