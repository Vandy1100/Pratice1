package interfaces;

 public class CreditCardAccount implements Account {
     double limitRate;
     float interestRates;
     double balance;
     CreditCardAccount(){
         limitRate=30;
         interestRates=30;
         balance=10;
     }

     @Override
     public void withdraw(double amount) {
         if(amount<=limitRate){
             if(amount<=balance){
                 balance-=amount;
             }else {
                 System.out.println("Not Enough Money...");
             }
         }else {
             System.out.println("Amount exceed the limit");
         }
     }

     @Override
     public void deposite(double amount) {
       balance+=amount;
     }

     @Override
     public double checkBalance() {

         return balance;
     }

     @Override
     public double calculatorInterface() {
         return balance*(interestRates/100);
     }
 }
