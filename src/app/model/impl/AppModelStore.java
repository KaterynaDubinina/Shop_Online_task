package app.model.impl;

import app.entity.Purchase;
import app.model.AppModel;

public class AppModelStore implements AppModel {

    @Override
    public double calcPayment(Purchase purchase) {
        return purchase.getQuantity() * purchase.getPrice();
    }
}
