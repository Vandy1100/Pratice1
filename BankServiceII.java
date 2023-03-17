package interfaces;

public class BankServiceII {
    Account account;
    public BankServiceII(Account account){
        this.account=account;
    }
    public double showBalance(){
        return account.checkBalance();
    }
    public void withdrawMoney(double amount){
        account.withdraw(amount);
    }
    public void DepositeMoney(double amount){
        account.deposite(amount);
    }
}
