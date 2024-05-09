
public class Checking extends Account implements TransactionalAccount{
     
    private  Checking(float startingBalance){      
        setDebitBalance(startingBalance);
        setDebitCardNumber();
        setAccountNum();

    }
    public static Checking newChecking(float startingBalance){
        if (startingBalance < 25){
            throw new RuntimeException("Low balance");
        }
        return new Checking(startingBalance);
    } 
  
    public void makePurchase(float amount){
        float debitBalance = getDebitBalance();
        if (amount <= 0){
            System.out.println("Invalid amount");
            }

        if (debitBalance - amount > 0 ) {
            if (amount > 0){
            debitBalance -= amount;
            setDebitBalance(debitBalance);
            }
        }
        else{
            System.out.println("Insufficient Funds");
        }
        
    };
    public void makeDeposit(float amount){
        float debitBalance = getDebitBalance();
        if(amount > 0){
            debitBalance += amount;
            setDebitBalance(debitBalance);
        }
    }
    public void makeWithdrawl(float amount){
        Float balance = getDebitBalance();
        if (balance - amount> 0) {
            if (amount > 0) {
                balance -= amount;
                setDebitBalance(amount);
            }
            
        }
    }
}

