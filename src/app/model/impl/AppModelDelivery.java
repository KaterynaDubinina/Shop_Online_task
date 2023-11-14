package app.model.impl;

import app.entity.Purchase;
import app.model.AppModel;

public class AppModelDelivery implements AppModel {
    private static final double CONSTANT = 9.99;
    @Override
    public double calcPayment(Purchase purchase) {
        double cost = purchase.getQuantity() * CONSTANT;
        return cost + cost / 100 * 5;
    }
}
