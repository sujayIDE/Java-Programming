public class VisitorCount {
    static int visitorCount;
    String name;

    static {
        visitorCount=0;
    }

    public VisitorCount(String name)
    {
        this.name=name;
    }

    void newVisitor()
    {
        System.out.println("Visitor name: "+name);
        visitorCount++;
    }

    static int getVisitorCount()
    {
        return visitorCount;
    }

    public static void main(String[] args) {
        VisitorCount vc=new VisitorCount("Rocky");
        vc.newVisitor();
        int count=getVisitorCount();
        System.out.println("Count: "+count);
    }
}
