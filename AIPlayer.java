import java.util.Scanner;
import java.util.Random;

public class AIPlayer {
	
	Scanner sc = new Scanner(System.in);
	Random rand = new Random(); 
	

	public void begin() {
		System.out.println("Hello this is Human VS Computer (AI Player) game.");	
	}
	
	public String getName() {
		System.out.println("Enter name of the Player: ");
		String a = sc.nextLine();
		return a;
	}
	
	public int getMove() {
		int a = rand.nextInt(3);
		return a+1;
	}
	
}

