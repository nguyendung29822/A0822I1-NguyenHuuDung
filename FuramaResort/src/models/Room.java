package models;

public class Room extends Facility{
    protected String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceName, double usableArea, double rentalCosts, int nPeople, String rentalType, String freeService) {
        super(serviceName, usableArea, rentalCosts, nPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
