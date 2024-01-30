import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitive
        int[] arr = new int[5];

        arr[0] = 78;
        arr[1] = 758;
        arr[2] = 7548;
        arr[3] = 748;
        arr[4] = 787;
        System.out.println(arr[2]);

        // input using for loop

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));


        // array of objects

        String[] str = new String[5];
        for (int i = 0; i < arr.length; i++) {
            str[i]= in.next();
        }
        System.out.println(Arrays.toString(str));
    }

}