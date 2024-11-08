package entity;

import java.io.Serializable;

public class Item implements Serializable {
    private String name;

    private String size;

    protected Item(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
