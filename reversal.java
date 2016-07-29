import java.util.Scanner;

public class reversal {

	public static void main(String[] args) {
		
		int number = 0;
		int reverseNumber = 0;
		System.out.println("Enter a number and press Enter:");
		
		Scanner in = new Scanner(System.in);
		
		number = in.nextInt();
		
		while( number != 0) {
			reverseNumber = reverseNumber * 10;
			reverseNumber = reverseNumber + number%10;
			number = number/10;	
		}
		
		System.out.println("The reverse of the number you entered is: " + reverseNumber);
	}

}
