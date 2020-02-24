package by.ld.unit02.main;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int a = 0;
        int b = 0;
        int c = 0;

        System.out.print("число a > ");
        while(sc.hasNextInt() == false) {
            sc.nextLine();
            System.out.print("число a > ");
        }
        a = sc.nextInt();

        System.out.print("число b > ");
        while(sc.hasNextInt() == false) {
            sc.nextLine();
            System.out.print("число b> ");
        }
        b = sc.nextInt();

        System.out.print("число c > ");
        while(sc.hasNextInt() == false) {
            sc.nextLine();
            System.out.print("число c> ");
        }
        c = sc.nextInt();

        System.out.println();

        if ( a >= 0) {
            a =(int) Math.pow(a, 2);
            System.out.println("a ^ 2 = " + a);
        }else if (a < 0) {
            a =(int) Math.pow(a, 4);
            System.out.println("a ^ 4 = " + a);
        }


        if ( b >= 0) {
            b =(int) Math.pow(b, 2);
            System.out.println("b ^ 2 = " + b);
        }else if (b < 0) {
            b =(int) Math.pow(b, 4);
            System.out.println("b ^ 4 = " + b);
        }


        if ( c >= 0) {
            c =(int) Math.pow(c, 2);
            System.out.println("c ^ 2 = " + c);
        }else if (c < 0) {
            c =(int) Math.pow(c, 4);
            System.out.println("c ^ 4 = " + c);
        }
    }
}
