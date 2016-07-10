import static java.lang.System.out;
import java.util.Scanner;
import java.text.NumberFormat;
public class Room {
	private int guests;
	private double rate;
	private boolean smoking;
	private static NumberFormat currency = NumberFormat.getCurrencyInstance();
	
	public void readRoom (Scanner diskSkanner){
		guests = diskSkanner.nextInt();
		rate = diskSkanner.nextDouble();
		smoking = diskSkanner.nextBoolean();
	}
	public void writeRoom(){
		out.print(guests);
		out.print("\t");
		out.print(currency.format(rate));
		out.print("\t");
		out.print(smoking ? "yes" : "no");
	}
}
