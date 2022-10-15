package homework;

import java.util.Scanner;

public class Homework13102022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //level 1
        int a = scanner.nextInt();
        while (a > 0) {
            a--;
            System.out.println(a + " Я начинаю разбираться с циклами");
        }

        //level 2
        int sum = scanner.nextInt();
        int factorial = 1;
        while (sum >= 1) {
           factorial = factorial * sum;
           sum--;
            System.out.println(factorial);
        }



    }
}
