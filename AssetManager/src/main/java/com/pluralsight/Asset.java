package com.pluralsight;

public class Asset {
    public int getValue() {
        return 0;
    }
    protected String description;
    protected String dataAcquired;
    protected String originalCost;

    public Asset(String description, String dataAcquired, String originalCost) {
        this.description = description;
        this.dataAcquired = dataAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDataAcquired() {
        return dataAcquired;
    }

    public void setDataAcquired(String dataAcquired) {
        this.dataAcquired = dataAcquired;
    }

    public String getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(String originalCost) {
        this.originalCost = originalCost;
    }

}
