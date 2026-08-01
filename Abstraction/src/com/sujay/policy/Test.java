package com.sujay.policy;

public class Test {
    public static void main(String[] args) {
        Policy healthPolicy=new HealthPolicy(14343435,"Mayank",20000,55,true);
        double finalPremium=healthPolicy.calculateFinalPremium();
        System.out.println("=========Health_Policy Details==========");
        System.out.println("Policy_Id: " +healthPolicy.getPolicyId());
        System.out.println("Policy_Holder: "+healthPolicy.getPolicyHolder());
        System.out.println("BasePremium: "+healthPolicy.getBasePremium());
        System.out.println("Final_Premium: "+finalPremium);

        System.out.println("=======================================================");
        Policy vehiclPolicy=new VehiclePolicy(255454454,"Suraj",40000,"Diesel",2020);
        double finaprem=vehiclPolicy.calculateFinalPremium();
        System.out.println("=========Vehicle_Policy==================");
        System.out.println("Policy_Id: "+vehiclPolicy.getPolicyId());
        System.out.println("Policy_Holder: "+vehiclPolicy.getPolicyHolder());
        System.out.println("BAsePremium: "+vehiclPolicy.getBasePremium());
        System.out.println("Final_Premium: "+finaprem);

    }
}
