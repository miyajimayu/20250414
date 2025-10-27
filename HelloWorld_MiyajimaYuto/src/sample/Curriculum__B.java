package sample;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Curriculum__B {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Scannerオブジェクトを作成

		System.out.print("ユーザー名を入力してください: "); // プロンプト表示
		boolean nameFlag = false;
		String userName = ""; // nextLine()で一行分の文字列を読み込む

		Random random = new Random();
		while (!nameFlag) {
			userName = scanner.nextLine();
			if (!nameCheck(userName)) {
				continue;
			}

			System.out.printf("ユーザー名「%s」を登録しました%n", userName);
			// ・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
			nameFlag = true;
		}
		String[] handArray = {
				"グー", "チョキ", "パー"
		};
		boolean flag = false;
		int cnt = 0;
		while (!flag) {

			// nameの手は「パー」
			String myHand = scanner.nextLine();
			int myHandNo = Integer.parseInt(myHand);
			System.out.printf("%sの手は「%s」%n", userName, handArray[myHandNo]);

			int cpu = random.nextInt(3);
			System.out.printf("相手の手は「%s」%n", handArray[cpu]);
			cnt++;

			if (myHandNo == cpu) {
				System.out.println("DRAW あいこ　もう一回しましょう！");

			} else if ((myHandNo == 1 && cpu == 0) || (myHandNo == 2 && cpu == 1) || (myHandNo == 0 && cpu == 2)) {
				switch (cpu) {
				case 0:
					System.out.println("俺の勝ち！\n" + "負けは次につながるチャンスです！\n" + "ネバーギブアップ！\n");
					break;
				case 1:
					System.out.println("俺の勝ち！\n" + "たかがじゃんけん、そう思ってないですか？\n" + "それやったら次も、俺が勝ちますよ\n");
					break;
				case 2:
					System.out.println("俺の勝ち！\n" + "なんで負けたか、明日まで考えといてください。\n" + "そしたら何かが見えてくるはずです\n");
					break;
				}
			} else {
				System.out.println("やるやん。\n" + "次は俺にリベンジさせて\n");
				System.out.printf("勝つまでにかかった合計回数は%d回です\n", cnt);

				flag = true;
			}
		}

		scanner.close();
		// Scannerオブジェクトをクローズ
	}

	private static Boolean nameCheck(String userName) {

		if (userName.length() > 10) {
			System.out.println("名前を10文字以内にしてください");
			return false;
		}
		//ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください

		if (Objects.isNull(userName) || userName.isEmpty()) {
			System.out.println("名前を入力してください");
			return false;
			//ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		}

		if (!userName.matches("^[A-Za-z0-9]+$")) {

			System.out.println("「半角英数字のみで名前を入力してください」");
			return false;
			// ・ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
		}
		return true;
	}

}
