import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter tw : ");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a>b)
        {
            System.out.println(" a is greater ");
        }
        else
        {
            System.out.println(" b ia greatre ");
        }

        System.out.print(" Enter indian rupee : ");
        int r= input.nextInt();
        int usd = r*85;
        System.out.println(r+ "in USD :  "+usd);

    }
}
