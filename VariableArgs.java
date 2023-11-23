import java.util.Arrays;

public class VariableArgs {
    public static void main(String[] args) {
        sum(1,2,4,5,6,7);
    }

    static void sum(int ...args){
        System.out.println(Arrays.toString(args));
        System.out.println(Arrays.stream(args).sum());
    }
}
