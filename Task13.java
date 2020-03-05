//все хорошо пока 0 не будет последним символом :(

package by.ld.unit02.main;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        int number = 0;
        int temp = 0;

        Scanner strIn = new Scanner(System.in);

        System.out.println("число a > ");
        while (strIn.hasNextInt() == false) {
            strIn.nextLine();
            System.out.print("a ext> ");
        }
        number = strIn.nextInt();

        int i = 0;

        while ((number > 0) & (i < 10)) {
            i++;
            if (number % 10 > temp) {
                temp = number % 10;
                number = number / 10;
            }
//            System.out.println(number + " " + temp + " " + i);
        }
        System.out.println("наибольшая цифра " + temp);
    }
}
