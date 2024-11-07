package factory;

import entity.ProductParts;
import entity.Products;
import service.Service;

public interface Factory {
    Products create(ProductParts productParts);
    Service getService(ProductParts productParts);
}
