public class Variable {
    public static void main(String[] args) {
        //min max of variable
        System.out.println("----------|min and max of datatype|----------");
        System.out.printf("Integer | min : %d , max : %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);

        // global variable
        int number = 10;
        String text = "Hello wolrd";
        final int CONSTANT = 404;

        // local variable
        {
            int local = 20;
            System.out.println("----------|local|----------");
            System.out.printf("Local variable : %d%n", local);
            System.out.println("----------|global|----------");
            System.out.printf("Gobal variable : %d%n", number);

        }

        System.out.println("----------|println|----------");
        System.out.println("Number : " + number + "\nSay : " + text);

        System.out.println("----------|printf|----------");
        System.out.printf("Number : %d%nSay : %s%n", number, text);

        System.out.println("----------|constant|----------");
        System.out.printf("Constant variable : %d%n", CONSTANT);
        
        // data cashing
        System.out.println("----------|data cashing|----------");
        int cash_num = 10;
        short numToShort = (short)cash_num;
        String cash_text = "100";
        int cash_num1 = 200;
        int stringToInt = Integer.parseInt(cash_text);
        String integerToString = String.valueOf(cash_num1);
        System.out.println(cash_num1+stringToInt);
        System.out.println(integerToString+100);

        // check data type
        System.out.println("----------|check data type|----------");
        int _int = 10;
        double _double = 10.12;
        String _string = "Hello world";
        boolean _boolean = false;
        System.out.printf("check int : %b%n", Integer.class.isInstance(_int));
        System.out.printf("check double : %b%n", Double.class.isInstance(_double));
        System.out.printf("check string : %b%n", _string instanceof String);
        System.out.printf("check boolean : %b%n", Boolean.class.isInstance(_boolean));
    }
}
