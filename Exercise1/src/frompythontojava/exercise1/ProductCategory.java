package frompythontojava.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 2017.04.25..
 */
public class ProductCategory {

    public int id;
    public static int idCounter = 0;
    public String name;
    public String department;
    public String description;

    protected List<Product> products;

    public ProductCategory() {
        this.id = idCounter;
        this.idCounter++;
        this.products = new ArrayList<>();
    }

    public ProductCategory(String name, String department, String description) {
        this.id = idCounter;
        this.idCounter++;
        this.name = name;
        this.department = department;
        this.description = description;
        this.products = new ArrayList<>();
    }

    public ProductCategory(int id, String name) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.description = description;
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return  "id:" + id +
                ", name:" + name +
                ", department:" + department +
                ", description:" + description +
                ", products:" + products;
    }
}


