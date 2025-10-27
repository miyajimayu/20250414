package curriculum_1_27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Animal {
	private String name;       // 動物名
	private double length;     // 体長 (m)
	private int speed;         // 速度 (km/h)
	private String scientificName; // 学名

	public Animal(String name, double length, int speed, String scientificName) {
		this.name = name;
		this.length = length;
		this.speed = speed;
		this.scientificName = scientificName;
	}

	public void printInfo() {
		System.out.println("動物名：" + name);
		System.out.println("体長：" + length + "m");
		System.out.println("速度：" + speed + "km/h");
		System.out.println("学名：" + scientificName);
		System.out.println();
	}
}

public class c1_27 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("コンソールに文字を入力してください");
		// ユーザーから入力を受け取る
		String input = scanner.nextLine();

		// 学名辞書（必要に応じて拡張可能）
		Map<String, String> scientificNames = new HashMap<>();
		scientificNames.put("ライオン", "パンテラ レオ");
		scientificNames.put("ゾウ", "ロキソドンタ・サイクロティス");
		scientificNames.put("パンダ", "アイルロポダ・メラノレウカ");
		scientificNames.put("チンパンジー", "パン・トゥログロディテス");
		scientificNames.put("シマウマ", "チャップマンシマウマ");
		scientificNames.put("インコ", "不明");

		// 入力文字列を分解してオブジェクト生成
		List<Animal> animals = new ArrayList<>();
		String[] animalDataList = input.split(",");

		for (String animalData : animalDataList) {
			String[] parts = animalData.split(":");
			if (parts.length != 3) {
				System.out.println("入力形式が不正です: " + animalData);
				continue;
			}
			String name = parts[0];
			double length = Double.parseDouble(parts[1]);
			int speed = Integer.parseInt(parts[2]);
			String sciName = scientificNames.getOrDefault(name, "不明");

			animals.add(new Animal(name, length, speed, sciName));
		}

		// 出力
		System.out.println(); // 空行
		for (Animal animal : animals) {
			animal.printInfo();
		}

		scanner.close();
	}
}
