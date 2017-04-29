package frompythontojava.exercise1;

import java.util.Date;

/**
 * Created by marti on 2017.04.25..
 */
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
