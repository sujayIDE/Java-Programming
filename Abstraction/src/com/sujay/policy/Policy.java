package com.sujay.policy;

public abstract class Policy {
    private final long policyId;
    private String policyHolder;
    private double basePremium;

    public Policy(long policyId, String policyHolder, double basePremium) {
        this.policyId = policyId;
        this.policyHolder = policyHolder;
        this.basePremium = basePremium;
    }

    public long getPolicyId() {
        return policyId;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(String policyHolder) {
        this.policyHolder = policyHolder;
    }

    public double getBasePremium() {
        return basePremium;
    }

    public void setBasePremium(double basePremium) {
        this.basePremium = basePremium;
    }

    public abstract double riskCalculate();

    double calculateFinalPremium()
    {
        return basePremium+riskCalculate();
    }
}
