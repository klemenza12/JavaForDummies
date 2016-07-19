import static java.lang.System.out;
public class GoodNightSleepB {

	public static void main(String[] args) {
		out.print("Excuse me while I nap");
		out.println("for just five seconds ....");
		try{
			takeNap();
		}catch(InterruptedException e){
			out.println("Hey, who woke me up ? ");
		}
		out.print("Ah, that was refreshing.");
	}
	public static void takeNap() throws InterruptedException{
		Thread.sleep(5000);
	}
}
