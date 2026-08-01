public class Pass_By_Reference_Only_Pass_By_Value {
    void m1(StringBuffer bf)
    {
        bf=new StringBuffer("Java");
        System.out.println(bf);
    }
    public static void main(String[] args) {
        Pass_By_Reference_Only_Pass_By_Value pbr=new Pass_By_Reference_Only_Pass_By_Value();
        StringBuffer sb=new StringBuffer("Hello");
        pbr.m1(sb);
        System.out.println(sb);
    }
}
