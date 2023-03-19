
import java.util.Scanner;

public class MakeChangeProject {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		double itemPrice = 0.0;
		double moneyRecieved = 0.0;
		
		System.out.println("What is the price of the item?");
		itemPrice = kb.nextDouble();
		System.out.println("How much money did the customer give you?");
		moneyRecieved = kb.nextDouble();
		
		double changeReturned = moneyRecieved - itemPrice;
	
		if(itemPrice == moneyRecieved) {
			System.out.println("No change need! Thank you have a nice day!");
		} else if(moneyRecieved < itemPrice) {
			System.err.println("Ask customer for the appropriate amount");
		} else {
		changeReturned = Math.round(changeReturned * 100.0) / 100.0;
		 System.out.print("Please return: $" + changeReturned + " = ");
		 exactChange(changeReturned);
		}
		kb.close();
	}
	
	public static double exactChange(double changeReturned) { 
		int twenty;
		int ten;
		int five;
		int dollars;
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		
		twenty = (int)(changeReturned / 20);
		changeReturned -= twenty * 20;
		ten = (int)(changeReturned / 10);
		changeReturned -= ten * 10;
		five = (int)(changeReturned / 5);
		changeReturned -= five * 5;
		dollars = (int) (changeReturned /1);
		changeReturned -= dollars * 1;
		quarters = (int)(changeReturned / 0.25); 
		changeReturned -= quarters * 0.25;
		dimes = (int)(changeReturned / .10);
		changeReturned -= dimes * 0.10;
		nickels = (int)(changeReturned / .05);
		changeReturned -= nickels * .05;
		pennies = (int)Math.round(changeReturned / .01);
		
		if( twenty != 0 ) {
			System.out.print(twenty + " twenties ");
		}
		if(ten != 0) {
			System.out.print(ten + " ten(s) ");
		}
		if(five != 0) {
			System.out.print(five + " five(s) ");
		}
		if(dollars != 0) {
			System.out.print(dollars + " dollar(s) ");
		}
		if(quarters != 0) {
			System.out.print(quarters + " quarter(s) ");
		}
		if(dimes != 0) {
			System.out.print(dimes + " dime(s) ");
		}
		if(nickels !=0) {
			System.out.print(nickels + " nickel(s) ");
		}
		if(pennies != 0) {
			System.out.print(pennies + " pennies ");
		}
			
		return changeReturned;
	} 
}
