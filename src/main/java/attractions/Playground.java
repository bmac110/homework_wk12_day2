package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() > 15){
            return false;
        }
        return true;
    }

    public String getName(String name){
        return name;
    }

    public int getRating(int rating) {
        return rating;
    }
}
