import java.util.Scanner;

public class Opratorcalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" enter Two Values : ");
        int a = input.nextInt();
        int b = input.nextInt();
    while (true) {
        System.out.println(" Enter  operator +,-,/,-, = ");
        char c = input.next().charAt(0);
        int d;
        if (c == '+' || c == '-' || c == '*' || c == '/') {
            if (c == '+') {
                d = a + b;
                System.out.println(" sum of number =" + d);
            } else if (c == '-') {
                d = a - b;
                System.out.println(" subtraction of number =" + d);
            } else if (c == '/') {
                d = a / b;
                System.out.println(" mod  of number =" + d);
            } else if (c == '*') {
                d = a * b;
                System.out.println(" multiplication of number =" + d);
            }
        } else if (c == 'x' || c=='X') {
            break;
        }
        else {
            System.out.println("Invalid Operator");
        }
    }
    }
}
