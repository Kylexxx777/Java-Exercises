package Java_project;

public class Class_065 {

	public static void main(String[] args) {
		for ( int i1 = 1; i1 <= 100; i1++)
			if (i1 % 2 == 0) //isEven
				System.out.print( i1 + " " );
		System.out.println();
		for (int i2 = 100; i2 >= 1; i2-- )
			if ( i2 %2 == 0)
				System.out.print( i2 + " ");
		
		System.out.println();
		int i3 = 1;
		while ( i3 <= 100 )
			if ( i3 % 2 == 0 )
				System.out.print(i3 + " ");
			i3++;
	}

}
