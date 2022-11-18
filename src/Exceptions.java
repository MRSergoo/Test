import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключениея в методе main");
        }
    }
/*        try {
            Scanner scanner = new Scanner(file);
            System.out.println("После сканнера");

        } catch (FileNotFoundException e) {
            System.out.println("file mot found");
        }
        System.out.println("После блога try catch");
*/

    public static  void readFile() throws FileNotFoundException {
        File file = new File("teiasdds");
        Scanner scanner = new Scanner(file);
    }
}
