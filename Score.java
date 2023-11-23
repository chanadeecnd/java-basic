import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Score {
    static String fileResult = "Result.txt";
    static String fileRead = "score.txt";

    public static void main(String[] args) {
        try {
            //read file score
            String[] readFile = readFile(fileRead);
            //clear to empty file
            clearFile(fileResult);
            //loop readFile
            for (String data : readFile) {
                //split | data = [A001 65] 
                String[] splitData = data.split(" ");
                //calulate grade
                calGrade(splitData[0], splitData[1]);
            }
            System.out.printf("Calulate grade successfully, Write data to %s%n",fileResult);
        } catch (Exception e) {
            e.getStackTrace();
        }

    }

    static void writeFile(String fileLocation, String id, String grade, int score) {
        File f = new File(fileLocation);
        try {
            FileWriter fileWriter = new FileWriter(f, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(id + " " + score + " " + grade + "\n");
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void clearFile(String fileLocation) {
        File f = new File(fileLocation);
        try {
            FileWriter fileWriter = new FileWriter(f);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("");
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static String[] readFile(String fileLocation) {
        try {
            FileReader fileReader = new FileReader(fileLocation);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            //declare empty object array
            ArrayList<String> data = new ArrayList<>();
            //while number of line
            while ((line = bufferedReader.readLine()) != null) {
                //add to array
                data.add(line);
            }
            bufferedReader.close();
            //object to array
            String[] sendReturn = data.toArray(new String[0]);
            return sendReturn;
        } catch (Exception e) {
            e.printStackTrace();
            return new String[] { "Error to read file !" };
        }
    }

    static void calGrade(String id, String score) {
        int scoreStudent = Integer.parseInt(score);
        String grade;
        if (scoreStudent >= 80) {
            grade = "A";
        } else if (scoreStudent >= 75) {
            grade = "B+";
        } else if (scoreStudent >= 70) {
            grade = "B";
        } else if (scoreStudent >= 65) {
            grade = "C+";
        } else if (scoreStudent >= 60) {
            grade = "C";
        } else if (scoreStudent >= 55) {
            grade = "D+";
        } else if (scoreStudent >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        //write file
        writeFile(fileResult, id, grade, scoreStudent);
    }
}
