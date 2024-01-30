import java.util.Scanner;

public class IULab3I3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a StringBuffer with a default string
        StringBuffer stringBuffer = new StringBuffer("This is the original string.");

        // Input the string to append
        System.out.print("Enter the string to append: ");
        String stringToAppend = scanner.nextLine();

        // Input the position to append the string
        System.out.print("Enter the position to append the string: ");
        int position = scanner.nextInt();

        // Append the string at the specified position
        stringBuffer.insert(position, stringToAppend);

        // Display the modified string
        System.out.println("Modified string: " + stringBuffer.toString());

        // Display the reverse of the modified string
        System.out.println("Reverse of modified string: " + stringBuffer.reverse());

        scanner.close();
    }
}
