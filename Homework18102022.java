package homework;

import java.util.Scanner;

public class Homework18102022 {
    public static void main(String[] args) {
        //Level 1
        Scanner scanner = new Scanner(System.in);

        //Дано целое число, не меньшее 2.
        // Выведите его наименьший делитель, отличный от 1.
        // (число, на которое введенное число делится без остатка).
        //int number = scanner.nextInt();
        //int answer = 0;

        //for (int i = 2; i <= number; i++) {
        //    if (number % i == 0) {
        //        if (answer == 0) {
        //            answer = i;
        //        }
        //   }
        //   }
        //System.out.println(answer);

        //int delitel = 2;

        // while (number % delitel !=0){
        //    delitel++;
        //}
        //System.out.println(delitel);



        //for (int i = number; i > 2 ; i--) { //наибольший делитель
        //    if (number % i == 0) {
        //        System.out.println(i);
        //        answer = i;
        //    }




            //Level 2 // депозит с причислением процентов к телу. вычислить итоговую сумму депозита+%%
            int deposit = scanner.nextInt();
            int interest = scanner.nextInt();
            int years = scanner.nextInt();

        for (int i = 0; i < years; i++) {
            deposit = deposit + (deposit*interest/100);
        }
            System.out.println(deposit);
        }
    }






