import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        ArrayList<Integer> arrayNums = new ArrayList<>(arrayLength);
        int indexMaxNum = 0;

        for (int i = 0; i < arrayLength; i++) {
            arrayNums.add(i, scanner.nextInt());
        }


        int referenceNum = arrayNums.get(0);

        for (int i = 0; i < arrayLength; i++) {
            int num = arrayNums.get(i);
            if (num > referenceNum) {
                indexMaxNum =  arrayNums.indexOf(num);
                referenceNum = arrayNums.get(i);
            }

        }

        System.out.println(indexMaxNum);

    }
}