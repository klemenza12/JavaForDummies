import static java.lang.System.out;
import java.util.Scanner;
public class JustSwitch {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		out.print("Which verse ? ");
		int verse = keyboard.nextInt();
		switch (verse) {
		case 1:
			System.out.println("That's because he has no brain");
			break;
		case 2:
			System.out.println("That's because he is pain");
			break;
		case 3:
			System.out.println(", Cause this is the last refrain");
			break;	
		default:
			System.out.println("No such verse. Please try again.");
			break;
		}
		out.println("Ohhhhh .  .  .  .");
	}

}
