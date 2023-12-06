
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

public class BankGUI implements ActionListener
{
    JPanel panel;
    JFrame framedebitcard;
    JFrame framecreditcard;
    JFrame framedisplay;

    public ArrayList<BankCard> bankcard=new ArrayList <BankCard>();

    int cardId;
    int balanceAmount;
    String bankAccount;
    String clientName;
    String issuerBank;
    int interestRate;
    int cvcnumber;
    int pinNumber;
    int withDrawalAmount;
    String expirationdate;
    String dateofWithdrawal;
    int graceperiod;
    int creditLimit;
    int cancelcreditcard;

    //TextField for enter a bankcard

    private JTextField cardidField1;
    private JTextField cardidField2;
    private JTextField cardidField3;
    private JTextField cardidField4;
    private JTextField pinNumberField;
    private JTextField clientNameField;
    private JTextField clientNameField1;
    private JTextField issuerBankField;
    private JTextField issuerBankField1;
    private JTextField bankAccountField;
    private JTextField bankAccountField1;
    private JTextField balanceAmountField;
    private JTextField balanceAmountField1;
    private JTextField pinNumberField2;
    private JTextField withdrawalAmountField;
    private JTextField dateofWithdrawalField;
    private JTextField cvcnumberField;
    private JTextField creditlimitField;
    private JTextField interestRateField;
    private JTextField graceperiodField;

    //JButton declare
    private JButton addDebitCardButton;
    private JButton addCreditCardButton;
    private JButton clearButton;
    private JButton clear1Button;
    private JButton withdrawDebitCardButton;
    private JButton creditlimitsetButton;
    private JButton cancelcreditcardButton;
    private JButton  displayButton;
    private JButton  displayButton1;
    private JButton  gotocreditcardButton;
    private JButton  gotodebitcardButton;

    //Conbobox for selecting dates
    private JComboBox cbDate;
    private JComboBox cbMonth;
    private JComboBox cbYear;
    private JComboBox<String> withdrawalDay;
    private JComboBox<String> withdrawalMonth;
    private JComboBox<String> withdrawalYaer;

    private JComboBox<String> expirationDate;
    private JComboBox<String> expirationMonth;
    private JComboBox<String> expirationYear;
    private JComboBox<String> expirationDay;


    public BankGUI()
    {
        DebitCard();
    }

    public void DebitCard(){

        bankcard = new ArrayList <BankCard>();
        framedebitcard=new JFrame();
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(192,192,192));

        framedebitcard.add(panel);

        //DebitCard label
        JLabel debitCardlabel = new JLabel("Debit Card");
        debitCardlabel.setFont(new Font("Arial",Font.BOLD,25));
        debitCardlabel.setBounds(325, 15, 124, 36);
        panel.add(debitCardlabel);

        JLabel cardIdLabel =  new JLabel("Card Id:");
        cardIdLabel.setBounds(87, 128, 57, 20);
        panel.add(cardIdLabel);

        cardidField1 = new JTextField();
        cardidField1.setBounds(177, 123,149, 25);
        panel.add(cardidField1);

        JLabel clientnameLabel =  new JLabel("Client Name:");
        clientnameLabel.setBounds(66,178, 78, 20);
        panel.add(clientnameLabel);

        clientNameField = new JTextField();
        clientNameField.setBounds(177, 173,149, 25);
        panel.add(clientNameField);

        JLabel bankaccountLabel =  new JLabel("Bank Account:");
        bankaccountLabel.setBounds(54, 228, 90, 20);
        panel.add(bankaccountLabel);

        bankAccountField = new JTextField();
        bankAccountField.setBounds(177, 223,149, 25);
        panel.add(bankAccountField);

        JLabel issuerbankLabel =  new JLabel("Issuer Bank:");
        issuerbankLabel.setBounds(446, 123, 78, 20);
        panel.add(issuerbankLabel);

        issuerBankField = new JTextField();
        issuerBankField.setBounds(566, 123,149, 25);
        panel.add(issuerBankField);

