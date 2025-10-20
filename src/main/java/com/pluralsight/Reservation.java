package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;


    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }


    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

public void setIsWeekend(boolean weekend){
        isWeekend = weekend;
}

public double getPrice(){

        double basePrice= 139;
        if(roomType.equalsIgnoreCase("king"));
}

}
