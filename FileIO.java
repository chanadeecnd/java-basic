//FileWriter, FileReader, BufferedWrite, BufferedReader
import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        File f = new File("text.txt");
        try {
            FileWriter writer = new FileWriter(f);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Hello world\n");
            bufferedWriter.write("chanadee\n");
            bufferedWriter.write("hk");
            bufferedWriter.close();
            System.out.println("Write file successfully");

            FileReader reader = new FileReader("text.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
