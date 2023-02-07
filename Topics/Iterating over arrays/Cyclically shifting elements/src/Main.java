import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int arrayLength = scanner.nextInt();
        int[] a = new int[arrayLength];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print(a[a.length - 1] + " ");

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }

    }
}

/*class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr =  new int[size];

        for (int i = 0; i < arr.length; i++) {
            int newIndex = i + 1;
            if (newIndex >= size) {
                newIndex -= size;
            }
            arr[newIndex] = sc.nextInt();
        }

        for (int val: arr) {
            System.out.print(val + " ");
        }
    }
}*/
