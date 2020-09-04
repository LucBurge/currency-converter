package converter;
import java.util.Scanner;
public class converter {

	public static void main(String[] args) {
		// method to display the result
		System.out.println("Bitcoin to GBP currency converter:");
		int status;
		status = 1;
		
		do {
		double bitValue, rate;
		System.out.println();
		bitValue = initialMoney();
		rate = exchangeRate();
		double result = conversion(bitValue, rate);
		System.out.println("Your Bitcoin is equivalent to: " + result + " GBP"); 
		
		Scanner repeat = new Scanner(System.in);
		System.out.println("Would you like to convert another value? (1 = yes, 2 = no)");
		int again = repeat.nextInt();
		status = again;
		
		} while(status == 1);
		
		System.out.println("Goodbye!");
		
	}
	
	// method to obtain the sum of money from the user
	static double initialMoney() {
		Scanner money = new Scanner(System.in);
		System.out.println("Enter a Bitcoin value:");
		double bitValue = money.nextDouble();
		return bitValue;
	}
	
	// method to obtain the exchange rate from the user
	static double exchangeRate() {
		Scanner exchange = new Scanner(System.in);
		System.out.println("Enter the current exchange rate (1 Bitcoin = ? GBP)");
		double rate = exchange.nextDouble();
		return rate;
	}
	
	// method to make the conversion
	static double conversion(double bitValueIn, double rateIn) {
		double convertedRate = bitValueIn * rateIn;
		return convertedRate;
	}
	
}
