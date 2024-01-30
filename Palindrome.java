import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter A String = ");
        String s=input.nextLine();

        String rev = "";

        for (int i=s.length()-1; i>=0 ; i--)
        {
            rev=rev+s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println(" palindrome string");
        }
        else {
            System.out.println(" not a palindrome string");
        }


    }
}
