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
        int j = 0;

        for (; number > 0; number /= 10) {
            int numberC = number % 10;
            if ((numberC % 2 == 0) & (numberC > 0)) {
                j++;
//                System.out.println("счетчик " + j);
//                System.out.println("В числе есть чётная цифра " + numberC);
            }
        }
        if (j != 0) {
            System.out.println("в числе чётных цифр " + j);
        }else{
            System.out.println("в числе нет четных цифр");
        }
//        System.out.println("всего введено цифр " + a);
    }
}
