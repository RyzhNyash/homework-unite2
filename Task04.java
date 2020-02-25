package by.ld.unit02.main;

import java.util.Scanner;

public class Task04 {
	
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);   
		
		int a = 0;
		int b = 0;
		int c = 0;
		int x = 0;
		
		System.out.print("ввести a > ");   
		if (sc.hasNextInt()) {
			a = sc.nextInt();
			System.out.println("a = " + a);
			}
		
		System.out.print("ввести b > ");   
		if (sc.hasNextInt()) {
			b = sc.nextInt();
			System.out.println("b = " + b);
			}
		
		System.out.print("ввести c > ");   
		if (sc.hasNextInt()) {
			c = sc.nextInt();
			System.out.println("c = " + c);
			}
		
		System.out.print("ввести x > ");   
		if (sc.hasNextInt()) {
			x = sc.nextInt();
			System.out.println("x = " + x);
			}
		
		
		int expr;
		int temp1;
		
		temp1 = (a * x * x) + (b *x) + c;
		expr = Math.abs(temp1);
		System.out.println("модуль выражения a * x * x + b * x + c равен " + expr);
	}

}
