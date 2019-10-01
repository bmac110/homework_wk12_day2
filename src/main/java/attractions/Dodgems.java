package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction{

    private double price;

    public Dodgems(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }

    public double defaultPrice(){
        return price;
    }

    public double priceFor(Visitor visitor){
        if(visitor.getAge() > 12.00){
            return defaultPrice() / 2;
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
