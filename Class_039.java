package Java_project;

import java.util.Scanner;

public class Class_039 {

	public static void main(String[] args) {
		// Solution 1
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter your favorite integer: ");
		int favoriteNumber1 = input1.nextInt();
		System.out.println(favoriteNumber1 + "is my favorite integer too!");
		input1.close();
		// Solution 2
		System.out.print("Enter your favorite integer: ");
		Scanner input2 = new Scanner(System.in);
		int favoriteNumber2 = input2.nextInt();
		System.out.println(favoriteNumber2 + "is my favorite integer too!");
		input2.close();
	}

}
