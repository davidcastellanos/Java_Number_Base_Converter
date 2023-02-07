import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        final int length = 3;
        int[] box1 = new int[length];
        int[] box2 = new int[length];

        for (int i = 0; i < box1.length; i++) {
            box1[i] = scanner.nextInt();
        }

        for (int i = 0; i < box2.length; i++) {
            box2[i] = scanner.nextInt();
        }


        Arrays.sort(box1);
        Arrays.sort(box2);
        String result;

        /*result = box1[0] > box2[0] && box1[1] > box2[1]
                && box1[2] > box2[2] ? "Box 1 > Box 2" : box2[0] > box1[0] && box2[1] > box1[1] &&
                box2[2] > box1[2] ? "Box 1 < Box 2" : "Incompatible";*/

        if (box1[0] > box2[0] && box1[1] > box2[1] && box1[2] > box2[2]) {
            result = "Box 1 > Box 2";

        } else if (box2[0] > box1[0] && box2[1] > box1[1] && box2[2] > box1[2]) {
            result = "Box 1 < Box 2";
        } else {
            result = "Incompatible";
        }

        System.out.println(result);

    }
}
