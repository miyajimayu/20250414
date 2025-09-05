package sample;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Animal {
    String name;
    static int count = 0;

    Animal(String name) {
        this.name = name;
        count++;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
}


public class Curriculum_19 {
    public static void main(String[] args) {
        // Q1: Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力
        Dog dog1 = new Dog("ポチ");
        System.out.println("動物の名前: " + dog1.name);

        Dog dog2 = new Dog("タロウ");
        System.out.println("動物の名前: " + dog2.name);
        
        // Q2: Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力
     
        System.out.println("動物の数: " + Animal.count);

        // 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して出力
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
        String formattedDate = now.format(formatter);
        System.out.println("現在の日時: " + formattedDate);
    }
}



