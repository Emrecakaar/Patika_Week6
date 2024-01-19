import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("src/patika.txt");//Dosyamda ki akışa ulaşıyorum.
            BufferedReader buffRead = new BufferedReader(file);//Dosyamda ki yazıları satır satır yazdırıyorum

            String line;
            int i = 0;
            while ((line = buffRead.readLine()) != null) {//While döngüsü içinde dosyamda yazılan sayılara satır satır ulaşıp toplama işlemini yaptırıyorum.
                int number1 = Integer.parseInt(line);
                i += number1;

            }
            buffRead.close();//Bütün sayılar okunup toplandıktan sonra durduruyorum.
            System.out.println(i);//En son gelen bütümn rakamların toplamını yazdırıyorum.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}