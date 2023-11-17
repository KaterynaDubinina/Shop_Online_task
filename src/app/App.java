package app;

import app.controller.AppController;

import java.util.Scanner;

public class App {

    static Scanner scanner;

    public static void main(String[] args) {
        runStore(getStore());
    }

    private static int getStore(){
        System.out.print("""
                               
                             \uD83D\uDC9B Слава Україні \uD83D\uDC99
                           Вітаємо у магазині Idea!
                
                \uD83E\uDD11 Знаємо, ти точно вже щось обрав, тож, тисни: \uD83E\uDD11
                
                1\uFE0F\u20E3   для замовлення самовивозу \uD83C\uDFC3
                2\uFE0F\u20E3   для замовлення з доставкою \uD83D\uDE9A
                """);
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void runStore(int store) {
        switch (store) {
            case 1 -> {
                AppController controller = new AppController();
                controller.getStore();
            }
            case 2 -> {
                AppController controller = new AppController();
                controller.getDelivery();
            }
            default -> System.out.println("No such option");
        }
    }
}
