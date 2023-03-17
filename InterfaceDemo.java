package interfaces;




public class InterfaceDemo {
    public static void main(String[] args) {
//        BankingService obj=new BankingService();
//        obj.setDeposite(1000);
//        obj.setWithdraw(10);
//        System.out.println("My Balance :"+obj.checkBalance());
          BankServiceII obj= new BankServiceII(new CreditCardAccount());
          obj.DepositeMoney(100);
          obj.withdrawMoney(29);
          double result=obj.showBalance();
        System.out.println("My Balance is :"+result);
    }
}
