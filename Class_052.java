package Java_project;

import java.util.Scanner;

public class Class_052 {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		
		if ( number % 2 == 0 )
			System.out.println("even");
		if ( number % 2 == 1 )
			System.out.println("odd");
		if ( !(number % 2 == 0) )
			System.out.println("odd");
	}

}
