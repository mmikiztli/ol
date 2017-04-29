package frompythontojava.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import java.util.Random;

public class Main {

    private static final int TEST_COUNT = 10;

    private static Random randomGenerator = new Random();
    private static List<Supplier> suppliers = getSuppliers();
    private static List<ProductCategory> categories = getCategories();
    private static Currency currency = Currency.getInstance("EUR");

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        for (int i = 0; i < TEST_COUNT; i++) {
            products.add(getProduct("p-" + i + "-1", randomGenerator.nextFloat(), currency, randomElement(suppliers),
                                    randomElement(categories)));

            products.add(getProduct("p-" + i + "-2", randomElement(suppliers), randomElement(categories)));
        }

        for (Product p : products) {
            System.out.println(p);
        }
    }

    private static Product getProduct(String name, Supplier supplier, ProductCategory category) {
        Product product = new Product();
        product.name = name;
        product.supplier = supplier;
        product.productCategory = category;
        return product;
    }

    private static Product getProduct(String name, float price, Currency currency, Supplier supplier, ProductCategory
            category) {
        Product product = new Product(name, price, currency);
        product.name = name;
        product.supplier = supplier;
        product.productCategory = category;
        return product;
    }

    private static <T> T randomElement(List<T> list) {
        int index = randomGenerator.nextInt(list.size());
        return list.get(index);
    }

    private static List<Supplier> getSuppliers() {
        Supplier supplier1 = new Supplier();
        supplier1.name = "s1";

        Supplier supplier2 = new Supplier("s2", "supplier-2");

        return Arrays.asList(supplier1, supplier2);
    }

    private static List<ProductCategory> getCategories() {
        ProductCategory productCategory1 = new ProductCategory();
        productCategory1.name = "pc1";

        ProductCategory productCategory2 = new ProductCategory(99, "pc2");

        ProductCategory productCategory3 = new ProductCategory("pc3", "dept", "pc3-desc");

        ProductCategory productCategory4 = new FeaturedProductCategory();
        productCategory4.name = "fpc4";

        return Arrays.asList(productCategory1, productCategory2, productCategory3, productCategory4);
    }

}
