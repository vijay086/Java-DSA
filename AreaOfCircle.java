import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter Radius of Circle : ");
        int r = in.nextInt();

        float area = r*r*3.14f;

        System.out.println("Radius Of Circle = "+ area);
    }
}
