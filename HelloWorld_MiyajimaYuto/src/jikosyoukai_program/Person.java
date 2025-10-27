package jikosyoukai_program;

public class Person {
	// インスタンスフィールドを定義【問題1・4】

	String name; // 名前
	int age; // 年齢
	double height; // 身長
	double weight; // 体重

	// 人数カウント用のstaticフィールド（問題10用）
	static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット【問題2・3・4】
	public Person(String name, int age, double height, double weight) {
		// 【問題3】各インスタンスフィールドに値をセット
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// 人数カウント
		count++;
	}

	// 【問題6・7】BMI計算メソッド
	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	// 【問題8・9】情報出力メソッド
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + this.bmi() + "です");
		System.out.println(); // 改行
	}

	// 【問題10】人数の合計を出力するメソッド
	public static void printCount() {
		System.out.println("合計" + count + "人です");
	}

}