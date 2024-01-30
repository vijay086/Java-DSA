import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print(" Enter a no =");
        int no = input.nextInt();

        if (no%2==0)
            System.out.println(no+ " Is Even");
        else
            System.out.println(no+ " is Odd");
    }
}
