import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int numOfComps = scanner.nextInt();
        int[] incomeByComp = new int[numOfComps];
        int[] businessTax = new int[numOfComps];
        final double hundred = 100;
        int a = 0;
        double taxesPaid = 0;
        double highestPayingComp = 0;
        int companyIndex = 1;


        for (int i = 0; i < incomeByComp.length; i++) {
            incomeByComp[i] = scanner.nextInt();
        }

        for (int i = 0; i < businessTax.length; i++) {
            businessTax[i] = scanner.nextInt();
        }




        for (int j = 0; j < incomeByComp.length; j++) {
            taxesPaid = (incomeByComp[j] / hundred) * businessTax[j];

            if (taxesPaid > highestPayingComp) {
                highestPayingComp = taxesPaid;
                companyIndex = companyIndex + j;
            }
            //a++;

        }


       /* if ( incomeByComp.length == 1) {
            highestPayingComp = 1;

        } else {
            for (int i = 0; i < incomeByComp.length - 1; i++) {

                a = (incomeByComp[i] / hundred) * businessTax[i];
                b = (incomeByComp[i + 1] / hundred) * businessTax[i + 1];
                System.out.println(a);
                System.out.println(b);

                if (a >= b) {
                    acumA = acumA + 1;
                    highestPayingComp = i + 1;
                    System.out.println("Acum A " + acumA);

                } else {
                    acumB = acumB + 1;
                    highestPayingComp = i + 2;
                    System.out.println("Acum B " + acumB);

                }

                //highestPayingComp = acumA > acumB ? i + 1 : i + 2;


            }

        }*/




        /*System.out.println(Arrays.toString(incomeByComp));
        System.out.println(Arrays.toString(businessTax));
        System.out.println(highestPayingComp);*/
        System.out.println(companyIndex);
    }
}