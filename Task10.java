package by.ld.unit02.main;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        System.out.print("число a > ");
        while (sc.hasNextInt() == false) {
            sc.nextLine();
            System.out.print("число a > ");
        }
        a = sc.nextInt();

        System.out.print("число b > ");
        while (sc.hasNextInt() == false) {
            sc.nextLine();
            System.out.print("число b> ");
        }
        b = sc.nextInt();

        System.out.print("число c > ");
        while (sc.hasNextInt() == false) {
            sc.nextLine();
            System.out.print("число c> ");
        }
        c = sc.nextInt();

        System.out.print("число d > ");
        while (sc.hasNextInt() == false) {
            sc.nextLine();
            System.out.print("число d> ");
        }
        d = sc.nextInt();

        int t1;
        int t2;
        int t3;

        t1 = Math.max(a, b);
        t2 = Math.min(c, d);
        t3 = Math.max(t1, t2);

        System.out.println("max{min(a, b)min(c, d)} или max{min(" + a + ", " + b + ")min(" + c + ", " + d + ")} равен " + t3 + "?");

    }
}
