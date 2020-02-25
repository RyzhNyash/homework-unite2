package by.ld.unit02.main;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);   
		
		int a = 0;
		int b = 0;
		int c = 0;
		
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
		
		System.out.println();
		
		if ( (a + c) == (c + b) & (a + b) == (a + c)) {
			System.out.println("вроде бы треугольник равносторонний");
		} else if (a == 0) { System.out.println("не треугольник");
		} else if (b == 0) { System.out.println("не треугольник");
		} else if (c == 0) { System.out.println("не треугольник");
		}else if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {System.out.println("не треугольник, условие существования треугольника не выполнено");
		} else System.out.println("не равносторонний треугольник");

	}

}