package sample;

import java.util.Scanner;

public class Curriculum_B5 {



	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N;
		do {
			System.out.print("生徒の人数を入力してください: ");
			N = scanner.nextInt();
		} while (N < 1);  // 必ず1回以上実行

		// 点数を保存する配列: [生徒数][4教科]
		int[][] scores = new int[N][4];
		double[] subjectAverages = new double[4];  // 各教科の平均
		String[] subjects = {"英語", "数学", "理科", "社会"};

		// 各生徒の点数を入力
		for (int i = 0; i < N; i++) {
			System.out.println((i + 1) + "人目の生徒の点数を入力してください:");
			for (int j = 0; j < 4; j++) {
				System.out.print(subjects[j] + ": ");
				scores[i][j] = scanner.nextInt();
				subjectAverages[j] += scores[i][j];
			}
		}

		System.out.println("\n【各生徒の平均点】");
		double totalAverage = 0;
		for (int i = 0; i < N; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += scores[i][j];
			}
			double average = (double) sum / 4;
			totalAverage += average;
			System.out.printf("%d人目の平均点: %.2f\n", i + 1, average);
		}

		System.out.println("\n【各教科の平均点】");
		for (int j = 0; j < 4; j++) {
			subjectAverages[j] /= N;
			System.out.printf("%sの平均点: %.2f\n", subjects[j], subjectAverages[j]);
		}

		System.out.printf("\n【全体の平均点】: %.2f\n", totalAverage / N);

		scanner.close();
	}
}

