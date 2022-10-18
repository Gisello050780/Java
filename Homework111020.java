package homework;

import java.util.Scanner;

public class Homework111020 {
    public static void main(String[] args) {
        //level 1
        Scanner scanner = new Scanner(System.in);

        //int a = scanner.nextInt();
        //if (a % 2 == 0) {
        //    a += 2;
        //    System.out.println(a);
        //}
        //else {
        //    a++;
        //    System.out.println(a);
        //}

        //level 2
        int l = scanner.nextInt();
        int time = scanner.nextInt();
        int speed = scanner.nextInt();
        int place = speed * time;

        if (place >= l / 2) {
            System.out.println("Джон");
        }
        else {
            System.out.println("Шерлок");
        }

    }
}
