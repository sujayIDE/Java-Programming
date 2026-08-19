public final class ImmutableClassDemo {
    private final String name;
    private final double salary;
    private final Address address;

    public ImmutableClassDemo(String name, double salary,Address address) {
        this.name = name;
        this.salary = salary;
        this.address=new Address(address.getAddress());
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Address getAddress() {
        return new Address(address.getAddress());
    }

    public static void main(String[] args) {
        Address address1 = new Address("Pune");

        ImmutableClassDemo immutableClassDemo =
                new ImmutableClassDemo("Sujay", 100000.0, address1);

        address1.setAddress("Hydrabad");

        System.out.println(address1.getAddress());
        System.out.println(immutableClassDemo.getAddress().getAddress());
    }
}
