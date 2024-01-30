import java.util.Arrays;
import java.util.Scanner;

public class IULab3I1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the string
        System.out.print(" Enter a string to sort :");
        String s = in.nextLine();

        // Convert the string to a character array
        char[] charArray = s.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Convert the sorted character array back to a string
        String sortedString = new String(charArray);

        System.out.println("Sorted string: " + sortedString);
    }
}