        JLabel balanceamountLabel =  new JLabel("Balance Amount:");
        balanceamountLabel.setBounds(429, 173, 111, 20);
        panel.add(balanceamountLabel);

        balanceAmountField = new JTextField();
        balanceAmountField.setBounds(566, 173,149, 25);
        panel.add(balanceAmountField);

        JLabel pinnumberLabel =  new JLabel("Pin Number:");
        pinnumberLabel.setBounds(450, 223, 78, 20);
        panel.add(pinnumberLabel);

        pinNumberField = new JTextField();
        pinNumberField.setBounds(566, 223,149, 25);
        panel.add(pinNumberField);

        JLabel WithDrawalAmountLabel = new JLabel("Withdrawal Amount:");
        WithDrawalAmountLabel.setBounds(30, 406,127, 20);
        panel.add(WithDrawalAmountLabel);

        withdrawalAmountField = new JTextField();
        withdrawalAmountField.setBounds(177,401, 149,25);
        panel.add(withdrawalAmountField);

        JLabel dateofWithdrawallabel = new JLabel("Date of Withdrawal:");
        dateofWithdrawallabel.setBounds(37, 456,134, 20);
        panel.add(dateofWithdrawallabel);

        cbDate = new JComboBox();

        for(int date = 1; date <= 31; date++)

        {

            cbDate.addItem(date);

        }

        cbDate.setBounds(177,452,70,25);
        panel.add(cbDate);

