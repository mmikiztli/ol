package frompythontojava.exercise1;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

/**
 * Created by marti on 2017.04.25..
 */
public class Product {

    public int id;
    public static int idCounter = 0;
    public String name;
    public float defaultPrice;
    public Currency defaultCurrency;
    public ProductCategory productCategory;
    public Supplier supplier;
    public static List<Product> productList = new ArrayList<>();

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
        supplier.products.add(this);
    }

    public Product() {
        this.id = idCounter;
        this.idCounter ++;
        productList.add(this);
    }


    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        this.id = idCounter;
        this.idCounter ++;
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
        productList.add(this);
    }


}
