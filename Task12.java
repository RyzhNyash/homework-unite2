//Проверить введенную пользователем строку на наличие недопустимых символов.
//В качестве первого символа допустимы только буквы и знак подчеркивания.
//Остальные символы могут быть буквами, цифрами и знаком подчеркивания.
package by.ld.unit02.main;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        System.out.println("строка > ");
        String in = str.nextLine();

        int z = in.length();

        String first = in.substring(0, 1);
        String second = in.substring(1, z);
        if ((first.matches("[a-z_A-Z]")) & (second.matches("[a-zA-Z0-9_]+"))) {
            System.out.println("ok");
        } else {
            System.out.println("что то пошло не так");
        }
    }
}
