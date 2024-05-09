
public class Main {

    public static void main(String[] args) {
        Checking checking = Checking.newChecking(5000);
        
        Savings savings = Savings.newSavings(5000);
        Credit credit = Credit.newCredit(690);
        System.out.println("Debit balance: $" + checking.getDebitBalance());
        System.out.println("Credit balance: $" + credit.getCreditBalance());
        checking.makePurchase(2000);
        credit.makePurchase(500);
        savings.makeDeposit(2500);
        System.out.println("Debit balance: $" + checking.getDebitBalance() + " for  Account "+ checking.getDebitCardNumber());
        System.out.println("Credit balance: $" + credit.getCreditBalance() + " for  Account "+ credit.getCreditCardNumber());
        System.out.println("savings balance: $" + savings.getSavingsBalance() + " for Account "+ savings.getSavingsNumber());
        
        /*  System.out.println("Account Number: "+ checking.getAccountNum()+ "\n" + 
                            "Debit Number: " + checking.getDebitCardNumber() + " \n" + 
                            "Debit Balance: $" +  checking.getDebitBalance() + "\n" + 
                            "Credit card Number: " + credit.getCreditCardNumber() + "\n"+ 
                            "Credit Balance: $" + credit.getCreditbalance() + "\n" + 
                            "Savings Number: " +  savings.getSavingsNumber() + "\n"+ 
                            "Savings Balance: $" + savings.getSavingsBalance() + "\n"
                             ); */
                             
    }

        
}