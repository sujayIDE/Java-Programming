public class Pass_By_Reference {
    void m1(StringBuffer sb)
    {
        sb.append("World");
    }
    public static void main(String[] args) {
        Pass_By_Reference p=new Pass_By_Reference();
        StringBuffer sb=new StringBuffer("Hello");
        p.m1(sb);
        System.out.println(sb);
    }
}
