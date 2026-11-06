import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean continueYN;
        double itemPrice = 0.00;
        double totalPrice = 0.00;

        do {
            itemPrice = InputHelper.getRangedDouble(scan, "Enter the item price:", 0.50, 9.99);

            totalPrice += itemPrice;


            continueYN = InputHelper.getYNConfirm(scan, "Do you want to add another item [Y/N]");

        } while (continueYN);
        System.out.printf("Total Cost in $: %.2f\n ", totalPrice);
    }
}