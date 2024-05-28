package Java_project;

import java.util.Scanner;

public class Class_057 {

	public static void main(String[] args) {
		System.out.print("Enter num1 operater num2 : ");
		Scanner input = new Scanner(System.in);
		
		double d1 = input.nextDouble();
		char operator = input.next().charAt(0);
		double d2 = input.nextDouble();
		
		if ( operator == '+' )
			System.out.println(d1 + d2);
		else if ( operator == '-' )
			System.out.println(d1 - d2);
		else if ( operator == '*' )
			System.out.println(d1 * d2);
		else if ( operator == '/' )
			if ( !(d2 == 0) )
			System.out.println(d1 / d2);
			else
			System.out.println("Can't be divided by 0.");
		else
			System.out.println("Invalid operator.");
		input.close();
	}

}
