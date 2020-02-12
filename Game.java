import java.util.Scanner;

public class Game implements global{

	Board map = new Board();
	Block box = new Block();
	Scanner input = new Scanner(System.in);
	char[][] board = Board.board;
	HumanPlayer H = new HumanPlayer();
	AIPlayer A = new AIPlayer();
	int n=0, row, col;
	String p,p1,p2,pw;

	public void start() {

		System.out.println(m);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '*';
			}
		}
	
		System.out.println("\nHere is the board-");
		map.printBoard();
		
		System.out.println("Press 1 to play against Human(Other Players).\nPress 2 to play against Computer(AI player).");	
		int a = input.nextInt();
		
		switch(a){
			case 1:
				H.begin();
				break;
			case 2:
				A.begin();	
				break;
			default:
				System.out.println("Enter the valid input.");
		}
		
		if (a==1){
			
			p1 = H.getName("1");
			p2 = H.getName("2");
		}
		else if (a==2) {
			p = A.getName();
		}
		else {
			System.out.println("\n");
		}
		
		while (Winner()) 
		{
			if (a==1) {
				if(n%2 == 0) {
					System.out.println("Turn of "+p1+" with symbol X ....."); 
				}
				else {
					System.out.println("Turn of "+p2+" with symbol O .....");  
				}
				
				row = H.getMove("row");
				col = H.getMove("Col");
			}
			
			if (a==2) {
				if(n%2 == 0) {
					System.out.println("Turn of "+p+" with symbol X .....");
					//+p);	
					row = H.getMove("row");
					col = H.getMove("Col");
				}
				else {									 
						row = A.getMove();
						col = A.getMove();				
				}
				//r.nextInt(3);
			}
			
			if (row > 3 || col > 3) {
				System.out.println("Your inputed place is out of the board!\nGo try again!");

			}

			else {
				if (isFull(row, col)) {
					if (n%2==0)
						System.err.println("The place is already taken");
					else
						System.err.println("");
				}
				else {
					++n;
					board[row - 1][col - 1] = box.getTurn();
					map.printBoard();
					box.whichPlayer();
				}

			}

		}
			box.whichPlayer();
			if(a==1) {
				if (n%2==0)
					pw=p2;
				else
					pw=p1;
			}
			
			if(a==2) {
				if (n%2==0)
					pw="Computer";
				else
					pw=p;
			}
			
			
			System.out.println("The winner is " + pw +" with symbol "+box.getTurn());
	}

	public boolean isFull(int row, int col) {
		if (board[row - 1][col - 1] == 'X' ||
			board[row - 1][col - 1] == 'O') {
			return true;
		}
	
		return false;
	}
	
	public boolean Winner() {

		if (board[0][0] != '*' && board[0][0] == board[0][1] && board[0][0] == board[0][2])
			return false;
		if (board[1][0] != '*' && board[1][0] == board[1][1] && board[1][0] == board[1][2])
			return false;
		if (board[2][0] != '*' && board[2][0] == board[2][1] && board[2][0] == board[2][2])
			return false;
		if (board[0][0] != '*' && board[0][0] == board[1][0] && board[0][0] == board[2][0])
			return false;
		if (board[0][1] != '*' && board[0][1] == board[1][1] && board[0][1] == board[2][1])
			return false;
		if (board[0][2] != '*' && board[0][2] == board[1][2] && board[0][2] == board[2][2])
			return false;
		if (board[0][0] != '*' && board[0][0] == board[1][1] && board[0][0] == board[2][2])
			return false;
		if (board[0][2] != '*' && board[0][2] == board[1][1] && board[0][2] == board[2][0])
			return false;

		return true;
	}

	
	
	public boolean OutOfBoard(int row, int col) {
		if (row > 3 || col > 3) {
			System.err.println("There is no row or column");
			return true;

		}
		return false;

	}
	
	

}

