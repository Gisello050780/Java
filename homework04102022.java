package homework;

import java.util.Scanner;

public class homework04102022 {
    public static void main(String[] args) {
        Scanner stringScan = new Scanner(System.in);

        String text = stringScan.nextLine();

        //1
        int size = text.length();
        if (size > 10) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //2
        char first = text.charAt(0);
        char last = text.charAt(size - 1);
        if (first == last) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //3
        text = text.replace('A','C')
                .replace('B','A')
                .replace('C','B');
        System.out.println(text);

    }
}
