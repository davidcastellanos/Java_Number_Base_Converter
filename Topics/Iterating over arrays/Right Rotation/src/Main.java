import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        int lastValue;
        int lastIndex;

        for (int i = 1; i <= steps; i++) {

            lastValue = arr[arr.length - 1];
            lastIndex = arr.length - 1;

            for (int j = lastIndex; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = lastValue;
        }

    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}