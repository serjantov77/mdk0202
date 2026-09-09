public class Practicum {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setMoneyAmount(1000);
        System.out.println("количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");

        bankAccount.withdrawAll();
        System.out.println("количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}

class BankAccount {
    private long moneyAmount;

    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long newMoneyAmount) {
        moneyAmount = newMoneyAmount;
    }

    public void withdrawAll() {
        System.out.println("со счёта снято " + moneyAmount + " р.");
        moneyAmount = 0;
    }
}