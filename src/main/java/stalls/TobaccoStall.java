package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

//    private int rating;

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
//        this.rating = rating;
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() >= 18){
            return true;
        }
        return false;
    }

    public String getName(String name){
        return name;
    }

    public int getRating(int rating) {
        return rating;
    }
}
