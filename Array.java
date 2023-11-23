import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // |||||||||||||| 1D Array |||||||||||||||||||
        // ---Declare array---
        // - set size for array
        int[] emp = new int[10];
        String[] strEmp = new String[10];
        emp[0] = 10;
        emp[1] = 20;
        emp[2] = 30;
        emp[3] = 40;
        emp[5] = 60;
        strEmp[0] = "AA";
        strEmp[1] = "AB";
        strEmp[2] = "AC";
        strEmp[3] = "AD";
        strEmp[5] = "D5";

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        String[] strings = { "A", "B", "C", "D" };
        boolean[] status = { true, false };
        numbers[0] = 99;

        // ---for loop---
        System.out.println("-----|for loop|-----");
        int count = strings.length;
        for (int i = 0; i < count; i++) {
            System.out.println(strings[i]);
        }

        // ---for each---
        System.out.println("-----|for each|-----");
        for (int number : numbers) {
            System.out.println(number);
        }

        // ---using java standard library---
        System.out.println("-----|java standard library|-----");
        System.out.println(Arrays.toString(numbers));

        System.out.println("-----|print|-----");
        System.out.println(status); // [Z@2f92e0f4

        // ---length----
        System.out.println("-----|length|-----");
        System.out.println(numbers.length); // 9

        // ---sum array---
        // - for each
        System.out.println("-----|sum by forloop|-----");
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);

        // - streamAPI
        System.out.println("-----|sum by streamAPI|-----");
        System.out.println(Arrays.stream(numbers).sum());

        // |||||||||||||| 2D Array |||||||||||||||||||
        System.out.println("*************2D array*************");
        String [][] arr2D = {
            {"A","B","C"},
            {"1","2","3"},
            {"!","@","#"}
        };
        arr2D[0][1] = "Hello world";

        System.out.println("-----|print 2D array|-----");
        for(int i=0;i<arr2D.length;i++){
            for(int j=0;j<arr2D[i].length;j++){
                System.out.printf("arr2D[%d][%d] = %s%n", i, j, arr2D[i][j]);
            }
        }
    }
}
