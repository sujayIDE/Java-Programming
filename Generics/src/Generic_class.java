public class Generic_class <T>{
    T content;
    String name;

    public T getContent() {
        return content;
    }

    public String getName()
    {
        return name;
    }
    public void setContent(T content,String name) {
        this.content = content;
        this.name=name;
    }

    public static void main(String[] args) {
        Generic_class<Integer> genericClass=new Generic_class<>();
        genericClass.setContent(1000,"Sujay");
        int i=genericClass.getContent();
        System.out.println(i);
        String name=genericClass.getName();
        System.out.println(name);
    }
}
