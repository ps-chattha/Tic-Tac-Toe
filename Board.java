public class Board {
	
	public static char[][] board = new char[3][3];


	public void printBoard() {

		System.out.println(" -------------");
		for (int i = 0; i < 3; i++) {
			System.out.print(" | ");

			for (int j = 0; j < 3; j++) {
	
				System.out.print(board[i][j] + " | ");

			}
			System.out.println("\n -------------");

		}
		

	}
	
	public boolean isFull(int row, int col) {
		if (board[row - 1][col - 1] == 'X' ||
			board[row - 1][col - 1] == 'O') {
			return true;
		}
	
		return false;
	}

	

}

