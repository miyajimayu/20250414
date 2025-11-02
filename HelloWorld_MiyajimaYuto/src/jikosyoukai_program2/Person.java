package jikosyoukai_program2;

class Person {
	  private String name;
	  private int age;
	  private double height;
	  private double weight;

	  // 【問題1】クラスフィールド定義
	  static int count = 0;

	  // コンストラクタ
	  Person(String name, int age, double height, double weight) {
	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;

	    // 【問題2】インスタンスが作られるたびにcountを1増やす
	    count++;
	  }

	  public double bmi() {
	    return this.weight / this.height / this.height;
	  }

	  public void print() {
	    System.out.println("名前は" + this.name + "です");
	    System.out.println("年は" + this.age + "です");
	    System.out.println("BMIは" + String.format("%.1f", this.bmi()) + "です");
	    System.out.println();
	  }

	  // 【問題4・5】クラスメソッド定義
	  public static void printCount() {
	    System.out.println("合計" + count + "人です");
	  }
	}