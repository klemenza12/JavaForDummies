import static java.lang.System.out;

public class UseAccount {
	public static void main(String[] args) {
		Account myAccount   = new Account();
		Account yourAccount = new Account();
		myAccount.setName("Barry burd");
		myAccount.setAddress("222 Cyberspace Lane");
		myAccount.setBalance(22.02);
		yourAccount.setName("Jane Q. Public");
		yourAccount.setAddress("111 Consumer Street");
		yourAccount.setBalance(55.63);
		double myInterestsAmount   = myAccount.getInterests(5.00);
		double yourInterestsAmount = yourAccount.getInterests(7.00);
		
		myAccount.display();
		out.println();
		out.print("plus $");
		out.print(myInterestsAmount);
		out.println(" interests");
		
		yourAccount.display();
		out.println();
		out.print("plus $");
		out.printf("$%4.2f\n", myInterestsAmount);
		out.printf("$%5.2f\n", myInterestsAmount);
		out.printf("$%.2f\n",  myInterestsAmount);
		out.printf("$%3.2f\n", myInterestsAmount);
		out.printf("$%.2f $%.2f", yourInterestsAmount, myInterestsAmount);
		
		out.print(yourInterestsAmount);
		out.println(" interests ");
	}

}
