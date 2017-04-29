package frompythontojava.exercise1;

import java.util.List;
import java.util.Objects;

public class ProductCategory {

    public static int idCounter = 0;

    public int id;
    public String name;
    public String department;
    public String description;

    public ProductCategory() {
        this.id = idCounter;
        this.idCounter++;
    }

    // this is dangerous
    public ProductCategory(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProductCategory(String name, String department, String description) {
        this.id = idCounter;
        this.idCounter++;
        this.name = name;
        this.department = department;
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
        ProductCategory that = (ProductCategory) o;
        return id == that.id &&
               Objects.equals(name, that.name) &&
               Objects.equals(department, that.department) &&
               Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, description);
    }

    @Override
    public String toString() {
        return  "id:" + id +
                ", name:" + name +
                ", department:" + department +
                ", description:" + description;
    }

}


