package sample;

public class Hensuu1 {
	public static void main(String[] args) {
		//ローカル変数として宣言
		byte byteNum;
		short shNum;
		int intNum;
		long longNum;
		float flNum;
		double douNum;
		char chaNum;
		String aisatu;
		boolean booNum;

		//それぞれのローカル変数をローカル内で初期値を代入市初期化
		byteNum = 0;
		shNum = 0;
		intNum = 0;
		longNum = 0L;
		flNum = 0.0f;
		douNum = 0.0;
		chaNum = '\u0000';
		aisatu = "null";
		booNum = false;

		//変数に指定の値を代入
		byteNum = 10;
		shNum = 100;
		intNum = 1000;
		longNum = 10000;
		flNum = 9.5f;
		douNum = 10.5;
		chaNum = 'a';
		aisatu = "ハロー";
		booNum = true;

		//指定された値をコンソールに出力する
		System.out.println(byteNum + shNum + intNum + longNum);

		System.out.println(byteNum * 2);

		System.out.println(chaNum + aisatu + booNum);

		System.out.println(byteNum + shNum + intNum + longNum + flNum + douNum);

		System.out.println(byteNum * shNum * intNum * longNum);

		System.out.println(douNum / shNum);

		System.out.println(byteNum - shNum);

		//正しく動作するように修正
		String num = "ハロー JAVA";
		int num1 = 43;
		System.out.println(num + num1);

		//ローカル変数の代入
		String strNum1 = "山田太郎";
		String strNum2 = "寿司";

		int intNum1 = 18;
		double douNum1 = 170.5;
		double douNum2 = 62.2;
		double douNum3 = 1.705;

		System.out.println("初めまして" + strNum1 + "です");

		System.out.println("年齢は" + intNum1 + "歳です");

		System.out.println("身長は" + douNum1 + "cmです");

		System.out.println("体重は" + douNum2 + "kgです");

		System.out.println("好きな食べ物は" + strNum2 + "です");

		double bmi = douNum2 / (douNum3 * douNum3);

		System.out.printf("BMIは %.1f です\n", bmi);

		//再代入
		strNum1 = "鈴木一朗";
		strNum2 = "オムライス";

		intNum1 = 24;
		douNum1 = 168.5;
		douNum2 = 64.2;
		douNum3 = 1.685;

		System.out.println("初めまして" + strNum1 + "です");

		System.out.println("年齢は" + intNum1 + "歳です");

		System.out.println("身長は" + douNum1 + "cmです");

		System.out.println("体重は" + douNum2 + "kgです");

		System.out.println("好きな食べ物は" + strNum2 + "です");

		double bmi1 = douNum2 / (douNum3 * douNum3);

		System.out.printf("BMIは %.1f です\n", bmi1);

		//数値を和算で自己代入

		intNum1 = intNum1 + intNum1;
		douNum1 = douNum1 + douNum1;
		douNum2 = douNum2 + douNum2;
		douNum3 = douNum3 + douNum3;

		System.out.println("初めまして" + strNum1 + "です");

		System.out.println("年齢は" + intNum1 + "歳です");

		System.out.println("身長は" + douNum1 + "cmです");

		System.out.println("体重は" + douNum2 + "kgです");

		System.out.println("好きな食べ物は" + strNum2 + "です");

		double bmi2 = douNum2 / (douNum3 * douNum3);

		System.out.printf("BMIは %.1f です\n", bmi2);

		//年齢が25歳以上ならtrueが出力される

		String result = intNum1 > 24 ? "true" : "fales";

		System.out.println(result); //true

		//文字列型に型変換する
		intNum1 = 24;
		douNum1 = 168.5;
		douNum2 = 64.2;

		String nenrei = String.valueOf(intNum1);
		System.out.println("年齢は" + nenrei + "です");

		String sinntyou = String.valueOf(douNum1);
		System.out.println("身長は" + sinntyou + "cmです");

		String taijuu = String.valueOf(douNum2);
		System.out.println("体重は" + taijuu + "kgです");

		//整数型に変換
		int suuji = Integer.parseInt(nenrei);
		System.out.println("年齢は" + suuji + "です");

		double takasa = Double.parseDouble(sinntyou);
		System.out.println("身長は" + takasa + "cmです");
		//年齢25もしくは身長が160以上
		boolean tosi = (suuji == 25);
		boolean saizu = (takasa >= 160);

		String result1 = !tosi ? "true" : saizu ? "true" : "false";
		System.out.println(result1);

	}
}
