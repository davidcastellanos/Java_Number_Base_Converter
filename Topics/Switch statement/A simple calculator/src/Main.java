import java.util.Scanner;

class Main {

    public static long simpleCalculator(long fNumber, String opr, long sNumber) {
        long result;

        switch (opr) {
            case "-":
                result = fNumber - sNumber;
                break;
            case "*":
                result = fNumber * sNumber;
                break;
            case "/":
                result = fNumber / sNumber;
                break;
            default:
                result = fNumber + sNumber;
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final long fNumber = scanner.nextLong();
        final String opr = scanner.next();
        final long sNumber = scanner.nextLong();

        if (sNumber == 0) {
            System.out.println("Division by 0!");

        } else if ("+".equals(opr) || "-".equals(opr) || "*".equals(opr) || "/".equals(opr)) {
            System.out.println(simpleCalculator(fNumber, opr, sNumber));

        } else {
            System.out.println("Unknown operator");
        }

    }
}