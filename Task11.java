package by.ld.unit02.main;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
	//решение работает в таком виде для 3-х значных чисел корректно,
	//пока не смог понять как верно реализовать решение задачи
        //думаю дальше, но что-то упустил
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		System.out.print("первое число > ");
        while (sc.hasNextInt() == false) {
            sc.nextLine();
            System.out.print("первое число > ");
        }
        x = sc.nextInt();
		
        System.out.print("второе число > ");
        while (sc.hasNextInt() == false) {
            sc.nextLine();
            System.out.print("второе число > ");
        }
        y = sc.nextInt();
		
        
		int a = x / 100;
		int b = x / 10 % 10;
		int c = x % 10;
		
		int a1 = y / 100;
		int b1 = y / 10 % 10;
		int c1 = y % 10;
		
		if (a == a1) {
			System.out.println("одинаковые числа в записи " + a);
		}if (a == b1) {
			System.out.println("одинаковые числа в записи " + a);
		}if (a == c1) {
			System.out.println("одинаковые числа в записи " + a);
		}if ( b == a1) {
			System.out.println("одинаковые числа в записи " + b);
		}if ( b == b1) {
			System.out.println("одинаковые числа в записи " + b);
		}if ( b == c1) {
			System.out.println("одинаковые числа в записи " + b);
		}if ( c == a1) {
			System.out.println("одинаковые числа в записи " + c);
		}if ( c == b1) {
			System.out.println("одинаковые числа в записи " + c);
		}if ( c == c1) {
			System.out.println("одинаковые числа в записи " + c);
		}else 
			System.out.println("нет одинаковых чисел в записи");
	}
}
