package by.ld.unit02.main;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int n = 0;

        System.out.print("число a > ");
        while (sc.hasNextInt() == false) {
            sc.nextLine();
            System.out.print("число a > ");
        }
        a = sc.nextInt();

        System.out.print("число n > ");
        while (sc.hasNextInt() == false) {
            sc.nextLine();
            System.out.print("число n > ");
        }
        n = sc.nextInt();

        int i;
        long x = a;

        for (i = 1; i < n; i++) {
            x *= (a + i);
            System.out.println(x + " | " + i + " | " + a);
        }

        System.out.println(x);

    }
}