package ENCOACADEMY.Static;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1= new Employee(101, "Faysal");
        Employee employee2= new Employee(102, "Riyal");
        Employee.setCompanyName("Issac");
        employee1.displayInformation();
        employee2.displayInformation();


        Employee employee3= new Employee(103, "Rahim");
        Employee employee4= new Employee(104, "Karim");

        employee3.displayInformation();
        employee4.displayInformation();
    }
}
