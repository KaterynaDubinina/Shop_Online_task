package app.model.impl;

import app.entity.Purchase;
import app.model.AppModel;

public class AppModelStore implements AppModel {

    private static final double CONSTANT = 9.99;
    @Override
    public double calcPayment(Purchase purchase) {
        return purchase.getQuantity() * CONSTANT;
    }
}
