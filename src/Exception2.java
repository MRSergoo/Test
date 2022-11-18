import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (!(count==10)) {
            count++;
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                throw new ScannerException("Пользователь ввел что-то кроме нуля");
            }

        }

    }
}
