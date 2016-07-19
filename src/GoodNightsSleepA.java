import static java.lang.System.out;
public class GoodNightsSleepA {

	public static void main(String[] args) {
		out.print("Excuse me while I nap");
		out.println("for just five seconds ....");
		takeNap();
		out.print("Ah, that was refreshing.");
	}
	static void takeNap(){
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			out.println("Hey, who woke me up ? ");
		}
	}

}
