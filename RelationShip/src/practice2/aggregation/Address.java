package practice2.aggregation;

public class Address {
    private String Street;
    private String district;

    public Address(String street, String district) {
        Street = street;
        this.district = district;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Street='" + Street + '\'' +
                ", district='" + district + '\'' +
                '}';
    }
}
