public class Account {

    private String accountName;
    private int accountNumber;
    private double accountBalance;

    public Account(String name, int number, double balance){
        this.accountName = name;
        this.accountNumber = number;
        this.accountBalance = balance;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void deposit(double depositBalance){
        this.accountBalance = accountBalance - depositBalance;
    }

    public boolean withdraw(double withdrawBalance){      
        if(this.accountBalance > withdrawBalance){
            this.accountBalance = accountBalance - withdrawBalance;
            return true;
        } else {
            return false;
        }
    }
}