        String Month[] = {"Jan","Feb","March","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
        cbMonth = new JComboBox(Month);
        cbMonth.setBounds(262,452,70,25);
        panel.add(cbMonth);

        cbYear = new JComboBox();
        for(int year = 2010; year <= 2060; year++)
        {
            cbYear.addItem(year);
        }
        cbYear.setBounds(347,452,70,25);
        panel.add(cbYear);

        JLabel cardIdLabel2 =  new JLabel("Card Id:");
        cardIdLabel2.setBounds(70, 356, 57, 20);
        panel.add(cardIdLabel2);

        cardidField2 = new JTextField();
        cardidField2.setBounds(177, 350,149, 25);
        panel.add(cardidField2);

        JLabel pinnumberlabel1 = new JLabel("Pin Number:");
        pinnumberlabel1.setBounds(55, 506,78, 20);
        panel.add(pinnumberlabel1);

        pinNumberField2 = new JTextField();
        pinNumberField2.setBounds(177, 502,149, 25);
        panel.add(pinNumberField2);

        withdrawDebitCardButton = new JButton("Withdrawal");
        withdrawDebitCardButton.setBounds(565,476,150,32);
        panel.add(withdrawDebitCardButton);

        addDebitCardButton = new JButton("Add Debit Card");
        addDebitCardButton.setBounds(566,288,150,32);
        panel.add(addDebitCardButton);

        displayButton = new JButton("Display");
        displayButton.setBounds(87,625,150,32);
        panel.add(displayButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(347,623,150,32);
        panel.add(clearButton);

        gotocreditcardButton = new JButton("Go to Credit Card");
        gotocreditcardButton.setBounds(578,623,150,32);
        panel.add(gotocreditcardButton);

        addDebitCardButton.addActionListener(this);
        clearButton.addActionListener(this);
        withdrawDebitCardButton.addActionListener(this);
        gotocreditcardButton.addActionListener(this);
        displayButton.addActionListener(this);

        framedebitcard.setSize(800,750);
        framedebitcard.setVisible(true);
        framedebitcard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void CreditCard(){

        framecreditcard=new JFrame();
        panel = new JPanel();
        panel.setLayout(null);
        framecreditcard.add(panel);
        panel.setBackground(new Color(192,192,192));

        //CreditCard Label
        JLabel creditCardlabel = new JLabel("Credit Card");
        creditCardlabel.setFont(new Font("Arial",Font.BOLD,25));
        creditCardlabel.setBounds(284, 35, 223, 49);
        panel.add(creditCardlabel);

        JLabel cardIdLabel3 =  new JLabel("Card Id:");
        cardIdLabel3.setBounds(70, 128, 57, 20);
        panel.add(cardIdLabel3);

        cardidField3= new JTextField();
        cardidField3.setBounds(177, 123, 149, 25);
        panel.add(cardidField3);

        JLabel cardIdLabel4 =  new JLabel("Card Id:");
        cardIdLabel4.setBounds(67, 400, 57, 20);
        panel.add(cardIdLabel4);

        cardidField4= new JTextField();
        cardidField4.setBounds(177, 394, 149, 25);
        panel.add(cardidField4);

        JLabel clientnameLabel =  new JLabel("Client Name:");
        clientnameLabel.setBounds(66,178, 78, 20);
        panel.add(clientnameLabel);

        clientNameField1 = new JTextField();
        clientNameField1.setBounds(177, 173,149, 25);
        panel.add(clientNameField1);

        JLabel bankaccountLabel =  new JLabel("Bank Account:");
        bankaccountLabel.setBounds(54, 228, 90, 20);
        panel.add(bankaccountLabel);

        bankAccountField1 = new JTextField();
        bankAccountField1.setBounds(177, 223,149, 25);
        panel.add(bankAccountField1);

        JLabel issuerbankLabel =  new JLabel("Issuer Bank:");
        issuerbankLabel.setBounds(431, 123, 78, 20);
        panel.add(issuerbankLabel);

        issuerBankField1 = new JTextField();
        issuerBankField1.setBounds(566, 123,149, 25);
        panel.add(issuerBankField1);

        JLabel balanceamountLabel =  new JLabel("Balance Amount:");
        balanceamountLabel.setBounds(429, 173, 111, 20);
        panel.add(balanceamountLabel);

        balanceAmountField1 = new JTextField();
        balanceAmountField1.setBounds(566, 173,149, 25);
        panel.add(balanceAmountField1);

        JLabel cvcLabel  = new JLabel("CVC Number:");
        cvcLabel.setBounds(431, 223, 85, 20);
        panel.add(cvcLabel);

        cvcnumberField = new JTextField();
        cvcnumberField.setBounds(566,218,149,20);
        panel.add(cvcnumberField);

        JLabel creditLimitLabel  = new JLabel("New Credit Limit:");
        creditLimitLabel.setBounds(41, 450, 108, 20);
        panel.add(creditLimitLabel);

        creditlimitField = new JTextField();
        creditlimitField.setBounds(174,445,149,25);
        panel.add(creditlimitField);

        JLabel interestLabel  = new JLabel("Interest:");
        interestLabel.setBounds(54, 278, 90, 20);
        panel.add(interestLabel);

        interestRateField = new JTextField();
        interestRateField.setBounds(177,273,149,25);
        panel.add(interestRateField);

        JLabel expirationdateLabel  = new JLabel("Expiration Date:");
        expirationdateLabel.setBounds(419,273, 121,20);
        panel.add(expirationdateLabel);
        JComboBox cbDate = new JComboBox();

        for(int date = 1; date <= 31; date++)

        {

            cbDate.addItem(date);

        }

        cbDate.setBounds(561,269,70,24);
        panel.add(cbDate);

        String Month[] = {"Jan","Feb","March","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
        JComboBox cbMonth = new JComboBox(Month);
        cbMonth.setBounds(640,269,70,24);
        panel.add(cbMonth);

        JComboBox cbYear = new JComboBox();
        for(int year = 2010; year <= 2060; year++)
        {
            cbYear.addItem(year);
        }
        cbYear.setBounds(719,269,70,24);
        panel.add(cbYear);

        JLabel graceperiodLabel  = new JLabel("Grace Period:");
        graceperiodLabel.setBounds(31, 500, 118, 20);
        panel.add(graceperiodLabel);

        graceperiodField = new JTextField();
        graceperiodField.setBounds(174,496,149,25);
        panel.add(graceperiodField);

        addCreditCardButton = new JButton("Add to Credit Card");
        addCreditCardButton.setBounds(320,318,150,32);
        panel.add(addCreditCardButton);

        creditlimitsetButton = new JButton("Set Credit Limit ");
        creditlimitsetButton.setBounds(54,570,150,32);
        panel.add(creditlimitsetButton);

        cancelcreditcardButton = new JButton("Cancel Credit Card");
        cancelcreditcardButton.setBounds(565,476,150,32);
        panel.add(cancelcreditcardButton);

        clear1Button = new JButton("Clear");
        clear1Button.setBounds(325,639,150,32);
        panel.add(clear1Button);

        displayButton1 = new JButton("Display");
        displayButton1.setBounds(54,639,150,32);
        panel.add(displayButton1);

        gotodebitcardButton = new JButton("Go to Debit Card");
        gotodebitcardButton.setBounds(578,639,150,32);
        panel.add(gotodebitcardButton);

        addCreditCardButton.addActionListener(this);
        creditlimitsetButton.addActionListener(this);
        cancelcreditcardButton.addActionListener(this);
        gotodebitcardButton.addActionListener(this);
        clear1Button.addActionListener(this);
        displayButton1.addActionListener(this);

        framecreditcard.setSize(800,750);
        framecreditcard.setVisible(true);
        framecreditcard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == addDebitCardButton) {
            if(bankAccountField.getText().isEmpty() || cardidField1.getText().isEmpty() || balanceAmountField.getText().isEmpty() || issuerBankField.getText().isEmpty()||
            clientNameField.getText().isEmpty()|| pinNumberField.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Please fill up "," Fields are left.",JOptionPane.WARNING_MESSAGE);
            } else {

                int balanceAmount;
                int cardId;
                int pinNumber;
                String bankAccount = bankAccountField.getText();
                String issuerBank = issuerBankField.getText();
                String clientName = clientNameField.getText();

                try{
                    balanceAmount = Integer.parseInt(balanceAmountField.getText());
                    cardId = Integer.parseInt(cardidField1.getText());
                    pinNumber = Integer.parseInt(pinNumberField.getText());
                } catch(NumberFormatException exc1){
                    JOptionPane.showMessageDialog(null, "Please Insert values in Balance Amount, Card Id and Pin Number Field.");
                    return;
                }

                try
                {
                    if(balanceAmount < 0 || cardId <= 0 || pinNumber <= 0)
                    {
                        JOptionPane.showMessageDialog(null, "Please Check Insert Value in Card ID,Balance Amount and Pin Number.");

                    }
                }
                catch(Exception exc2) {
                }

                boolean check = false;
                for(BankCard ban1 : bankcard) {
                    if(ban1 instanceof DebitCard) {
                        DebitCard debitcd1 = (DebitCard) ban1;
                        if(debitcd1.getCardId() == cardId) {
                            check = true;
                            break;
                        }

                    }
                }

                if(check) {
                    JOptionPane.showMessageDialog(null, "Your Card ID is already exists.", "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                DebitCard debitcard = new DebitCard(balanceAmount, cardId, bankAccount, issuerBank, clientName, pinNumber);
                bankcard.add(debitcard);

                JOptionPane.showMessageDialog(null,"Thank You! Your Debit card has been added sucessfully.","Sucessfull!",JOptionPane.INFORMATION_MESSAGE);
            }
        }

        else if(e.getSource()==displayButton){
            balanceAmount = Integer.parseInt(balanceAmountField.getText());
            cardId = Integer.parseInt(cardidField2.getText());
            bankAccount = bankAccountField.getText();
            issuerBank = issuerBankField.getText();
            clientName = clientNameField.getText();
            int pinNumber = Integer.parseInt(pinNumberField.getText());

            // Update the balance amount
            balanceAmount = balanceAmount - withDrawalAmount;

            // Create a string to store the bill format
            String bill = "------- BILL --------\n"
                + "Client Name: " + clientName + "\n"
                + "Card Id: " + cardId + "\n"
                + "Bank Account: " + bankAccount + "\n"
                + "Issuer Bank: " + issuerBank + "\n"
                + "Withdrawal Amount: " + withDrawalAmount + "\n"
                + "Balance Amount: " + balanceAmount + "\n"
                + "Date of Withdrawal: " + dateofWithdrawal + "\n"
                + "----------------------";
            // Display the bill in a dialog box
            JOptionPane.showMessageDialog(null, bill, "Bill", JOptionPane.INFORMATION_MESSAGE);
        }

        else if(e.getSource()==gotocreditcardButton){
            framedebitcard.setVisible(false);
            CreditCard();
        }
        else if(e.getSource()==gotodebitcardButton){
            framecreditcard.setVisible(false);
            DebitCard();
        }
        else if(e.getSource() == withdrawDebitCardButton) {
            if(  cardidField2.getText().isEmpty() || pinNumberField2.getText().isEmpty()){

                JOptionPane.showMessageDialog(null,"Please fill up "," Fields are left.",JOptionPane.WARNING_MESSAGE);
            }
            else{

                bankAccount = bankAccountField.getText();
                issuerBank = issuerBankField.getText();
                clientName = clientNameField.getText();
                balanceAmount = Integer.parseInt(balanceAmountField.getText());

                cardId = Integer.parseInt(cardidField2.getText());
                withDrawalAmount = Integer.parseInt(withdrawalAmountField.getText());
                pinNumber = Integer.parseInt(pinNumberField2.getText());

                String withdrawalDay = cbDate.getSelectedItem().toString();
                String withdrawalMonth = cbMonth.getSelectedItem().toString();
                String withdrawalYear = cbYear.getSelectedItem().toString();
                dateofWithdrawal = withdrawalDay + withdrawalMonth + withdrawalYear;

                try {
                    cardId = Integer.parseInt(cardidField2.getText());
                    withDrawalAmount = Integer.parseInt(withdrawalAmountField.getText());
                    pinNumber = Integer.parseInt(pinNumberField2.getText());
                } catch (NumberFormatException exc3) {
                    JOptionPane.showMessageDialog(null, "Please fill right information.", "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (withDrawalAmount > balanceAmount) {
                    JOptionPane.showMessageDialog(null, "Insufficient balance", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (withDrawalAmount <= 0) {
                    JOptionPane.showMessageDialog(null, "Your withdraw Cancel, Plaese try again", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                boolean check = false;
                DebitCard debitcd3 = null;
                for(BankCard ban2 : bankcard) {
                    if(ban2 instanceof DebitCard) {
                        debitcd3 = (DebitCard) ban2;
                        if(debitcd3.getCardId() == cardId) {
                            check = true;
                            break;
                        }
                    }
                }

                if(!check) {
                    JOptionPane.showMessageDialog(null, "Your Debit card does not exists.", "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if(debitcd3.getPinNumber() == pinNumber) {
                    debitcd3.withdraw(withDrawalAmount, dateofWithdrawal, pinNumber);
                    JOptionPane.showMessageDialog(null,"Hello, " + clientName + " Your Card Id is :" + cardId + "  .");
                    JOptionPane.showMessageDialog(null,"Your withdrawal of Rs " + withDrawalAmount + " has been successful.");
                    JOptionPane.showMessageDialog(null, "Your new balance amount : " + (balanceAmount - withDrawalAmount) + "\n" + "Card Id : " + cardId + "\n" + "Client Name : " + clientName + "\n" + "Date Of Withdrawal : " + dateofWithdrawal, "Withdrawal Successful!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry, Your Pin Number Doesnot Match!", "Pin doesn't match", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                DebitCard debitcard = new DebitCard(balanceAmount, cardId, bankAccount, issuerBank, clientName, pinNumber);
                bankcard.add(debitcard);

            }
        }

        else if(e.getSource()== addCreditCardButton){
            if(bankAccountField1.getText().isEmpty() || cardidField3.getText().isEmpty() || balanceAmountField1.getText().isEmpty() || issuerBankField1.getText().isEmpty()||
            clientNameField1.getText().isEmpty() || interestRateField.getText().isEmpty() || cvcnumberField.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Please fill up "," Fields are left.",JOptionPane.WARNING_MESSAGE);
            } else {
                cardId =Integer.parseInt(cardidField3.getText());; 
                balanceAmount =Integer.parseInt(balanceAmountField1.getText());
                bankAccount = bankAccountField1.getText();
                clientName = clientNameField1.getText();
                issuerBank = issuerBankField1.getText();
                double interestRate =Double.parseDouble(interestRateField.getText());
                cvcnumber =Integer.parseInt(cvcnumberField.getText());
                String expirationDay = cbDate.getSelectedItem().toString();
                String expirationMonth = cbMonth.getSelectedItem().toString();
                String expirationYear = cbYear.getSelectedItem().toString();
                String expirationDate = expirationDay + expirationMonth + expirationYear;

                try{
                    cardId =Integer.parseInt(cardidField3.getText());; 
                    balanceAmount =Integer.parseInt(balanceAmountField1.getText());
                    bankAccount = bankAccountField1.getText();
                    clientName = clientNameField1.getText();
                    issuerBank = issuerBankField1.getText();
                    interestRate =Double.parseDouble(interestRateField.getText());
                    cvcnumber =Integer.parseInt(cvcnumberField.getText());

                }catch(NumberFormatException exc4){
                    JOptionPane.showMessageDialog(null,"Please Insert Values in Card Id, Balance Amount , Pin Number, Cvc Number and Interest Rate Field .","Error!",JOptionPane.ERROR_MESSAGE);

                }
                try{
                    if(balanceAmount < 0 || cardId <= 0  || cvcnumber<=0 )
                    {
                        JOptionPane.showMessageDialog(null, "Please check value in Balance Amount, Card ID and Cvc Number  .");
                        return;
                    }

                }catch(Exception exc5){
                    JOptionPane.showMessageDialog(null,"Please Insert  values in Card Id, Balance Amount , Pin Number, Cvc Number .","Error!",JOptionPane.ERROR_MESSAGE);

                }
                boolean check = false;
                CreditCard creditcd1;
                for(BankCard ban3 : bankcard) {
                    if(ban3 instanceof CreditCard) {
                        creditcd1 = (CreditCard) ban3;
                        if(creditcd1.getCardId() == cardId) {
                            check = true;
                            break;
                        }

                    }
                }

                if(check)
                {
                    JOptionPane.showMessageDialog(null, "Your Card ID is already exists.", "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                CreditCard objCredit = new CreditCard( cardId ,  clientName,  issuerBank,  bankAccount,  balanceAmount,   cvcnumber,  interestRate,  expirationDate);
                bankcard.add(objCredit);
                JOptionPane.showMessageDialog(null,"Thank you ! Your Credit Card has been added successfully .","Success!",JOptionPane.INFORMATION_MESSAGE);
            }

        }
        else if(e.getSource() == displayButton1)
        {
            balanceAmount = Integer.parseInt(balanceAmountField1.getText());
            cardId = Integer.parseInt(cardidField4.getText());
            bankAccount = bankAccountField1.getText();
            issuerBank = issuerBankField1.getText();
            clientName = clientNameField1.getText();
            double interestRate =Double.parseDouble(interestRateField.getText());
            cvcnumber =Integer.parseInt(cvcnumberField.getText());
            String expirationDay = cbDate.getSelectedItem().toString();
            String expirationMonth = cbMonth.getSelectedItem().toString();
            String expirationYear = cbYear.getSelectedItem().toString();
            String expirationDate = expirationDay + expirationMonth + expirationYear;

            

            // Create a string to store the bill format
            String bill = "------- BILL --------\n"
                + "Client Name: " + clientName + "\n"
                + "Card Id: " + cardId + "\n"
                + "Bank Account: " + bankAccount + "\n"
                + "Issuer Bank: " + issuerBank + "\n"
                + "Interest Rate: " + interestRate + "\n"
                + "Cvc Number: " + cvcnumber + "\n"
                + "Expiration Date: " +  expirationDate + "\n"
                + "----------------------";
            // Display the bill in a dialog box
            JOptionPane.showMessageDialog(null, bill, "Bill", JOptionPane.INFORMATION_MESSAGE);
        }

        else if (e.getSource() == creditlimitsetButton){
            try{
                balanceAmount = Integer.parseInt(balanceAmountField1.getText());
                cardId = Integer.parseInt(cardidField4.getText());
                cvcnumber = Integer.parseInt(cvcnumberField.getText());
                double interestRate = Double.parseDouble(interestRateField.getText());
                creditLimit = Integer.parseInt(creditlimitField.getText());
                graceperiod = Integer.parseInt(graceperiodField.getText());
            } catch(NumberFormatException excep){
                JOptionPane.showMessageDialog(null,"Unsucessfull Error occured.","Error!",JOptionPane.ERROR_MESSAGE);
                return;
            }

            bankAccount = bankAccountField.getText();
            clientName = clientNameField.getText();
            issuerBank = issuerBankField.getText();

            String expirationDay1 = cbMonth.getSelectedItem().toString();
            String expirationMonth1 = cbMonth.getSelectedItem().toString();
            String expirationYear1 = cbYear.getSelectedItem().toString();
            String expirationDate= expirationDay + expirationMonth1 + expirationYear;

            for (BankCard ban4 : this.bankcard) {
                if (ban4 instanceof CreditCard) {
                    CreditCard creditcd = (CreditCard) ban4;
                    if (creditcd.getCardId() == cardId) {
                        creditcd.setCreditLimit(creditLimit, graceperiod);
                        JOptionPane.showMessageDialog(null, "Credit card Limit has been set to Rs " +
                        creditcd.getCreditLimit() + " with a grace period of " +
                        creditcd.getGracePeriod() + " years.", "Credit Limit set.",
                        JOptionPane.INFORMATION_MESSAGE);
                        //return; // Exit the loop if the credit card is found and the limit is set
                    } else{
                        JOptionPane.showMessageDialog(null, "Credit card does not exists!");
                        
                    }
                }
            }
        }
        else if (e.getSource() == cancelcreditcardButton){

            try{
                balanceAmount = Integer.parseInt(balanceAmountField1.getText());
                cardId = Integer.parseInt(cardidField4.getText());
                cvcnumber = Integer.parseInt(cvcnumberField.getText());
                double interestRate = Double.parseDouble(interestRateField.getText());
            }
            catch(NumberFormatException excep){
                JOptionPane.showMessageDialog(null,"Unsucessfull Error occured.","Error!",JOptionPane.ERROR_MESSAGE);
                return;
            }

            String bankAccount = bankAccountField.getText();
            String clientName = clientNameField.getText();
            String issuerBank = issuerBankField.getText();
            String expirationDay1 = cbMonth.getSelectedItem().toString();
            String expirationMonth1 = cbMonth.getSelectedItem().toString();
            String expirationYear1 = cbYear.getSelectedItem().toString();
            String expirationDate= expirationDay + expirationMonth1 + expirationYear;

            for(BankCard ban5 : this.bankcard)
            {
                if(ban5 instanceof CreditCard)
                {
                    CreditCard creditcard =(CreditCard)ban5;
                    if(creditcard.getCvcNumber() == cvcnumber){
                        creditcard.cancleCreditCard();
                        JOptionPane.showMessageDialog(null,"Hello, your Credit card has been cancelled sucessfully!","Cancelled!",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }

        else if (e.getSource() == clearButton)
        {
            // Clear the fields

            cardidField1.setText("");
            cardidField2.setText("");

            pinNumberField.setText("");
            clientNameField.setText("");
            issuerBankField.setText("");
            bankAccountField.setText("");
            balanceAmountField.setText("");
            pinNumberField2.setText("");
            withdrawalAmountField.setText("");

        }
        else if (e.getSource() == clear1Button){
            cardidField3.setText("");
            cardidField4.setText("");
            bankAccountField1.setText("");
            issuerBankField1.setText("");
            balanceAmountField1.setText("");
            cvcnumberField.setText("");
            creditlimitField.setText("");
            interestRateField.setText("");
            graceperiodField .setText("");
            clientNameField1.setText("");

        }

    }
}
