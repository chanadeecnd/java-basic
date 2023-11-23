import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("a b : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b == 0){
                throw new Exception("number cannot be zero");
            }
            System.out.println(a/b);
        } catch (ArithmeticException e) { //ข้อผิดพลาดจากการคำนวณ
            System.out.println("Not / by zero");
        } catch (InputMismatchException e){ //ข้อผิดพลาดจากการใส่ input
            System.out.println("Enter number only");
        } catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("It's over !");
        }
        System.out.println("Hello world");
    }
}
