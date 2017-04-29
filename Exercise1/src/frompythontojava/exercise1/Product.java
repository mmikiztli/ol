package frompythontojava.exercise1;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

    public static int idCounter = 0;
    public static List<Product> productList = new ArrayList<>();

    public final int id;
    public String name;
    public float defaultPrice;
    public Currency defaultCurrency;
    public ProductCategory productCategory;
    public Supplier supplier;

    public Product() {
        this.id = idCounter;
        idCounter ++;
        productList.add(this);
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        this.id = idCounter;
        idCounter ++;
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
        productList.add(this);
    }

    public static List<Product> getAllProductsBy(ProductCategory productCategory) {
        return productList.stream()
                .filter(product -> product.productCategory.equals(productCategory))
                .collect(Collectors.toList());
    }

    public static List<Product> getAllProductsBy(Supplier supplier) {
        return productList.stream()
                .filter(product -> product.supplier.equals(supplier))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return  "id:" + id +
                ", name:" + name +
                ", defaultPrice:" + defaultPrice +
                ", defaultCurrency:" + defaultCurrency +
                ", productCategory:" + productCategory +
                ", supplier:" + supplier;
    }

}
