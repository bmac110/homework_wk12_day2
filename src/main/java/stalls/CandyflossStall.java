package stalls;

import behaviours.IReviewed;

public class CandyflossStall extends Stall implements IReviewed{

    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);

    }

    public String getName(String name){
        return name;
    }

    public int getRating(int rating) {
        return rating;
    }
}
