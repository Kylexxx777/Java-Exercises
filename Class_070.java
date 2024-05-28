package Java_project;

import java.util.Scanner;

public class Class_070 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		while(n > 0) {
			sum += n%10; // ABC
			n /= 10; //AB
		}
		System.out.println("sum = " + sum);	
		s.close();
	}
	

}
