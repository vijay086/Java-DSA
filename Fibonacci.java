import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println(a+" "+b);
        System.out.print(" Enter no =");
        int n= input.nextInt();

        for (int i=1; i<n; i++)
        {
            int c = a+b;
            System.out.println(""+c);
            a=b;
            b=c;
        }

    }
}
