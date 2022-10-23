package homework;

import java.util.Scanner;

public class Homework20102022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Level 1
        //int n = scanner.nextInt();
        //ouble sum = 0.0;

        //for (int i = 1; i < n; i++) {
        //    long fact = 1;
        //    for (int j = 1; j < i; j++) {
        //        fact *= j;
        //    }
        //    sum += (1.0 / fact);
        //}
        //System.out.println(sum);

        int n = scanner.nextInt();
        int a = 1;
        int sum = 0;

        while (a <= n) {
            sum += a;
            a++;
        }
        System.out.println(sum);
    }
}
