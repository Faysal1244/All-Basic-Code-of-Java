package ENCOACADEMY.Static;

public class Employee {
    int id;
    String name;
    static String companyName="Edison";




    public Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    void displayInformation()
    {
        System.out.println("Id :"+id+"\n Name :"+name+"\n Company Name: "+companyName);
    }
}
