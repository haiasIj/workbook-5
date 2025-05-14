package com.pluralsight;



public class House extends Asset {
    public House(String description, String dataAcquired, String originalCost) {
        super(description, dataAcquired, originalCost);
    }
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public House(String description, String dataAcquired, String originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dataAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;

    }
    // A house's value is determined as
    // $180.00 per square foot (excellent)
    // $130.00 per square foot (good)
    // $90.00 per square foot (fair)
    // $80.00 per square foot (poor)
    // PLUS 25 cents per square foot of lot size
    @Override
    public int getValue() {
        return 0;
    }
}
