import java.util.Scanner;

public class HumanPlayer extends player {
	Scanner sc = new Scanner(System.in);
	
	public HumanPlayer() {
		
	}
	
	public void begin() {
		System.out.println("Hello this is Human VS Human (2 Players) game.");	
	}

	public String getName(final String b) {
		System.out.println("Enter name of the Player" + b + ": ");
		final String a = sc.nextLine();
		return a;
	}

	public int getMove(final String r) {
		System.out.println("Enter the number of " + r + ": ");
		final int a = sc.nextInt();
		return a;
	}
	
}
	
	


