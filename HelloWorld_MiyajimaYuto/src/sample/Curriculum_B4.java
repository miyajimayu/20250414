package sample;

import java.util.Random;
import java.util.Scanner;

public class Curriculum_B4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("商品を「、」区切りで入力してください：");
		String input = sc.nextLine();
		String[] products = input.split("、");

		for (String product : products) {
			product = product.trim(); // 前後の空白除去

			int stock = rand.nextInt(12); // 0〜11のランダムな数
			String message;

			switch (product) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				message = product + "の残り台数は" + stock + "台です";
				break;

			case "テレビ":
			case "ディスプレイ":
				// ディスプレイの場合は、最大11からランダム値を引いた残数
				int result = product.equals("ディスプレイ") ? 11 - rand.nextInt(12) : stock;
				message = product + "の残り台数は" + result + "台です";
				break;

			default:
				message = "『 " + product + " 』は指定の商品ではありません";
				break;
			}

			System.out.println(message);
		}

		sc.close();
	}
}
