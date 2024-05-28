package Java_project;

import java.util.Scanner;

public class Class_038 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(input.nextInt());
		
		float f = input.nextFloat();
		System.out.println(f);
		System.out.println(f + 10);
		
		System.out.println(input.nextBoolean());
		System.out.println(input.nextLine());
		input.close();
	}

}
