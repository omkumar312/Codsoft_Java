import java.util.Scanner;

class CurrencyConverter {
    static class Currency {
        // Currency exchange rates with respect to Indian Rupee
        double[] rates = {1, 56.632709, 0.528833, 108.443807, 83.5404, 91.0268};
        String[] names = {"Indian Rupee","Australian Dollar", "Japanese Yen", "Pound Sterling", "United States Dollar", "Euro"};
        int n = rates.length;
    }

    public static void main(String[] args) {
        System.out.println("CURRENCY CONVERTER");

        Scanner scan = new Scanner(System.in);
        Currency currency = new Currency();

        while (true) {
            System.out.println("Available Currencies:");
            for (int k = 0; k < currency.n; k++) {
                System.out.println((k + 1) + ". " + currency.names[k]);
            }
            System.out.println((currency.n + 1) + ". Exit");

            System.out.print("\nSelect currency name using the number-->\n");

            System.out.print("\nSelect the currency to convert from (number): ");
            int from = scan.nextInt();
            if (from == currency.n + 1) {
                break;
            }

            System.out.print("Select the currency to convert to (number): ");
            int to = scan.nextInt();

            System.out.print("Enter Amount: ");
            double amount = scan.nextDouble();

            if (from < 1 || from > currency.n || to < 1 || to > currency.n) {
                System.out.println("\nINVALID CHOICE\n");
                continue;
            }

            double result = amount * currency.rates[from - 1] / currency.rates[to - 1];
            System.out.printf("\n%.2f %s = %.2f %s\n\n", amount, currency.names[from - 1], result, currency.names[to - 1]);
        }

        scan.close();
        System.out.println("Thank you for using the currency converter.");
    }
}

