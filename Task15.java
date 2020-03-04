//Найдите количество четных цифр данного натурального числа

package by.ld.unit02.main;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        Scanner strIn = new Scanner(System.in);
        int number = 0;

        System.out.println("число a > ");
        while (strIn.hasNextInt() == false) {
            strIn.nextLine();
            System.out.print("a > ");
        }
        number = strIn.nextInt();

        String numberStr = String.valueOf(number);
        int a = numberStr.length();

        for (; number > 0; number /= 10) {
            int numberC = number % 10;
            int j = 1;
            System.out.println(numberC);
            if ((numberC % 2 == 0) & (numberC > 0)) {
                System.out.println("В числе есть четная цифра " + numberC);
            }
        }


    }

}