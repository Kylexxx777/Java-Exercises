package Java_project;

public class Class_032 {

	public static void main(String[] args) {
		String s1 = "NeSo AcaDEMy  a";
		
		// toUpperCase(), toLowerCase()
		System.out.println(s1.toUpperCase());
		String s2 = s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		//s1.length()
		int i = s1.length();
		System.out.println(i);
		//isEmpty()  //which is only true when it's empty
		System.out.println(s1.isEmpty()); 
		//isBlank()  // which is true when it's empty or with blank(s)
		System.out.println(s1.isBlank()); 
		//charAt()
		char c = s1.charAt(0);
		System.out.println(c);
		//indexOf //it returns -1 if there is no this element
		System.out.println(s1.indexOf('E'));
		//lastIndexOf()
		System.out.println(s1.lastIndexOf('a'));
		//concat()
		String s3 = s1.concat("Academy");
		System.out.println(s3);
	}

}
