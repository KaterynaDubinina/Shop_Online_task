package app.view;

import java.util.Locale;
import java.util.Scanner;

public class AppView {

    private final Scanner scanner = new Scanner(System.in);

    public String[] getData() {
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Введи назву товару: ");
        String productName = scanner.nextLine().trim();
        System.out.print("Введи кількість, шт: ");
        String quantity = scanner.nextLine().trim();
        System.out.println("\n\uD83D\uDECD\uFE0F Супер, ми майже біля цілі \uD83D\uDECD\uFE0F\n");
        System.out.print("А тепер, введи своє ім'я: ");
        String buyerName = scanner.nextLine().trim();
        System.out.print("         введи свій номер телефону: ");
        String number = scanner.nextLine().trim();
        return new String[]{productName, quantity, buyerName, number};
    }
    public String[] getExtraData() {
        System.out.print("\n         введи своє місто: ");
        String city = scanner.nextLine().trim();
        System.out.print("         введи свою вулицю: ");
        String  street = scanner.nextLine().trim();
        System.out.print("         введи свій будинок: ");
        String  house = scanner.nextLine().trim();
        scanner.close();
        return new String[]{city, street, house};
    }


    public void getOutput(String output) {
        System.out.println(output);
    }
}
