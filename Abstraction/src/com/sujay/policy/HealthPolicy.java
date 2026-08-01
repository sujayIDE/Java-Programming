package com.sujay.policy;

public class HealthPolicy extends Policy{
    private int age;
    private boolean isSmoker;

    public HealthPolicy(long policyId, String policyHolder, double basePremium, int age, boolean isSmoker) {
        super(policyId, policyHolder, basePremium);
        this.age = age;
        this.isSmoker = isSmoker;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSmoker() {
        return isSmoker;
    }

    public void setSmoker(boolean smoker) {
        isSmoker = smoker;
    }

    @Override
    public double riskCalculate() {
        if(age>60 && isSmoker)
        {
            return getBasePremium()*0.25;
        } else if (age>60) {
            return getBasePremium()*10;
        }else
            return 0;
    }
}
