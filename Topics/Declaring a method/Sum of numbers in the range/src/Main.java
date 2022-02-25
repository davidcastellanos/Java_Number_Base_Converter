import java.util.Scanner;

public class Main {

    /**
     * The method calculates the sum of integers in a given range
     * 
     * @param from inclusive
     * @param to exclusive
     *
     * @return the sum (long)
     */
    public static long sumInRange(long from, long to) {
        // write your code here
        long result;

        if (from == to) {
            result = 0;

        } else {
            for (long i = from + 1; i < to; i++) {
                from += i;
            }

            result = from;
        }

        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    } 
}