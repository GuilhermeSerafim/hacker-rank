package desafios1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        if (!(payment >= 0 && payment <= Math.pow(10, 9)))
            return;
        exibeFormatosDeAcordoComValor(payment);
    }

    public static void exibeFormatosDeAcordoComValor(double payment) {
        String us = "", india = "", china = "", france = "";

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat
                .getCurrencyInstance(new Locale.Builder().setLanguage("en").setRegion("IN").build());
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        us = usFormat.format(payment);
        india = indiaFormat.format(payment);
        china = chinaFormat.format(payment);
        france = franceFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
