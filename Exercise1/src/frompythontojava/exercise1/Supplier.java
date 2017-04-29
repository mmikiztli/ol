package frompythontojava.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 2017.04.25..
 */
public class Supplier {

    public int id;
    public static int idCounter = 0;
    public String name;
    public String description;

    protected List<Product> products;

    public Supplier() {
        this.id = idCounter;
        this.idCounter++;
        this.products = new ArrayList<>();
    }

    public Supplier(String name, String description) {
        this.id = idCounter;
        this.idCounter++;
        this.name = name;
        this.description = description;
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "id:" + id +
                ", name:" + name +
                ", description:" + description +
                ", products:" + products;
    }
}
