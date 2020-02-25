package by.ld.unit02.main;

import java.util.Scanner;

public class Task18 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x = 0;
		int a = 0;
		int b = 0;
		int h = 0;
		double f = 0;
		
		System.out.print("число a > ");
        while (sc.hasNextInt() == false) {
            sc.nextLine();
            System.out.print("a > ");
        }
        a = sc.nextInt();
		
        System.out.print("число b> ");
        while (sc.hasNextInt() == false) {
            sc.nextLine();
            System.out.print("b > ");
        }
        b = sc.nextInt();
        
        System.out.print("число h> ");
        while (sc.hasNextInt() == false) {
            sc.nextLine();
            System.out.print("h > ");
        }
        h = sc.nextInt();
        
        
        x = a;
		
		while (x <= b) {
			f = Math.sin(x) * Math.sin(x);
			
			f = f * 1000;
			int f1 = (int)f;
			f = (double)f1 / 1000;
			x = x + h;
			
			System.out.println("значение x " + (int)x+ "|  |значение а " + f);
			
		}
		
	}

}
