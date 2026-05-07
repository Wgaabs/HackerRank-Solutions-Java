import java.util.*;
import java.text.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double payment = scanner.nextDouble();
        scanner.close();

        DecimalFormatSymbols usSymbols = new DecimalFormatSymbols(Locale.US);

        DecimalFormat us = new DecimalFormat("#,##0.00", usSymbols);
        us.setPositivePrefix("$");

        // Agrupamento indiano: 2-2-3 da direita para esquerda
        DecimalFormat india = new DecimalFormat("#,##,##0.00", usSymbols);
        india.setPositivePrefix("Rs.");

        DecimalFormat china = new DecimalFormat("#,##0.00", usSymbols);
        china.setPositivePrefix("\uffe5");

        DecimalFormatSymbols frSymbols = new DecimalFormatSymbols(Locale.US);
        frSymbols.setGroupingSeparator(' ');
        frSymbols.setDecimalSeparator(',');
        DecimalFormat france = new DecimalFormat("#,##0.00", frSymbols);
        france.setPositiveSuffix(" \u20ac");

        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}