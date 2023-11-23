import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TempCal {
    public static void main(String[] args) {
        LocalDateTime dateObj = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDate = dateObj.format(dateFormat);

        Scanner sc = new Scanner(System.in);
        System.out.println("หน่วย ฟาเรไฮ(F), เคลวิน(K), เซลเซียล(C)");
        System.out.print("โปรดระบุ อุณหภูมิ(หน่วย) : ");
        String input = sc.nextLine();
        System.out.print("ต้องการแปลงเป็น (หน่วย) : ");
        String output = sc.nextLine();
        String chageTo = output.replaceAll("\\s", "");
        String inputStr = input.replaceAll("[\\d\\s]", "");
        
        if(chageTo.contains("C") || chageTo.contains("c")){
            System.out.println("To c" + inputStr);
            String result = celcius(input, inputStr);
            System.out.println(result);
        }
        if(chageTo.contains("K") || chageTo.contains("k")){
            System.out.println("To k" + inputStr);
            String result = kelvin(input, inputStr);
            System.out.println(result);
        }
        if(chageTo.contains("F") || chageTo.contains("f")){
            System.out.println("To f" + inputStr);
            String result = faren(input, inputStr);
            System.out.println(result);
        }
    }

    public static String celcius(String input,String output) {
        String numInputStr =  input.replaceAll("[^0-9.]", "");
        double numInput = Double.parseDouble(numInputStr);
        System.out.println("Input = " + numInput);
        if(output.contains("K") || output.contains("k")){
            double cels = numInput - 273.15;
            return "result : " +  numInput + " K => " + cels + " C"; 
        }else if(output.contains("F") || output.contains("f")){
            double cels = ((numInput - 32) * 5) / 9; 
            return "result : " +  numInput + " F => " + cels + " C"; 
        }else{return "Error";}
    }

    public static String faren(String input,String output) {
        String numInputStr =  input.replaceAll("[^0-9.]", "");
        double numInput = Double.parseDouble(numInputStr);
        System.out.println("Input = " + numInput);
        if(output.contains("C") || output.contains("c")){
            double faren = (numInput * 9)/5 + 32;
            return "result : " +  numInput + " C => " + faren + " F"; 
        }else if(output.contains("K") || output.contains("k")){
            double faren = ((numInput - 273)/5)*9 + 32; 
            return "result : " +  numInput + " K => " + faren + " F"; 
        }else{return "Error";}
    }

    public static String kelvin(String input,String output) {
        String numInputStr =  input.replaceAll("[^0-9.]", "");
        double numInput = Double.parseDouble(numInputStr);
        System.out.println("Input = " + numInput);
        if(output.contains("C") || output.contains("c")){
            double kelvin = numInput + 273.15;
            return "result : " +  numInput + " C => " + kelvin + " K"; 
        }else if(output.contains("F") || output.contains("F")){
            double kelvin = (numInput/9) * 5 + 273 ; 
            return "result : " +  numInput + " F => " + kelvin + " K"; 
        }else{return "Error";}
    }

}

