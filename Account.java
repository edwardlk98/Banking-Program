import java.util.*;
public abstract class Account {
    private  String accountNum;
    private  String debitCardNumber = "N/A";
    private  String creditCardNumber = "N/A";
    private  float debitBalance;
    private  float savingsBalance;
    private  float creditBalance;
    private  String savingsNum = "N/A";
   
    public void setAccountNum(){
        Random random = new Random();
        for (int i = 0; i< 8; i++){
            int t = random.nextInt(0,9);
            accountNum += t;
        }
    }
    public String getAccountNum(){
        return accountNum;
    }
    public String getDebitCardNumber(){
        return debitCardNumber;
    }
    public void setDebitCardNumber(){
        debitCardNumber = "4342";
        
        Random random = new Random();
        for (int i = 0; i< 12; i++){
            int t = random.nextInt(0,9);
            debitCardNumber += t;
        }
    }
    public String getCreditCardNumber(){
        return creditCardNumber;
    }
    public void setCreditCardNumber() {
        creditCardNumber = "400";
        Random random = new Random();
        for (int i = 0; i< 8; i++){
            int t = random.nextInt(0,9);
            creditCardNumber += t;
        }
    }
    public float getDebitBalance(){
        return debitBalance;
    }
    public void setDebitBalance(float balance){
        debitBalance = balance;
    }

    public float getSavingsBalance(){
        return savingsBalance;
    }
    public void setSavingsBalance(float Amount){
        savingsBalance = Amount;
    }   
     public float getCreditBalance(){
        return creditBalance;
    }
    public void setCreditBalance(float amount){
         creditBalance = amount;
    }
    public void setSavingsNum(){
        savingsNum = "";
        Random random = new Random();
        for (int i = 0; i< 8; i++){
            int t = random.nextInt(0,9);
            savingsNum += t;
        }
    }
    public String getSavingsNumber(){
        return savingsNum;
    }
    public void makeDeposit(float amount){
    }

    public void makeWithdrawl(float amount){
    }
    
    
}