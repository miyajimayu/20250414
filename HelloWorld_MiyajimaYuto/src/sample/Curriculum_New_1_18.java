package sample;

import java.util.Random;

public class Curriculum_New_1_18 {

	    
	    // Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッド
	    public static void printMessage(String msg, int num) {
	        System.out.println(msg + " " + num);
	    }

	    // Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッド
	    public static void multiply(int a, int b) {
	        System.out.println("乗算結果: " + (a * b));
	    }

	    // Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッド
	    public static void printArray(int[] arr) {
	        System.out.println("配列の内容:");
	        for (int n : arr) {
	            System.out.println(n);
	        }
	    }

	    // Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力する
	    public static void multiply(double a, double b) {
	        System.out.println("和算結果: " + (a + b));
	    }

	    // Q5：整数を渡すと、1～100までのランダムな数字を引数の回数分格納し出力後に返す
	    public static int[] generateRandomNumbers(int count) {
	        Random rand = new Random();
	        int[] nums = new int[count];
	        System.out.println("ランダムな数値:");
	        for (int i = 0; i < count; i++) {
	            int val;
	            do {
	                val = rand.nextInt(100) + 1; // 1～100
	            } while (val == 0); // 念のため0除外
	            nums[i] = val;
	            System.out.println(val);
	        }
	        return nums;
	    }

	    // Q6：Q5の返り値を受け取り平均値を出力する
	    public static double calcAverage(int[] arr) {
	        double sum = 0;
	        for (int n : arr) {
	            sum += n;
	        }
	        double avg = sum / arr.length;
	        System.out.println("平均値: " + avg);
	        return avg;
	    }

	    // Q7：Q6の返り値を受け取り、50以上ならtrueそれ以外はfalseを返しコンソールに出力する
	    public static boolean checkOver50(double avg) {
	        boolean result = avg >= 50;
	        System.out.println("50以上か？ : " + result);
	        return result;
	    }

	    public static void main(String[] args) {
	        // Q1
	        printMessage("Hello JavaSE", 11);

	        // Q2
	        multiply(3, 4);

	        // Q3
	        int[] sampleArray = {1, 2, 3, 4, 5};
	        printArray(sampleArray);

	        // Q4
	        multiply(3.5, 2.5);

	        // Q5
	        int[] randomNums = generateRandomNumbers(5);

	        // Q6
	        double avg = calcAverage(randomNums);

	        // Q7
	        checkOver50(avg);
	    }
	}
