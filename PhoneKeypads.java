import java.util.Scanner;
public class PhoneKeypads {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter (A... Z): ");
		String num = input.next();
		num = num.toUpperCase();
		if (num.charAt(0) == '1')  {
			System.out.println("The corresponding digit is decimal 1 or binary 0001");
		}
		else if ((num.charAt(0) == 'A') || (num.charAt(0) == 'B') || (num.charAt(0) == 'C') || (num.charAt(0) == '3'))  {
			System.out.println("The corresponding digit is decimal 2 or binary 0010");
		}
		else if ((num.charAt(0) == 'D') || (num.charAt(0) == 'E') || (num.charAt(0) == 'F') || (num.charAt(0) == '3'))  {
			System.out.println("The corresponding digit is decimal 3 or binary 0011");
		}
		else if ((num.charAt(0) == 'G') || (num.charAt(0) == 'H') || (num.charAt(0) == 'I') || (num.charAt(0) == '4'))  {
			System.out.println("The corresponding digit is decimal 4 or binary 0100");
		}
		else if ((num.charAt(0) == 'J') || (num.charAt(0) == 'K') || (num.charAt(0) == 'L') || (num.charAt(0) == '5'))  {
			System.out.println("The corresponding digit is decimal 5 or binary 0101");
		}
		else if ((num.charAt(0) == 'M') || (num.charAt(0) == 'N') || (num.charAt(0) == 'O') || (num.charAt(0) == '6'))  {
			System.out.println("The corresponding digit is decimal 6 or binary 0110");
		}
		else if ((num.charAt(0) == 'P') || (num.charAt(0) == 'Q') || (num.charAt(0) == 'R') || (num.charAt(0) == 'S') || (num.charAt(0) == '7'))  {
			System.out.println("The corresponding digit is decimal 7 or binary 0111");
		}
		else if ((num.charAt(0) == 'T') || (num.charAt(0) == 'U') || (num.charAt(0) == 'V') || (num.charAt(0) == '8'))  {
			System.out.println("The corresponding digit is decimal 8 or binary 1000");
		}
		else if ((num.charAt(0) == 'W') || (num.charAt(0) == 'X') || (num.charAt(0) == 'Y') || (num.charAt(0) == 'Z') || (num.charAt(0) == '9'))  {
			System.out.println("The corresponding digit is decimal 9 or binary 1001");
		}
		else {
			System.out.println("The corresponding digit is decimal 0 or binary 0000");
		}

	}

}
