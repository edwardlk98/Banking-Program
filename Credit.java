public class Credit extends Account implements TransactionalAccount{
    private Credit(float startingBalance){
        setCreditCardNumber();
        setCreditBalance(startingBalance);
        setAccountNum();
        
    }

    public static Credit newCredit(float creditScore){
        float startingBalance = 0;
        if (creditScore < 500){
            throw new RuntimeException("Low balance");
        }
        if (creditScore > 500 & creditScore < 650){
             startingBalance = 500;
        }
        if (creditScore > 650 & creditScore < 750){
            startingBalance = 700;
        }
        if (creditScore > 750) {
            startingBalance = 1000;
        }
        return new Credit(startingBalance);
    } 
    public void makePurchase(float amount){
        float creditBalance = getCreditBalance();
        if (amount <= 0){
            System.out.println("Invalid amount");
            }
        if (creditBalance - amount >0){
            if (amount > 0){
            creditBalance -= amount;
            setCreditBalance(creditBalance);
            }
        }
        else{
            System.out.println("Insufficient funds");
        }

    };
    public void makeDeposit(float amount){
        float creditBalance = getCreditBalance();
        if(amount > 0){
            creditBalance += amount;
            setDebitBalance(creditBalance);
        }
    }
    public void makeWithdrawl(float amount){
        Float balance = getCreditBalance();
        if (balance - amount> 0) {
            if (amount > 0) {
                balance -= amount;
                setCreditBalance(amount);
            }
            
        }
    }
    
}