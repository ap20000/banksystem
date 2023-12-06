
/**
 * Write a description of class DebitCard here.
 *
 *@Abhishek Patel
 * @1.1
 */
import java.util.ArrayList;
public class DebitCard extends BankCard{
    //Declaring attribute
    private int pinNumber;
    private int withDrawalAmount;
    private String dateofWithdrawal;
    private boolean hasWithDrawn;
    ArrayList<BankCard> debit=new ArrayList<BankCard>();
    
    /** BankkCard Constructot **/
    public DebitCard( int balanceAmount, int cardId, String bankAccount,String issuerBank, String clientName,int pinNumber){
        super(balanceAmount,  cardId,  bankAccount, issuerBank);
        super.setClientName(clientName);
        this.hasWithDrawn= false;
        this.pinNumber = pinNumber;
        hasWithDrawn=false;
    }
    //Accessor Methods
    public int getPinNumber(){
        return  this.pinNumber;
    }
    public int getWithDrawalAmount(){
        return  this.withDrawalAmount;
    }
    public String getDateofWithDrawal(){
        return  this.dateofWithdrawal;
    }
    public boolean getHasWithDrawn(){
        return  this.hasWithDrawn;
    }
    // Setter Method
    public void setWithdrawalAmount(int withdrawalAmount){
        this.withDrawalAmount = withDrawalAmount;
    }
    // withdraw method for transaction
    public void withdraw(int withDrawalAmount, String dateofWithdrawal, int pinNumber){
        //BankCard 
        //for(BankCard bank:debit){
           // if(
        //}
        
        if(this.pinNumber == pinNumber && super.getBalanceAmount() >= withDrawalAmount){
            
            hasWithDrawn= true;
            super.setBalanceAmount( super.getBalanceAmount() - withDrawalAmount);
            this.dateofWithdrawal = dateofWithdrawal;
            this.withDrawalAmount = withDrawalAmount;
            System.out.println("Withdrawal Sucessfully done. Your new balance is:"+this.getBalanceAmount());
        }
        else if(this.pinNumber != pinNumber){
            System.out.println("Invalid pin number.Withdrawal failed.");
        }
        else{
            System.out.println("Insufficient balance.Withdrawal failed.");
        }    
    }
     // Display method
    public void display(){
        super.display();
        if(hasWithDrawn == false){
            System.out.println("Date of withdrawal:"+ this.dateofWithdrawal);
            System.out.println("Pin number:"+ this.pinNumber);
            System.out.println("Withdrawal Amount:"+ this. withDrawalAmount);
        }
        else{
            System.out.println("No withdrawal has been made yet.");
        }
    }
}