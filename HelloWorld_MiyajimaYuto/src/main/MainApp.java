package main;

import java.util.Scanner;

import character.Hero;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("名前を入力してください: ");
        String inputName = scanner.nextLine();

        try {
            Hero hero = new Hero(inputName);
            hero.showStatus();
            hero.startAdventure();
        } catch (IllegalArgumentException e) {
            System.out.println("エラー: " + e.getMessage());
        }

        scanner.close();
    }
}
