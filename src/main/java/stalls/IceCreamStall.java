package stalls;

import behaviours.IReviewed;

public class IceCreamStall extends Stall {

//    private int rating;

    public IceCreamStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
//        this.rating = rating;
    }

    public String getName(String name){
        return name;
    }

    public int getRating(int rating) {
        return rating;
    }
}
