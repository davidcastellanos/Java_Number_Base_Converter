package converter;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static String binary(BigInteger decNumber, int base) {
        return decNumber.toString(base);
    }

    public static String hexadecimal(BigInteger decNumber, int base) {
        return decNumber.toString(base);
    }

    public static String octal(BigInteger decNumber, int base) {
        return decNumber.toString(base);
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number in decimal system: ");
        String inputNum = scanner.next();
        BigInteger decNumber = new BigInteger(inputNum);

        System.out.print("Enter target base (2, 8, or 16): ");
        int base = scanner.nextInt();

        switch (base) {
            case 2:
                System.out.printf("Conversion result: %s", binary(decNumber, base));
                break;
            case 8:
                System.out.printf("Conversion result: %s", octal(decNumber, base));
                break;
            case 16:
                System.out.printf("Conversion result: %s", hexadecimal(decNumber, base));
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }


    }
}
