import java.util.Scanner;
public class LoanComparison {

	public static void main(String[] args) {
		//Initialize the necessary variables.
		Scanner input = new Scanner(System.in);
		double intrestRate = 5.0;
		double monthlyPayment;
		double totalPayment;
		double i, n;
		int placeHolder;
		
		//Prompt user input, gather the input, and print the column heading.
		System.out.print("\nLoan Amount: ");
		double amount = input.nextDouble();
		System.out.print("\nNumber of Years: ");
		int years = input.nextInt();
		System.out.println("Interest_Rate___Monthly Payment___Total_Payment");
		
		//Use a for loop to calculate for each of the possible intrest rates.
		for (intrestRate = 5.0; intrestRate <= 8.0; intrestRate+=0.125) {
			totalPayment = amount * (1+(intrestRate/100));
			//Calculate the values of i and n, then use them to calculate the monthly payment.
			i = intrestRate / 100 / 12;
			n = years * 12;
			monthlyPayment = (amount * (i * (Math.pow(1 + i, n) ))) / (Math.pow(1 + i, n) - 1);
			
			//Calculate the value of the totalPayment, then round monthlyPayment and totalPayment to two decimal places.
			totalPayment = years * 12 * monthlyPayment;
			placeHolder = (int) (totalPayment *100);
			totalPayment = (double) (placeHolder) / 100;
			placeHolder = (int) (monthlyPayment *100);
			monthlyPayment = (double) (placeHolder) / 100;
			totalPayment = (int)(totalPayment * 100) / 100.0;
			
			//Use an if/else if/ else to format the output correctly.
			if (intrestRate % 0.5 == 0) {
				System.out.println(intrestRate + "%____________" + (monthlyPayment) + "____________" + (totalPayment));
			}
			else if (intrestRate % 0.25 == 0) {
				System.out.println(intrestRate + "%___________" + (monthlyPayment) + "____________" + (totalPayment));
			}
			else {
				System.out.println(intrestRate + "%__________" + (monthlyPayment) + "____________" + (totalPayment));
			}
		}

	}

}
