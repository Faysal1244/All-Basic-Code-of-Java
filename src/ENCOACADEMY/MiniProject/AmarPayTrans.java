package ENCOACADEMY.MiniProject;

public class AmarPayTrans implements AmarPay {
    @Override
    public void rocketPayment(double payble_amount) {
        System.out.println("Payment: Via Rocket " + payble_amount);
    }

    @Override
    public void BkashPayment(double payble_amount) {
        System.out.println("Payment: Via Bkash " + payble_amount);

    }

    @Override
    public void NexusPayment(double payble_amount) {
        System.out.println("Payment: Via Nexus " + payble_amount);

    }

}
