import java.util.Scanner;
;
public class countnums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number =");
        int n = in.nextInt();
        int count  = 0;
        while (n>0)
        {
            int rem = n%2;
             if (rem == n);
            {
                count++;
            }
            n = n/10 ;
        }
    }
}
