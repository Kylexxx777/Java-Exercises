package Java_project;

import java.util.Scanner;

public class Class_068 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n1 = s. nextInt();
		int sum1 = 0;
		for (int i1 = 1; i1 <= n1/2; i1++)
			if ( n1 % i1 == 0)
				sum1 += i1;
		System.out.println( sum1 == 1? "prime" : "not prime");
		
		System.out.print("Enter a number: ");
		int n2 = s. nextInt();
		boolean isPrime = true;
		for ( int i2 = 2; i2 <= n2/2; i2++)
			if (n2 % i2 == 0) {
				isPrime = false;
				break;
			}
		// prime, not prime
		System.out.println(isPrime ? "prime" : "not prime");
		s.close();
	}

}
