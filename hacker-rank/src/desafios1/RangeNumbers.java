package desafios1;

import java.util.Scanner;

public class RangeNumbers {
    public static void main(String[] args) throws Exception {
        int caseTests;
        Scanner in = new Scanner(System.in);
        caseTests = in.nextInt();
        in.nextLine();
        String[] arr = new String[caseTests];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextLine();
        }
        imprimeRangeDeNumeros(caseTests, arr);
        in.close();
    }

    public static void imprimeRangeDeNumeros(int caseTests, String[] arrCaseTests) {
        for (int i = 0; i < arrCaseTests.length; i++) {
            try {
                long n = Long.parseLong(arrCaseTests[i]);
                System.out.println(n + " can be fitted in:");
                if (n > -128 && n <= 127) {
                    System.out.println("* byte");
                }
                if (n > -32768 && n <= 32767) {
                    System.out.println("* short");
                }
                if (n > Math.pow(-2, 31) && n <= Math.pow(2, 31) - 1) {
                    System.out.println("* int");
                }
                if (n > Math.pow(-2, 63) && n <= Math.pow(2, 63) - 1) {
                    System.out.println("* long");
                }

            } catch (NumberFormatException e) {
                System.out.println(arrCaseTests[i] + " can't be fitted anywhere.");
            }
        }
    }
}
