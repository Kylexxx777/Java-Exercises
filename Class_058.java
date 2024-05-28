package Java_project;

import java.util.Scanner;

public class Class_058 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a four-digit number : ");
		int number = input.nextInt();
		
		if ( !( number > 999 && number < 10000) ) {
			System.out.println( number + " isn't a four-digit number");
			input.close();
		}
		else {
			// ABCD
			int fourthDigit = number % 10; // D
			int thirdDigit = ( number / 10 ) % 10; // ABC % 10 = C
			int secondDigit = ( number / 100 ) % 10; // AB % 10 = B
			int firstDigit = ( number / 1000 ) % 10; // A % 10 = A
			
			if ( firstDigit + secondDigit == thirdDigit + fourthDigit )
				System.out.println("lucky");
			else
				System.out.println("not lucky");
			input.close();
		}
		
	}

}
