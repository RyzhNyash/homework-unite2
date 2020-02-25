package by.ld.unit02.main;

public class Task16 {
	public static void main (String[] args) {
		
//	Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).	
		
		long a = 3;
		
		long b = a;
		
		int i = 0;
		
		for (i = 3; i <=10; i++ ) {
		a += i;
		b *= a;
		
//		System.out.println(i + "|  " + a + "|  " + b);
		}
		
		System.out.println("(1+2)*(1+2+3)*...*(1+2+...+10) = " + b);				
		
	}

}
