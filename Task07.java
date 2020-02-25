package by.ld.unit02.main;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);   
		
		double r1 = 23; //радиус первого круга
		double r2 = 13; //радиус второго круга
		
		double s1;
		double s2;
		double n = 2;
		
		System.out.print("ввести a > ");   
		if (sc.hasNextInt()) {
			r1 = sc.nextInt();
			System.out.println("радиус первого круга r1 = " + r1);
			}
		
		System.out.print("ввести b > ");   
		if (sc.hasNextInt()) {
			r2 = sc.nextInt();
			System.out.println("радиус второго круга r2 = " + r2);
			}
		
		s1 = (Math.PI * Math.pow(r1, n));
		s2 = (Math.PI * Math.pow(r2, n));
		
		if (s1 > s2) {
			System.out.println("Площадь второго круга меньше площади первого круга");
		} else if (s1 < s2) {
			System.out.println("Площадь первого круга меньше площади второго круга");
		} else System.out.println("Площади кругов и сами круги равны");
		
		System.out.println();
		System.out.println("s1 " + s1 + " s2 " + s2);

	}

}
