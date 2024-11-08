import builder.FoodsBuilder;
import drinks.Cola;
import entity.Item;
import frenchFries.SmallFrenchFries;
import hamburger.BeefHamburger;

public class Main {
    /**
     * 建造者模式
     * @param args
     */
    public static void main(String[] args) {
        FoodsBuilder builder = new FoodsBuilder();
        Item cola = new Cola("small");
        Item beefHamburger = new BeefHamburger();
        SmallFrenchFries smallFrenchFries = new SmallFrenchFries("big");
        builder.addItem(beefHamburger)
                .addItem(cola)
                .addItem(smallFrenchFries);
    }
}