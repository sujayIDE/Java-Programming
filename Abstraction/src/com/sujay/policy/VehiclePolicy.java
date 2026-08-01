package com.sujay.policy;

public class VehiclePolicy extends Policy{
    String fuelType;
    int mgfYear;

    public VehiclePolicy(long policyId, String policyHolder, double basePremium, String fuelType, int mgfYear) {
        super(policyId, policyHolder, basePremium);
        this.fuelType = fuelType;
        this.mgfYear = mgfYear;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getMgfYear() {
        return mgfYear;
    }

    public void setMgfYear(int mgfYear) {
        this.mgfYear = mgfYear;
    }

    @Override
    public double riskCalculate() {
        if(fuelType.equals("Diesel") && mgfYear<2020)
        {
            return getBasePremium()*20;
        }else
            return getBasePremium()*20;
    }
}
