import java.util.Scanner;
public class FutureValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Investment Amount:   $");
		double invAmnt = input.nextDouble();
		System.out.println("");
		System.out.print("Enter Annual Interest Rate: ");
		double invRate = input.nextDouble();
		System.out.println("");
		System.out.print("Enter Investment Duration: ");
		double invDura = input.nextDouble();
		System.out.println("");
		double futureVal = invAmnt * Math.pow((1 + invRate/(100.00*12)),invDura*12);
		futureVal = futureVal - (futureVal % 0.01);
		System.out.print("Future Investment Value: $");
		System.out.println(futureVal);
	}

}
