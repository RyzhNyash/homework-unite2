package by.ld.unit02.main;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner (System.in);
		
		double a = 0;
		double b = 0;
		double n = 2;
		
		System.out.print("ввести число a > ");   
		if (num.hasNextInt()) {
			a = num.nextInt();
			System.out.println("число a = " + a);
			}
		
		System.out.print("ввести число b > ");   
		if (num.hasNextInt()) {
			b = num.nextInt();
			System.out.println("число b = " + b);
			}
		
		a = Math.pow(a, n);
		b = Math.pow(b, n);
		
		System.out.println();
		
		if (a > b) {
			System.out.println("квадрат числа b меньше");
		}else if (a < b) {
			System.out.println("квадрат числа a меньше");
		}else System.out.println("квадраты чисел равны");
		
	}

}
