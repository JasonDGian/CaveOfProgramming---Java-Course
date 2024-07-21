package lesson_12;

public class Application {

	public static void main(String[] args) {

		int[][] grid1 = new int[3][2];

		int[][] grid2 = { { 1, 3, 5, 7, 9 }, { 2, 4, 6 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9 } };

		String[][] texts = new String[2][3];

		texts[0][0] = "Hello";
		texts[0][1] = "Good Morning";
		texts[0][2] = "Good Evening";
		texts[1][0] = "Goodbye";
		texts[1][1] = "See you soon";
		texts[1][2] = "Farewell";

		System.out.println(texts[0][1]);

		for (int row = 0; row < texts.length; row++) {

			for (int col = 0; col < texts[row].length; col++) {

				System.out.print(texts[row][col] + "\t");

			}
			System.out.println();

		}
		
		
		for (int row = 0; row < grid2.length; row++) {

			for (int col = 0; col < grid2[row].length; col++) {

				System.out.print(grid2[row][col] + "\t");

			}
			System.out.println();

		}

	}

}
