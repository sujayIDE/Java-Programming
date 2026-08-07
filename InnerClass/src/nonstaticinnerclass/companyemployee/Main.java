package nonstaticinnerclass.companyemployee;

public class Main {
    public static void main(String[] args) {
        Company company=new Company();
        Company.Employee ce=company.new Employee();
        ce.display();
    }
}
