package service;

import entity.Products;

public class OppoService implements Service {

    @Override
    public void open(Products products) {
        System.out.println(products.getBrand() + "ColorOS");
    }
}
