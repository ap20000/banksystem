
/**
 * Write a description of class BankCard here.
 *
 * @Abhishek Patel
 * @1.1
 */
public class BankCard
{
     //Declaring attribute
    private int cardId;
    private String clientName;
    private String issuerBank;
    private int balanceAmount;
    private String bankAccount;
    
     // Constructor of BankCard
    public BankCard( int balanceAmount, int cardId, String bankAccount,String issuerBank)
    {
        this.clientName="";
        this.cardId=cardId;
        this.balanceAmount=balanceAmount;
        this.bankAccount=bankAccount;
        this.issuerBank=issuerBank;
    }
    // Creating an Accessor method for each attribute
     public int getCardId(){
        return this.cardId;
    }

    public String getClientName(){
        return this.clientName;
    }
    
    
    public int getBalanceAmount(){
        return this.balanceAmount;
    }

    public String getBankAccount(){
        return this.bankAccount;
    }

    public String getIssuerBank(){
        return this.issuerBank;
    }
     //Mutator method
    public void setClientName(String clientName)
    {
        this.clientName=clientName;
    }
    
    public void setBalanceAmount(int balanceAmount){
        this.balanceAmount=balanceAmount;
    }
     // Display Method
    public void display(){
        System.out.println("Card ID="+this.cardId);
        System.out.println("Client Name="+this.clientName);
        System.out.println("Issuer Bank="+this.issuerBank);
        System.out.println("Bank Account="+this.bankAccount);
        System.out.println("Balance Amount="+this.balanceAmount);
        if(this.clientName.isEmpty()){
            System.out.print("The client name is Empty");
        }
        else{
            System.out.println("Client Name="+this.clientName);
        }
    }

}
