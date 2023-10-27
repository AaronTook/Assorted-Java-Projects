import java.util.Scanner;
public class ConsecutiveEqualNumbers {
	public static boolean isConsecutiveFour(int[][] values) {
		int i,k = 0;
		for (i= 0; i < values.length; i++) {
			for (k = 0; k < values[i].length; k++) {
				//Check Horizontal
				if (k<=values[i].length-4) { //Prevent errors for requests out of range.
					if ((values[i][k]==values[i][k+1]) && (values[i][k+1]==values[i][k+2]) && (values[i][k+2]==values[i][k+3])) {
						return true;
					}
				}
				
				//Check Vertical
				if (i<=values.length-4) { //Prevent errors for requests out of range.
					if ((values[i][k]==values[i+1][k]) && (values[i+1][k]==values[i+2][k]) && (values[i+2][k]==values[i+3][k])) {
						return true;
					}
				}
				//Check Diagonal Left-Right
				if ((i<=values.length-4) && (k<=values[i].length-4))  { //Prevent errors for requests out of range.
					if ((values[i][k]==values[i+1][k+1]) && (values[i+1][k+1]==values[i+2][k+2]) && (values[i+2][k+2]==values[i+3][k+3])) {
						return true;
					}
				}
				//Check Diagonal Right-left
				if ((k>=3) && (i<=values[i].length-4))  { //Prevent errors for requests out of range.
					if ((values[i][k]==values[i+1][k-1]) && (values[i+1][k-1]==values[i+2][k-2]) && (values[i+2][k-2]==values[i+3][k-3])) {
						return true;
					}
				}
			}
		}
		// None of the values match any of the criteria.
		return false;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Gather the row and column numbers and prompt the user to enter the values for the two-dimensional array.
		int rows, columns = 0;
		System.out.print("Please enter the number of rows in the two-dimensional array: ");
		columns = input.nextInt();
		System.out.print("Please enter the number of columns in the two-dimensional array: ");
		rows = input.nextInt();
		System.out.print("Please enter the values to be contained in the two-dimensional array separated by spaces: ");
		
		//Create the 1D array and fill it using the user's input.
		int[] vals = new int[rows*columns];
		int i;
		for (i = 0; i < vals.length; i++) {
            vals[i] = input.nextInt();
        }
		
		//Create the 2D array and fill it using the contents of the 1D array
		int[][] myArr = new int[columns][rows];
		int counter = 0;
		for (int j=0; j<myArr.length;j++) {
			for (int k=0; k<myArr[j].length;k++) {
				myArr[j][k] = vals[counter];
				counter++;
			}
		}
		
		//Display the 2D array
		for (int l = 0; l < myArr.length; l++) {

            for (int m = 0; m < myArr[l].length; m++) {
                System.out.print(myArr[l][m] + " ");
            }
            System.out.print("\n");
    	}
		
		//run isConsecutiveFour using myArr
		if (isConsecutiveFour(myArr)) {
			System.out.println("Found four consecutive occurrences of n. ");
		}
		else {
			System.out.println("Did not find four consecutive occurrences. ");
		}

	}

}
