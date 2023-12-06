
/**
 * Write a description of class CreditCard here.
 *
 * @Abhishek patel
 * @1.1
 */
public class CreditCard extends BankCard
{
    //Declaring attribute
   private int cvcNumber;
   private double creditLimit;
   private double interestRate;
   private String expirationDate;
   private int gracePeriod;
   private boolean isGranted;
   
   //  Constructor
   public CreditCard(int cardId , String clientName, String issuerBank, String bankAccount, int balanceAmount,  int cvcNumber, double interestRate, String expirationDate){
        super(balanceAmount,  cardId,  bankAccount, issuerBank);
        super.setClientName(clientName);
        super.setBalanceAmount(balanceAmount);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    //Accessor Methods
    public int getCvcNumber(){
        return this.cvcNumber;
    }
    public double getCreditLimit(){
        return this.creditLimit;
    }
    public double getInterestRate(){
        return this.interestRate;
    }
    public String getExpirationDate(){
        return this.expirationDate;
    }
    public int getGracePeriod(){
        return gracePeriod;
    }
    public boolean getIsGranted(){
        return isGranted;
    }
    //Mutator method
    public void setCreditLimit(double creaditLimit, int gracePeriod){
        if(creditLimit <= 2.5 * getBalanceAmount()){
            this.creditLimit = creaditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
        }
        else{
            System.out.println("Credit-card cannot be issued.");
        }
    }
    //cancelCreditCard method if Credit Card needs to be canceled
    public void cancleCreditCard(){
        if(isGranted=true){
            this.cvcNumber = 0;
            this.creditLimit = 0;
            this.gracePeriod = 0;
            this.isGranted = false;
        }
        else{
            System.out.println("No credit card to cancel.");
        }
    }
    //Display Method
    public void display(){
        super.display();
        if(isGranted = true ){
            System.out.println("CVC number:"+ this.cvcNumber);
            System.out.println("Credit limit:"+ this.creditLimit);
            System.out.println("Interst rate:"+ this.interestRate);
            System.out.println("Expiration date:"+ this.expirationDate);
            System.out.println("Grace period:"+ this.gracePeriod);
        }
        else{
            System.out.println("No credit has been granted yet.");
        }
    }
    
} 
   
