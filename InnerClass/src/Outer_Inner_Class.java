class Mobile{
    private String model="Samsung";
    void showdata()
    {
        //Sim s=new Sim();
        System.out.println("Model: "+model);
        //System.out.println("ProviderCompany: "+providerCompany);
    }
    class Sim{
        private String providerCompany="Jio";
        void printData()
        {
            System.out.println("ProviderCompany: "+providerCompany);
            System.out.println("Model: "+model);
        }
    }
}

public class Outer_Inner_Class {
    public static void main(String[] args) {
        Mobile m=new Mobile();
        m.showdata();

        Mobile.Sim sim = m.new Sim();
        sim.printData();
    }
}
