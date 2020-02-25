package by.ld.unit02.main;

import java.util.Scanner;

public class Task01 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a = 0;
		int b = 0;
	
		System.out.println("число a > ");
		while (sc.hasNextInt() == false) {
			String str;
			str = sc.next();
			sc.hasNextLine();
			System.out.println("число a >"); 
		}
		a = sc.nextInt();
		
		System.out.println("число b > ");
		while (sc.hasNextInt() == false) {
			String str;
			str = sc.next();
			sc.hasNextLine();
			System.out.println("число b >"); 
		}
		b = sc.nextInt();
		
		
		if ( a == b) {
			System.out.println("число a " + a + " равно числу b " + b );
		} else {
			System.out.println("число a " + a + " не равно числу b " + b );
		}
		
	}
	
}