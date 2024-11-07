package entity;

import java.io.Serializable;

/**
 * 商品
 */
public class Products implements Serializable {
    /**
     * 品牌
     */
    private String brand;

    private ProductParts productParts;

    public ProductParts getProductParts() {
        return productParts;
    }

    public void setProductParts(ProductParts productParts) {
        this.productParts = productParts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
