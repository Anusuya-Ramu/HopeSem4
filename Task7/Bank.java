package Task7;

class Account {
    private double balance;
    //private double amount;

    public void deposit(double amount) {
       // this.amount=amount;
        balance += amount;
        System.out.println("Deposited: " + amount);
        getBalance();
    }
    public void withdrawal(double amount) {
        //this.amount=amount;
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public double getBalance() {
        return balance;
    }
}


public class Bank {
    public static void main(String[] args) {
        
        Account acc= new Account();
        acc.deposit(1000);
        acc.withdrawal(500);
        System.out.println("Current Balance: " + acc.getBalance());

       Account acc1= new Account();
       System.out.println(acc1.getBalance());
    }
}
