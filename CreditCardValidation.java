import java.util.Scanner;
public class CreditCardValidation {
	
	public static long reverseNum(long num) {
		String reversedString, regularString;
		regularString = num+"";
		int stringLen = regularString.length();
		long reversedNum;
		int i;
		reversedString = "";
		for (i=0; i < stringLen; i++) {
			reversedString = regularString.charAt(i) + reversedString;
		}
		reversedNum = Long.valueOf(reversedString);
		return reversedNum;
	}
	public static int getSumOfEverySecond(long num) {
		int i,val,sum;
		sum = 0;
		String regularString = num+"";
		for (i=0; i< regularString.length();i++) {
			if (i %2 == 1) {
				val = ((((int) regularString.charAt(i) )-48) * 2);
				if (val >= 10) {
					val = (val%10) + ((val-(val%10))/10);
				}
				sum += val;
			}
		}
		return sum;
	}
	public static int getSumOfEveryFirst(long num) {
		int i,val,sum;
		sum = 0;
		String regularString = num+"";
		for (i=0; i< regularString.length();i++) {
			if (i %2 == 0) {
				val = ((((int) regularString.charAt(i) )-48));
				
				sum += val;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a credit card number as a long integer: ");
		long cardNum = input.nextLong();
		long reversed = reverseNum(cardNum);
		if ((getSumOfEverySecond(reversed) + getSumOfEveryFirst(reversed)) % 10 == 0) {
			System.out.println(cardNum + " is valid");
		}
		else {
			System.out.println(cardNum + " is invalid");
		}
	}
}
