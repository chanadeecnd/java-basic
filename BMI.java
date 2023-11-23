import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDateTime dateObj = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDate = dateObj.format(dateFormat);

        System.out.println("--Calulate BMI--");

        System.out.print("Enter weight(kg) : ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter height(cm) : ");
        double height = sc.nextDouble();
        height/=100;
        double bmi = weight / (Math.pow(height, 2));
        String result;
        if(bmi >= 30){
            result = "โรคอ้วนระดับอันตราย";
        }else if(bmi >= 25){
            result = "โรคอ้วน";
        }else if(bmi >= 23 ){
            result = "น้ำหนักเกิน";
        }else if(bmi >= 18.5){
            result = "สมส่วน";
        }else{
            result = "ต่ำกว่าเกณฑ์";
        }

        System.out.printf("BMI : %.2f%n", bmi);
        System.out.printf("Result : %s%n", result);
        System.out.printf("Date : %s%n", currentDate);

        System.out.println("--Even and Odd number--");
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        String numberIs = (number % 2 == 0) ? "even number." : "odd number"; 
        System.out.printf("Thenumber %d is an %s%n", number, numberIs);

    }
}
