package sample;

public class curriculum_B2 {

	

	    public static void main(String[] args) {
	        int[][] multiplicationTable = new int[9][9];

	        // 九九の計算と結果の格納
	        for (int i = 0; i < 9; i++) {
	            for (int j = 0; j < 9; j++) {
	                multiplicationTable[i][j] = (i + 1) * (j + 1);
	            }
	        }

	        // 九九の表と計算式を表示
	        for (int i = 0; i < 9; i++) {
	            for (int j = 0; j < 9; j++) {
	            	
	            
	            	
	                System.out.printf("%02d * %02d = %02d||\t", (i + 1), (j + 1), multiplicationTable[i][j]);
	            }
	            System.out.println(); // 行ごとに改行
	        }
	    }
	}
