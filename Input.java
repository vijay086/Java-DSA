import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int num1 = Input.nextInt();
        int num2 = Input.nextInt();
        float nu3 = Input.nextFloat();
        int sum = num1+num2;

        System.out.println("Sum of number = "+ sum);
    }
}
