package sample;

import java.util.Random;


public class curriculum_B4 {

	


	    public static void main(String[] args) {
	        String input = "パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品";
	        String[] items = input.split("、");

	        Random rand = new Random();
	        int tvStock = rand.nextInt(12); // 0〜11のランダムな数値（テレビ・ディスプレイ共通）

	        for (String item : items) {
	            switch (item) {
	                case "パソコン":
	                    System.out.println("パソコンの残り台数は" + rand.nextInt(12) + "台です");
	                    break;
	                case "冷蔵庫":
	                    System.out.println("冷蔵庫の残り台数は" + rand.nextInt(12) + "台です");
	                    break;
	                case "扇風機":
	                    System.out.println("扇風機の残り台数は" + rand.nextInt(12) + "台です");
	                    break;
	                case "洗濯機":
	                    System.out.println("洗濯機の残り台数は" + rand.nextInt(12) + "台です");
	                    break;
	                case "加湿器":
	                    System.out.println("加湿器の残り台数は" + rand.nextInt(12) + "台です");
	                    break;
	                case "テレビ":
	                case "ディスプレイ":
	                    int stock = item.equals("ディスプレイ") ? 11 - rand.nextInt(12) : tvStock;
	                    System.out.println(item + "の残り台数は" + stock + "台です");
	                    break;
	                default:
	                    System.out.println("『 " + item + " 』は指定の商品ではありません");
	            }
	        }
	    }
	}