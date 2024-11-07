package service;

import entity.Products;

public class HuaweiService implements Service {

    @Override
    public void open(Products products) {
        System.out.println(products.getBrand() + "鸿蒙");
    }
}
