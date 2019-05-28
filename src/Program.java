import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by OUT-Akopyan-SR on 28.05.2019.
 */
public class Program {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("После ввода слова 'stop' программа заканчивает работу");
        try (FileWriter fw = new FileWriter("C:\\Users\\OUT-Akopyan-SR\\Downloads\\Новая папка\\text.txt"))
        {
            do {
                System.out.print("Вы ввели : ");
                str = br.readLine();
                if (str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException ext) {
            System.out.println("Ошибка ввода-вывода: " + ext);
        }
    }
}
