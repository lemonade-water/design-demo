package factory;

import entity.ProductParts;
import entity.Products;
import service.HuaweiService;
import service.OppoService;
import service.Service;
import service.XiaomiService;

public class AndriodPhoneFactory implements Factory{
    @Override
    public Products create(ProductParts productParts) {
        Products products = new Products();
        products.setBrand(productParts.getBrand());
        products.setProductParts(productParts);
        return products;
    }

    @Override
    public Service getService(ProductParts productParts) {
        String brand = productParts.getBrand();
        return switch (brand) {
            case "Xiaomi" -> new XiaomiService();
            case "Oppo" -> new OppoService();
            case "Huawei" -> new HuaweiService();
            default -> null;
        };
    }
}
