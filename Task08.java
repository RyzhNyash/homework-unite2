package by.ld.unit02.main;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		// прощадь какого треугольника больше
		
		Scanner tr = new Scanner(System.in);
		
		int a1 = 0;
		int b1 = 0;
		int c1 = 0;
		
		int a2 = 0;
		int b2 = 0;
		int c2 = 0;
		
		System.out.println("Ввести 3 стороны первого треугольника");
		System.out.print("ввести a1 > ");
		if (tr.hasNextInt()) {
			a1 = tr.nextInt();
		}
		
		System.out.print("ввести b1 > ");
		if (tr.hasNextInt()) {
			b1 = tr.nextInt();
		}
		
		System.out.print("ввести c1 > ");
		if (tr.hasNextInt()) {
			c1 = tr.nextInt();
		}
		
		System.out.println("Ввести 3 стороны второго треугольника");
		System.out.print("ввести a2 > ");
		if (tr.hasNextInt()) {
			a2 = tr.nextInt();
		}
		
		System.out.print("ввести b2 > ");
		if (tr.hasNextInt()) {
			b2 = tr.nextInt();
		}
		
		System.out.print("ввести c2 > ");
		if (tr.hasNextInt()) {
			c2 = tr.nextInt();
		}
		
		if ((a1 + b1 <= c1) || (a1 + c1 <= b1) || (b1 + c1 <= a1)) {
			System.out.println("условие существования одного из треугольников не выполнено");
		}else if ((a2 + b2 <= c2) || (a2 + c2 <= b2) || (b2 + c2 <= a2)) {
			System.out.println("условие существования одного из треугольников не выполнено");
		}else {
			double p1;
			double p2;
			
			double temp1;
			double temp2;
			
			double s1;
			double s2;
			
			
			p1 = ((a1+b1+c1)/2);
			p2 = ((a2+b2+c2)/2);
			
			temp1 = p1*(p1-a1)*(p1-b1)*(p1-c1);
			temp2 = p2*(p2-a2)*(p2-b2)*(p2-c2);
			
			s1 = Math.sqrt(temp1);
			s2 = Math.sqrt(temp2);
			
			if (s1 > s2) {
				System.out.println("площадь первого треугольника больше площади второго");
			}else if (s1 == s2) {System.out.println("площади треугольников равны");
			} else System.out.println("площадь второго треугольника больше площади первого");
		
		}
				
	}

}