import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final double r = scanner.nextDouble(); // Radius
        final double pi = Math.PI; // PI

        final double s = pi * (r * r); // Circle area
        System.out.println(s);
    }
}