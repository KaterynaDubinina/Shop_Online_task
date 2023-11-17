package app.model.impl;

import app.entity.Purchase;
import app.model.AppModel;

public class AppModelDelivery implements AppModel {

    @Override
    public double calcPayment(Purchase purchase) {
        double cost = purchase.getQuantity() * purchase.getPrice();
        return cost + cost / 100 * 5;
    }
}
