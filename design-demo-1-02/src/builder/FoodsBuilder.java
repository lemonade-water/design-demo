package builder;

import entity.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * 食物创建
 */
public class FoodsBuilder {

    private List<Item> foods = new ArrayList<>();

    public FoodsBuilder addItem(Item item){
        foods.add(item);
        return this;
    }
}
