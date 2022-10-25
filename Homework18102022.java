package homework;

import java.util.Scanner;

public class Homework18102022 {
    public static void main(String[] args) {
        //Level 1
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        for (int i = 1; i > 0; i++) {
            int a = number % i;
            if (a == 2 || a == 3 || a == number) {
                System.out.println(a);
            }


            //Level 2
            //int deposit = scanner.nextInt();
            //int interest = scanner.nextInt();
            //int years = scanner.nextInt();
            //int x = 0;
            //int interestAmountYear = ((deposit + x) * interest) / 100;

            //do {
            //    years --;
            //x += interestAmountYear;
            //} while (years != 0);
            //System.out.println(deposit + interestAmountYear);
        }
    }
}





