import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arrStr = str.split(" ");

        boolean result = false;

        for (int i = 0; i < arrStr.length - 1; i++) {
            result = arrStr[i].compareTo(arrStr[i + 1]) <= 0;
        }

        System.out.println(result);


    }
}