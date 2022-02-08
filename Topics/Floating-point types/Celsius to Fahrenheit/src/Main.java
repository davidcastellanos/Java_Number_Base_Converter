import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final double n = 1.8;
        final int m = 32;
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * n + m;

        System.out.println(fahrenheit);

    }
}