package sample;

public class curriculum_B3 {


	public static void main(String[] args) {

		int[][] num = new int[20][9];

		for (int i = 0; i < 20; i++) { // (初期化式; 条件式; 変化式)
			for(int j = 0; j < 9; j++) {
				num[i][j] = (i + 1) * (j + 1);

			}
		}


		for (int i = 0; i < 20; i++) { // (初期化式; 条件式; 変化式)
			for(int j = 0; j < 9; j++) {
				
				
				
				

				System.out.printf("%03d * %03d = %03d||\t", (i + 1), (j + 1),num[i][j]);
			}
			System.out.println();

		}
	}


}