public class Savings extends Account {

    private Savings(float startingBalance){
        setSavingsBalance(startingBalance);
        setSavingsNum();
        setAccountNum();
        
    }

    public static Savings newSavings(float startingBalance){
        if (startingBalance < 25){
            throw new RuntimeException("Low balance");
        }
        return new Savings(startingBalance);
    } 
    public void makeDeposit(float amount){

        float savingsBalance = getSavingsBalance();
        if (amount <= 0){
            System.out.println("Invalid amount");
            }
            if (savingsBalance + amount >0 ) {
                if(amount > 0){
                    savingsBalance += amount;
                    setSavingsBalance(savingsBalance);
                }
            }
    }
    
    public void makeWithdrawl(float amount){
        Float balance = getSavingsBalance();
        if (balance - amount> 0) {
            if (amount > 0) {
                balance -= amount;
                setSavingsBalance(amount);
            }
            
        }
    }
    
}
