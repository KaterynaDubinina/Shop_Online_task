package app.controller;

import app.entity.Address;
import app.entity.Buyer;
import app.entity.Purchase;
import app.model.impl.AppModelDelivery;
import app.model.impl.AppModelStore;
import app.utils.Rounder;
import app.view.AppView;

public class AppController {

    private final AppView view = new AppView();
    private final static String CURRENCY = "грн";

    public void getStore() {
        String[] data = view.getData();
        Buyer buyer = getBuyer(data);
        Purchase purchase = getPurchase(data);
        String output;
        AppModelStore model = new AppModelStore();
        String payment = Rounder.roundValue(model.calcPayment(purchase));
        output = "\nПокупець:  " + buyer.getName() + "\n           " + buyer.getPhone() +
                "\nДо сплати: " + payment + " " + CURRENCY +
                "\nЗабирай замовлення вже сьогодні в будь-якому з наших магазинів!";
        view.getOutput(output);
    }

    public void getDelivery() {
        String[] data = view.getData();
        String[] dataExtra = view.getExtraData();
        Purchase purchase = getPurchase(data);
        Buyer buyer = getBuyer(data);
        Address address = getAddress(dataExtra);
        String output;
        AppModelDelivery model = new AppModelDelivery();
        String payment = Rounder.roundValue(model.calcPayment(purchase));
        output = "\nПокупець:  " + buyer.getName() + "\n           " + buyer.getPhone() + "\n           м. " +
                address.getCity() + ", вул. " + address.getStreet() + ", буд. " + address.getHouse() +
                "\nДо сплати: " + payment + " " + CURRENCY +
                "\nДякуємо за замовлення, очікуй на доставку!";
        view.getOutput(output);
    }

    private Purchase getPurchase(String[] data) {
        return new Purchase(data[0], Integer.parseInt(data[1]));
    }
    private Buyer getBuyer(String[] data) {
        return new Buyer(data[2], data[3]);
    }
    private Address getAddress (String[] dataExtra) {
        return new Address(dataExtra[0], dataExtra[1], dataExtra[2]);
    }

}
