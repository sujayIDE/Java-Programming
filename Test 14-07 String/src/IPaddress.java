public class IPaddress {
    public static String defangIPaddr(String address)
    {
        if(address.length()<=15)
        {
            address=address.replace(".","[.}");
        }
        return address;
    }
    public static void main(String[] args) {
        String address="1.1.1.1";
        System.out.println( defangIPaddr(address));
    }
}
