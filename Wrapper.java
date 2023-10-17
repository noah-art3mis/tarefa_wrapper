
/**
 * Wrapper
 */
import java.util.Scanner;

public class Wrapper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        if (scanner.hasNextInt()) {
            int inputValue = scanner.nextInt();
            Integer wrappedValue = inputValue;
            System.out.println(wrappedValue + " convertido de int para Integer");23
        } else {
            System.out.println("Erro. Por favor insira um int");
        }

        scanner.close();
    }
}
