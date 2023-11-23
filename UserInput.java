import java.util.Scanner;
import java.time.LocalDateTime;

public class UserInput {
    public static void main(String[] args) {
        //get data -> using Scanner Class. first of all, it must be import class
        //declar scanner class
        Scanner sc = new Scanner(System.in);

        LocalDateTime dt =  LocalDateTime.now();
        int currentYear = dt.getYear();

        System.out.print("Enter your first name : ");
        String firstName = sc.next(); // get data from keyboard

        System.out.print("Enter your last name : ");
        String lastName = sc.next();

        System.out.print("Enter your birthday year : ");
        int year = sc.nextInt();

        int yourAge = currentYear - year;
        System.out.printf("Name : %s %s%n", firstName, lastName);
        System.out.printf("Age : %d%n", yourAge);
        //data type ?
        // use data for ?
    }
}
