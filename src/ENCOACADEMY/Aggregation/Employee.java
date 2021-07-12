package ENCOACADEMY.Aggregation;

public class Employee {
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println("ID : "+id +"Name : "+name+ "Address: " +address);

        System.out.println(address.getCity() + " " + address.getDivision() + " "+address.getCountry());
    }
    public static void main(String[] args) {

        Address address1 = new Address("dhaka", "Dhaka", "Bangladesh");
        Employee employee = new Employee(101,"Faysal", address1);
        employee.display();
    }

}
