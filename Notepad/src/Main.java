import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String inputText = scanner.nextLine();

        try {
            FileWriter fileWriter = new FileWriter("src/patika.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(inputText);
            printWriter.close();

            FileReader fileReader = new FileReader("src/patika.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}