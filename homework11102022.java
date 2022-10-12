package homework;

import java.util.Scanner;

public class homework11102022 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        //First level
        int a = number.nextInt();
        if (a == 0) {
            System.out.println("ошибок не обнаружено");
        } else {
            System.out.println("ERROR");
        }

        //Second level
        String password = number.next();
        int size = password.length();
        int last = password.charAt(size -1);
        if (size < 6 || last != '!') {
            System.out.println("Ваш пароль неверен");
        } else {
            System.out.println("пароль принят");
        }
    }
}
