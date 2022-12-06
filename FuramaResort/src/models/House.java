package models;

public class House extends Facility {
    protected String roomStander;
    protected int numberFloors;

    public House(String roomStander, int numberFloors) {
        this.roomStander = roomStander;
        this.numberFloors = numberFloors;
    }

    public House(String serviceName, double usableArea, double rentalCosts, int nPeople, String rentalType, String roomStander, int numberFloors) {
        super(serviceName, usableArea, rentalCosts, nPeople, rentalType);
        this.roomStander = roomStander;
        this.numberFloors = numberFloors;
    }

    public String getRoomStander() {
        return roomStander;
    }

    public void setRoomStander(String roomStander) {
        this.roomStander = roomStander;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }
}
