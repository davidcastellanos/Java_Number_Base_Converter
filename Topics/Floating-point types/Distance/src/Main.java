import java.util.Scanner;

class Main {

    public static double busAverageSpeed(double d, double t) {
        return d / t;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        double distance = scanner.nextDouble();
        double travelTime = scanner.nextDouble();

        System.out.println(busAverageSpeed(distance, travelTime));

    }
}