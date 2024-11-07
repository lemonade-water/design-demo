package service;

import entity.Products;

public class XiaomiService implements Service {

    @Override
    public void open(Products products) {
        System.out.println(products.getBrand() + "澎湃OS");
    }
}
