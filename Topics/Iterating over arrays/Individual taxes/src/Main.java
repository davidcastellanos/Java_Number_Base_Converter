import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int numOfComps = scanner.nextInt();
        int[] incomeByComp = new int[numOfComps];
        int[] taxesByComp = new int[numOfComps];
        int paidTaxes = Integer.MIN_VALUE;
        int companyWithMostTaxes = 0;

        for (int i = 0; i < numOfComps; i++) {
            incomeByComp[i] = scanner.nextInt();
        }

        for (int i = 0; i < numOfComps; i++) {
            taxesByComp[i] = scanner.nextInt();
        }

        if (numOfComps == 1) {
            companyWithMostTaxes = incomeByComp.length;

        } else {
            for (int i = 1; i <= incomeByComp.length; i++) {
                int tempTaxes = incomeByComp[i - 1] * taxesByComp[i - 1];
                if (paidTaxes < tempTaxes) {
                    paidTaxes = tempTaxes;
                    companyWithMostTaxes = i;
                }
            }
        }

        System.out.println(companyWithMostTaxes);


    }
}