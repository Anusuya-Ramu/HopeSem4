package task8;

interface payment{
    void pay(double amount);

}
class upi implements payment{
    public void pay(double amount){
        System.out.println("Processing UPI payment of $" + amount);
    }
}

class card implements payment{
    public void pay(double amount){
        System.out.println("Processing card payment of $" + amount);
    }
}

class cash implements payment{
    public void pay(double amount){
        System.out.println("Processing cash payment of $" + amount);
    }
}

public class ModeOfPayment {
    public static void main(String[] args) {
        payment upiPayment = new upi();
        upiPayment.pay(100.0);

        payment cardPayment = new card();
        cardPayment.pay(200.0);

        payment cashPayment = new cash();
        cashPayment.pay(50.0);

    }
}
