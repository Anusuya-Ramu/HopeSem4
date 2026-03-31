package Day10;

class customException extends Exception {
    public customException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends customException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class Bank {
    private double balance;

    void deposit(double amount) throws InsufficientFundsException {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            throw new InsufficientFundsException("Amount can't be 0 or negative");
        }
    }

    void withdrawal(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        } else if (amount <= 0) {
            throw new InsufficientFundsException("Amount can't be 0 or negative");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}

public class banksystemeexample {
    public static void main(String[] args) {
        Bank bank = new Bank();
        try {
            bank.deposit(1000);
            bank.withdrawal(1500);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}