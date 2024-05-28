package Java_project;

import java.util.Scanner;

public class Class_060 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 10 : ");
		
		int number = input.nextInt();
		while ( number < 1 || number > 10) {
			System.out.print( number + " isn't between 1 and 10. Try again : " );
			number = input.nextInt();
		}
		input.close();
		System.out.println( number + " is between 1 and 10.");
			
	}

}
