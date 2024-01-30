import java.util.Scanner;
// Not Working
public class nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter A employee id =");
        int  emp = in.nextInt();
        String course = in.next();
        int year = in.nextInt();


        switch (emp){
            case 1:
                System.out.println("Vijay Ahir");
                switch (course){
                    case "2020":
                        System.out.println(" in Diploma");
                        break;
                    case "2024":
                        System.out.println(" in B.tech");
                        break;
                }
                break;
            case 2:
                System.out.println("Sagar Ahir");
                break;
            case 3:
                System.out.println("Sid Soni");
                break;
        }

    }
}
