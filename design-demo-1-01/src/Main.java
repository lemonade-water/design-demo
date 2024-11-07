import entity.ProductParts;
import entity.Products;
import factory.AndriodPhoneFactory;
import factory.Factory;
import service.Service;

public class Main {
    public static void main(String[] args) {
        ProductParts productParts = new ProductParts();
        productParts.setBrand("Xiaomi");
        productParts.setCpu("骁龙8至尊版");
        Factory factory = new AndriodPhoneFactory();
        Products products = factory.create(productParts);
        Service service = factory.getService(productParts);
        service.open(products);
    }
}