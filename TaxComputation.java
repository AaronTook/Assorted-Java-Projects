import java.util.Scanner;

public class TaxComputation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 0 for single filers, 1 for married filing jointly, 2 for married filing separately, and 3 for head of household: ");
		int filingStatus = input.nextInt();
		System.out.println("Enter the taxable income: ");
		int income = input.nextInt();
		double amountDue = 0.0;
		int teir1, teir2, teir3, teir4, teir5;
		System.out.println("Input accepted.");
		switch(filingStatus) {
			case 0:
				teir1 = 8350;
				teir2 = 33950;
				teir3 = 82250;
				teir4 = 171550;
				teir5 = 372950;
				if (income <= teir1) {
					amountDue += income * 0.1;
				}
				else {
					amountDue += teir1 * 0.1;
					if (income <= teir2) {
						amountDue += (income - teir1) * 0.15;
					}
					else {
						amountDue += (teir2 - teir1) * 0.15;
						if (income <= teir3) {
							amountDue += (income - teir2) * 0.25;
						}
						else {
							amountDue += (teir3 - teir2) * 0.25;
							if (income <= teir4) {
								amountDue += (income - teir3) * 0.28;
							}
							else {
								amountDue += (teir4 - teir3) * 0.28;
								if (income <= teir5) {
									amountDue += (income - teir4) * 0.33;
								}
								else {
									amountDue += (teir5 - teir4) * 0.33;
									amountDue += (income - teir5) * 0.35; 
								}}}}}
				break;
			case 1:
				teir1 = 16700;
				teir2 = 67900;
				teir3 = 137050;
				teir4 = 208850;
				teir5 = 372950;
				if (income <= teir1) {
					amountDue += income * 0.1;
				}
				else {
					amountDue += teir1 * 0.1;
					if (income <= teir2) {
						amountDue += (income - teir1) * 0.15;
					}
					else {
						amountDue += (teir2 - teir1) * 0.15;
						if (income <= teir3) {
							amountDue += (income - teir2) * 0.25;
						}
						else {
							amountDue += (teir3 - teir2) * 0.25;
							if (income <= teir4) {
								amountDue += (income - teir3) * 0.28;
							}
							else {
								amountDue += (teir4 - teir3) * 0.28;
								if (income <= teir5) {
									amountDue += (income - teir4) * 0.33;
								}
								else {
									amountDue += (teir5 - teir4) * 0.33;
									amountDue += (income - teir5) * 0.35; 
								}}}}}
				break;
			case 2:
				teir1 = 8350;
				teir2 = 33950;
				teir3 = 68525;
				teir4 = 104425;
				teir5 = 168475;
				if (income <= teir1) {
					amountDue += income * 0.1;
				}
				else {
					amountDue += teir1 * 0.1;
					if (income <= teir2) {
						amountDue += (income - teir1) * 0.15;
					}
					else {
						amountDue += (teir2 - teir1) * 0.15;
						if (income <= teir3) {
							amountDue += (income - teir2) * 0.25;
						}
						else {
							amountDue += (teir3 - teir2) * 0.25;
							if (income <= teir4) {
								amountDue += (income - teir3) * 0.28;
							}
							else {
								amountDue += (teir4 - teir3) * 0.28;
								if (income <= teir5) {
									amountDue += (income - teir4) * 0.33;
								}
								else {
									amountDue += (teir5 - teir4) * 0.33;
									amountDue += (income - teir5) * 0.35; 
								}}}}}
				break;
			case 3:
				teir1 = 11950;
				teir2 = 45500;
				teir3 = 117450;
				teir4 = 190200;
				teir5 = 372950;
				if (income <= teir1) {
					amountDue += income * 0.1;
				}
				else {
					amountDue += teir1 * 0.1;
					if (income <= teir2) {
						amountDue += (income - teir1) * 0.15;
					}
					else {
						amountDue += (teir2 - teir1) * 0.15;
						if (income <= teir3) {
							amountDue += (income - teir2) * 0.25;
						}
						else {
							amountDue += (teir3 - teir2) * 0.25;
							if (income <= teir4) {
								amountDue += (income - teir3) * 0.28;
							}
							else {
								amountDue += (teir4 - teir3) * 0.28;
								if (income <= teir5) {
									amountDue += (income - teir4) * 0.33;
								}
								else {
									amountDue += (teir5 - teir4) * 0.33;
									amountDue += (income - teir5) * 0.35; 
								}}}}}
				break;
			default:
				System.out.println("Please try again with a correct value!");
				System.exit(1);
		
		}
		System.out.print("The amount to be paid in Personal Federal taxes is: ");
		System.out.println("$" + amountDue);

	}

}
