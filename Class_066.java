package Java_project;

import java.util.Scanner;

public class Class_066 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum1 = 0;
		while (sum1 <= 100) {
			System.out.print("Enter a number: ");
			sum1 += s.nextInt();
		}
		System.out.println("Done: " + sum1);
		
		int sum2 = 0;
		do {
			System.out.print("Enter a number : ");
			sum2 += s.nextInt();
		}while( sum2 <= 100);
		System.out.println("Done: " + sum2);
		s.close();
	}

}
