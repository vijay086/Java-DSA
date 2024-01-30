import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter your principal : ");
        int p = input.nextInt();

        System.out.print(" Enter Your Time : ");
        int t = input.nextInt();

        System.out.print(" Enter your Rate : ");
        int r = input.nextInt();

        int i = (p*r*t)/100;

        System.out.println(" Your interest =  " +i);
    }
}
