package models;

public class Villa extends Facility {
    protected String roomStandard;
    protected double swimmingPoolArea;
    protected int numberFloors;

    public Villa(String roomStandard, double swimmingPoolArea, int numberFloors) {
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberFloors = numberFloors;
    }

    public Villa(String serviceName, double usableArea, double rentalCosts, int nPeople, String rentalType, String roomStandard, double swimmingPoolArea, int numberFloors) {
        super(serviceName, usableArea, rentalCosts, nPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }
}
