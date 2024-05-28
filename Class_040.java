package Java_project;

import java.util.Scanner;

public class Class_040 {

	public static void main(String[] args) {
		// Solution 1
		System.out.print("Enter your name and age: ");
		Scanner input1 = new Scanner(System.in);
		String name1 = input1.nextLine();
		int age1 = input1.nextInt();
		System.out.println(name1 + "! You are "+ age1 + "years old!");
		input1.close();
		
		// Solution2
		System.out.print("Enter your name and age: ");
		Scanner input2 = new Scanner(System.in);
		System.out.println(input2.nextLine() + "! You are " + input2.nextDouble() + "years old!");
		input2.close();
	}

}
