package interfaces;

public class BankingService {
    SavingAcoount save;
    CreditCardAccount cda;
    public BankingService(){
        save=new SavingAcoount();
        cda=new CreditCardAccount();
    }
    double checkBalance(){
        return save.checkBalance();
    }
    double checkCardBalance(){
        return cda.checkBalance();
    }
    void setDeposite(double amount){
        save.deposite(amount);
    }
    void setWithdraw(double amount){
        save.withdraw(amount);
    }
    void setCardWithdraw(double amuont){
        cda.withdraw(amuont);
    }
    void setCardDeposite(double amuont){
        cda.deposite(amuont);
    }
}
