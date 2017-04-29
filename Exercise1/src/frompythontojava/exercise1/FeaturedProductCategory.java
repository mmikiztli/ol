package frompythontojava.exercise1;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory {

    public Date startDate;
    public Date endDate;

    public FeaturedProductCategory() {
        super();
    }

    public void schedule(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": " + super.toString();
    }
}
