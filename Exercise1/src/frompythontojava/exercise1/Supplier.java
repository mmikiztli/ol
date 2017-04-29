package frompythontojava.exercise1;

import java.util.List;
import java.util.Objects;

public class Supplier {

    public static int idCounter = 0;

    public final int id;

    public String name;
    public String description;

    public Supplier() {
        this.id = idCounter;
        idCounter++;
    }

    public Supplier(String name, String description) {
        this.id = idCounter;
        idCounter++;
        this.name = name;
        this.description = description;
    }

    public List<Product> getProducts() {
        return Product.getAllProductsBy(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Supplier supplier = (Supplier) o;
        return id == supplier.id &&
               Objects.equals(name, supplier.name) &&
               Objects.equals(description, supplier.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }

    @Override
    public String toString() {
        return "id:" + id +
               ", name:" + name +
               ", description:" + description;
    }
}
