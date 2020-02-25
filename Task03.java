package by.ld.unit02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a;
		int b;
		
		
		System.out.println("число a > ");
		while (sc.hasNextInt() == false) {
			String st;
			st = sc.next();
			sc.hasNextLine();
			System.out.println("число a >"); 
		}
		a = sc.nextInt();
		
		System.out.println("число b > ");
		while (sc.hasNextInt() == false) {
			String st;
			st = sc.next();
			sc.hasNextLine();
			System.out.println("число b >"); 
		}
		b = sc.nextInt();		
		
		if (a > b) {
			System.out.println("большее число a = " + a);
		}else if (a < b) {
			System.out.println("большее число b = " + b);
		}else {
			System.out.println("числа равны");
			
		}

	}

}
