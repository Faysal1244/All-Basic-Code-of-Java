package ENCOACADEMY.Encapsulation;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setName("faysal");
        e1.setAccountId(56471);
        e1.setEmpBalance(5000);

        e1.getEmpBalance();
    }

}
