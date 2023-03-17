package interfaces;

class SavingAcoount implements Account{
    private double balance;
    private float interestRate;
    SavingAcoount(){
        balance=10;
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=balance){
            balance-=amount;
        }else{
            System.out.println("Ivalid Money...");
        }
    }

    @Override
    public void deposite(double amount) {
        balance+=amount;
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public double calculatorInterface() {
        return balance*(interestRate/100);
    }
}
