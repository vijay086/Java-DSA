import java.util.Scanner;

public class switchex {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String fruit = in.next();

        switch (fruit){
            case "mango" -> System.out.println(" king of fruit ");
            case "appel" -> System.out.println("a sweet fruit");
            case "orange" -> System.out.println("round fruit");
            default -> System.out.println("Enter a valid fruit");
        }
    }
}
