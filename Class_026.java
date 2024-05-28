package Java_project;

public class Class_026 {

	public static void main(String[] args) {
		byte b1 = 5;				//[-128,127]
		short s1 = 20;			
		int i1 = 100;				
		long l1 = 999L;				
		
		System.out.println(b1 - i1);
		System.out.println(s1 - b1);
		System.out.println(i1 - l1);
		
		l1 = i1;
		System.out.println(i1);
		System.out.println(l1);
	}

}
