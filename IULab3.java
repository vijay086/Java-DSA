import java.util.Scanner;

public interface IULab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the substring to replace: ");
        String substringToReplace = scanner.nextLine();

        System.out.print("Enter the replacement substring: ");
        String replacementSubstring = scanner.nextLine();

        String modifiedString = originalString.replace(substringToReplace, replacementSubstring);
        System.out.println("Modified string: " + modifiedString);

        scanner.close();
    }
}
