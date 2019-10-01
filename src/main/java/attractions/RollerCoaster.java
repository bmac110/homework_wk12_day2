package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed {

    private double price;

    public RollerCoaster(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() > 12){
            if(visitor.getHeight() > 1.45){
                return true;
            }
        }
        return false;
    }

    public double defaultPrice(){
        return price;
    }

    public double priceFor(Visitor visitor){
        if(visitor.getHeight() > 2.00){
            return defaultPrice() * 2;
        }
        return defaultPrice();
    }

    public String getName(String name){
        return name;
    }

    public int getRating(int rating) {
        return rating;
    }
}
