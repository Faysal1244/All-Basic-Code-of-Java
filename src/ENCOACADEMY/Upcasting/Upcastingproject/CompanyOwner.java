package ENCOACADEMY.Upcasting.Upcastingproject;

public class CompanyOwner {

    public static void main(String[] args) {

        Admin admin = new Admin();
        Engineer engine = new Engineer();
        Executive executive = new Executive();

        Worker worker = new Worker();

       EmployeeCall eCall = new EmployeeCall();

        eCall.caller(engine);
//        eCall.caller(worker);
    }
}
