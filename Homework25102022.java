import java.util.Arrays;

public class Homework25102022 {
    public static void main(String[] args) {
        int[] array = new int[100];

        //level 1
        //for (int i = 0; i < 100; i++) {
        //    array[i] = 10;
        //}
        //System.out.println(Arrays.toString(array));

        //for (int i = 0; i < 100; i++) {
        //    array[0] = 0;
        //    array[99] = 0;
        //}
        //System.out.println(Arrays.toString(array));

        //level 2
        for (int i = 0; i < 100; i++) {
            int count = i % 10;
            array[i] = count + 110;
        }
        System.out.println(Arrays.toString(array));
    }
}
