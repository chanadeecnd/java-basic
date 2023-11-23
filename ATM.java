import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ATM {
    public static void main(String[] args) {
        System.out.println("-----Bill exchange program-----");

        LocalDateTime dateObj = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentTime = dateObj.format(formatDate);

        Scanner sc = new Scanner(System.in);
        System.out.print("ระบุจำนวนเงิน : ");
        int amount = sc.nextInt();
        if (amount % 100 == 0) {
            int thousandBill = amount / 1000;
            amount %= 1000;

            int fiveHundredBill = amount / 500;
            amount %= 500;

            int hundredBill = amount / 100;

            System.out.println("แบงค์ 1000 บาท: " + thousandBill + " ใบ");
            System.out.println("แบงค์ 500 บาท: " + fiveHundredBill + " ใบ");
            System.out.println("แบงค์ 100 บาท: " + hundredBill + " ใบ");
        } else {
            System.out.println("amount is incorrect.");
        }
        System.out.println("วันที่ : " + currentTime);

    }
}
