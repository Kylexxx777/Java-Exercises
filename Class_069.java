package Java_project;

import java.util.Scanner;

public class Class_069 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int max = n;
		int min = n;
		if (n >= 0) {
			while(true) {
			n = s.nextInt();
			if (n < 0)
				break;
			max = n > max ? n : max;
			min = n < min ? n : min;
			}
			System.out.println("min: " + min + ", max: " + max);
		}
		else
			System.out.println(n + " is invalid.");
		s.close();
	}

}
