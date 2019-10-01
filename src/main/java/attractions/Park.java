package attractions;

import behaviours.IReviewed;

public class Park extends Attraction {

    public Park(String name, int rating) {
        super(name, rating);
    }

    public String getName(String name){
        return name;
    }

    public int getRating(int rating) {
        return rating;
    }
}
