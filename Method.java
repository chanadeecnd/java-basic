import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};

        //copy array
        int [] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(copy));
        
        display();
        System.out.println(plus(3, 1));
        System.out.println(sum(numbers));
    }

    //no return
    static void display(){
        System.out.println("Hello World");
    }

    static String plus(double a, double b){
        return "plus = " + (a+b);
    }

    static String sum(int[] arr){
        int sum = Arrays.stream(arr).sum();
        int min = Arrays.stream(arr).min().orElse(Integer.MIN_VALUE);
        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
        return "sum = " + sum + ", min = " + min + ", max = " + max;
    }
}
