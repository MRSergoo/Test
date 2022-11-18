import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("test2");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ") ;
        int[] numbers = new int[6];
        int counter = 0;
        for (String a: numbersString) {
            numbers[counter++] = Integer.parseInt(a);

        }
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }

    }



