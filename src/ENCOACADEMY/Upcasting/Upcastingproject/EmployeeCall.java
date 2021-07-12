package ENCOACADEMY.Upcasting.Upcastingproject;

@SuppressWarnings("ALL")
public class EmployeeCall {

    public void caller(Employee e) {
        e.doSomething();
        e.setEmployeeName();

        if (e instanceof Engineer) {
            Engineer eng = (Engineer) e;
            eng.doDeveloping();
            eng.doSomething();
            eng.setEmployeeName();
        }
        else if (e instanceof Admin) {
            Admin admin = (Admin) e;
        }
        else if (e instanceof Executive)
        {
            Executive exe = (Executive) e;
        }else if (e instanceof Worker) {
            Worker worker = (Worker) e;
        }


    }
}