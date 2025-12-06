package BankApp;

import java.time.LocalDate;
import java.util.*;

class Transection {

    String type;
    double amount;
    LocalDate Date;

    Transection(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.Date = LocalDate.now();
    }

    void printTransection() {
        System.out.println("type: " + type + "\namount: " + amount + "\nDate: " + Date);
    }
}

// ----------------------------------------------------------------------

abstract class Accounts {

    static final String BRANCH = "Main";
    static final String IFSC = "IFSC001";

    String acctype;
    int accno;
    String Name;
    double balence;
    LocalDate lasttransD;

    Transection[] transection = new Transection[50];
    int Transacccount = 0;

    Accounts(String acctype, String name, double balence) {
        this.acctype = acctype;
        this.Name = name;
        this.balence = balence;
        this.lasttransD = LocalDate.now();
    }

    abstract void deposit(double amount);

    abstract void Withdraw(double amount);

    abstract double calculateinterest();

    void addTransection(Transection t) {
        transection[Transacccount++] = t;
    }

    void printdetails() {
        System.out.println("-----------------------------------------");
        System.out.println("Account Type: " + acctype);
        System.out.println("Account No: " + accno);
        System.out.println("Name: " + Name);
        System.out.println("Balance: " + balence);
    }

    void getalltransection() {
        System.out.println("Transaction for " + Name);
        for (int i = 0; i < Transacccount; i++) {
            transection[i].printTransection();
        }
    }
}

// ----------------------------------------------------------------------
// SAVING ACCOUNT
// ----------------------------------------------------------------------

class SavingAccount extends Accounts {

    static final double Minbal = 5000;
    static final double interestrate = 0.4;
    private static int next = 101;

    SavingAccount(String acctype, String name, double balence) {
        super(acctype, name, balence);
        this.accno = next++;
    }

    @Override
    void Withdraw(double amount) {

        if (balence > 0 && balence - amount >= Minbal) {

            balence = balence - amount;
            System.out.println("withdraw amount: " + amount);
            addTransection(new Transection("saving's withdraw ", amount));
        } else {
            System.out.println("Minimum balance rule violated!");
        }
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balence += amount;
            System.out.println("Deposit Successful!");
            addTransection(new Transection("saving's deposit ", amount));
        }
    }

    double calculateinterest() {
        return balence * interestrate / 100;
    }
}

// ----------------------------------------------------------------------
// SALARY ACCOUNT
// ----------------------------------------------------------------------

class SalaryAccounts extends Accounts {

    String post;
    boolean isFrozen = false;

    static final double interestrate = 0.5;
    private static int next = 201;

    SalaryAccounts(String acctype, String name, double balence, String post) {
        super(acctype, name, balence);
        this.post = post;
        this.accno = next++;
    }

    void Withdraw(double amount) {

        if (lasttransD.plusMonths(2).isBefore(LocalDate.now())) {
            isFrozen = true;
        }

        if (!isFrozen && balence - amount >= 5000) {

            balence = balence - amount;
            System.out.println("Withdraw successful!");
            addTransection(new Transection("salary withdraw", amount));
        } else {
            System.out.println("Insufficient balance or account frozen!");
        }
    }

    void deposit(double amount) {

        if (lasttransD.plusMonths(2).isBefore(LocalDate.now())) {
            isFrozen = true;
        }

        if (!isFrozen) {
            balence =balence + amount;
            System.out.println("Deposit Successful!");
            addTransection(new Transection("salary deposit ", amount));
        }
    }

    double calculateinterest() {
        return balence * interestrate / 100;
    }

    void printdetails() {
        super.printdetails();
        System.out.println("post: " + post);
    }
}

// ----------------------------------------------------------------------
// CURRENT ACCOUNT
// ----------------------------------------------------------------------

class CurrentAccount extends Accounts {

    double overdraftlimit;
    private static int next = 301;

    public CurrentAccount(String acctype, String name, double balence, double overdraftlimit) {
        super(acctype, name, balence);
        this.accno = next++;
        this.overdraftlimit = overdraftlimit;
    }

    @Override
    void Withdraw(double amount) {

        if (balence + overdraftlimit >= amount) {
            balence -= amount;
            System.out.println("Withdraw successful!");
            addTransection(new Transection("current withdraw ", amount));
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }

    void deposit(double amount) {
        balence += amount;
        addTransection(new Transection("current deposit ", amount));
    }

    double calculateinterest() {
        return 0;
    }

    void printdetails() {
        super.printdetails();
        System.out.println("Overdraft Limit: " + overdraftlimit);
    }
}

// ----------------------------------------------------------------------
// LOAN ACCOUNT
// ----------------------------------------------------------------------

class LoanAccount extends Accounts {

    double loanAmount;
    double emi;
    int months;
    int monthsPaid;
    double interestRate;

    private static int next = 401;

    LoanAccount(String type, String name) {
        super(type, name, 0);
        this.accno = next++;
    }

    void issueLoan(double amount, int months, double rate) {

        this.loanAmount = amount;
        this.months = months;
        this.interestRate = rate;

        emi = (amount + amount * rate / 100) / months;

        this.balence -= amount;

        addTransection(new Transection("Loan Issued: " + amount, amount));
    }

    void payEMI() {

        if (monthsPaid < months) {

            balence += emi;
            monthsPaid++;

            addTransection(new Transection("EMI Paid: " + emi, emi));

            System.out.println("EMI Paid: " + monthsPaid + "/" + months);
        } else {
            System.out.println("All EMIs already paid!");
        }
    }

    void payFullLoan() {

        double totalPayable =
                (loanAmount + loanAmount * interestRate / 100)
                        - (emi * monthsPaid);

        balence += totalPayable;

        monthsPaid = months;

        addTransection(new Transection("Full Loan Paid", totalPayable));

        System.out.println("Loan fully paid: " + totalPayable);
    }

    @Override
    void deposit(double amt) {
        System.out.println("Cannot deposit. Use PayEMI or PayFullLoan.");
    }

    @Override
    void Withdraw(double amt) {
        System.out.println("Withdraw not allowed in Loan Account.");
    }

    double calculateinterest() {
        return 0;
    }

    void printLoanInfo() {
        System.out.println("----- Loan Details -----");
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Months: " + months);
        System.out.println("EMI: " + emi);
        System.out.println("EMI Paid: " + monthsPaid);
        System.out.println("Rate: " + interestRate + "%");
    }

    @Override
    void printdetails() {
        super.printdetails();
        printLoanInfo();
    }
}

// ----------------------------------------------------------------------
// MODEL
// ----------------------------------------------------------------------

class BankModel {

    Accounts[] Acc = new Accounts[50];
    int count = 0;

    void addAccount(Accounts a) {
        Acc[count++] = a;
    }

    Accounts getAcc(int accno) {
        for (int i = 0; i < count; i++) {
            if (Acc[i].accno == accno)
                return Acc[i];
        }
        return null;
    }

    void getAllacc() {
        for (int i = 0; i < count; i++) {
            Acc[i].printdetails();
        }
    }

    boolean deleteAccount(int accno) {

        for (int i = 0; i < count; i++) {
            if (Acc[i].accno == accno) {

                for (int j = i; j < count - 1; j++) {
                    Acc[j] = Acc[j + 1];
                }
                Acc[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    void generateEndOfDayReport() {

        System.out.println("-------- END OF DAY REPORT --------");

        for (int i = 0; i < count; i++) {

            Accounts acc = Acc[i];

            System.out.println("\nAccount No: " + acc.accno + " (" + acc.Name + ")");
            System.out.println("Today's Transactions:");

            for (int j = 0; j < acc.Transacccount; j++) {

                Transection t = acc.transection[j];

                if (t.Date.equals(LocalDate.now())) {
                    t.printTransection();
                }
            }
        }
    }

    void Accdemo() {

        addAccount(new SavingAccount("Saving", "Virat", 10000));
        addAccount(new SavingAccount("Saving", "Phil Salt", 10000));

        addAccount(new SalaryAccounts("Salary", "Amol", 20000, "Admin"));
        addAccount(new SalaryAccounts("Salary", "Shrii", 20000, "Admin"));

        addAccount(new CurrentAccount("Current", "Swamii", 6000, 2000));
        addAccount(new CurrentAccount("Current", "Tejas", 6000, 2000));
    }
}

// ----------------------------------------------------------------------
// CONTROLLER
// ----------------------------------------------------------------------

class BankController {

    BankModel model = new BankModel();

    void CreateSavingAcc(String type, String name, double bal) {
        model.addAccount(new SavingAccount(type, name, bal));
    }

    void CreateSallaryAcc(String type, String name, double bal, String post) {
        model.addAccount(new SalaryAccounts(type, name, bal, post));
    }

    void CreateCurrentAcc(String type, String name, double bal, double od) {
        model.addAccount(new CurrentAccount(type, name, bal, od));
    }

    void CreateLoanAccount(String type, String name, double amount, int months, double rate) {

        LoanAccount la = new LoanAccount(type, name);
        la.issueLoan(amount, months, rate);

        model.addAccount(la);

        System.out.println("Loan Account Created Successfully!");
    }

    Accounts findAcc(int accno) {
        return model.getAcc(accno);
    }

    void findAllAcc() {
        model.getAllacc();
    }

    void finddemo() {
        model.Accdemo();
    }

    void deleteAcc(int accno) {
        if (model.deleteAccount(accno))
            System.out.println("Account deleted successfully!");
        else
            System.out.println("Account not found!");
    }

    void reportEOD() {
        model.generateEndOfDayReport();
    }

    void ShowMenu() {
        System.out.println("\n--- MAIN MENU ---");
        System.out.println("1. Open Account");
        System.out.println("2. Pay EMI");
        System.out.println("3. Pay Full Loan");
        System.out.println("4. Show Loan Info");
        System.out.println("5. Deposit");
        System.out.println("6. Withdraw");
        System.out.println("7. Show Transactions");
        System.out.println("8. Find Account");
        System.out.println("9. Show All Accounts");
        System.out.println("10. Delete Account");
        System.out.println("11 Show EOD Report");
        System.out.println("12 Exit");
        System.out.print("Enter choice: ");
    }
}

// ----------------------------------------------------------------------
// MAIN
// ----------------------------------------------------------------------

class testbank {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        BankController controll = new BankController();

        Accounts Acc = null;

        controll.finddemo();
        
        System.out.println("Welcome to Bank Enter 0 To Explore: ");
        
        int st = sc.nextInt();
        sc.nextLine();
        
        
        if(st==0) {
        while (true) {

            controll.ShowMenu();

            int ch = sc.nextInt();
            sc.nextLine();

            // ---------------------------------------------
            // 1. OPEN ACCOUNT
            // ---------------------------------------------
            if (ch == 1) {  // Open Account
                System.out.println("--- Select Account Type ---");
                System.out.println("1. Saving Account");
                System.out.println("2. Salary Account");
                System.out.println("3. Current Account");
                System.out.println("4. Loan Account");
                System.out.print("Enter choice: ");
                int typeChoice = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                if (typeChoice == 1) {
                    System.out.print("Enter Initial Balance: ");
                    double sbalance = sc.nextDouble();
                    sc.nextLine();
                    if (sbalance >= 5000) {
                        controll.CreateSavingAcc("Saving", name, sbalance);
                       System.out.println("Saving Account Created!");
                    }
                    
                    else {
                        System.out.println("Minimum balance 5000 required!");
                    }
                } 
                
                else if (typeChoice == 2) {
                    System.out.print("Enter Initial Balance: ");
                    double salbal = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Post: ");
                    String post = sc.nextLine();
                    if (salbal >= 5000) {
                        controll.CreateSallaryAcc("Salary", name, salbal, post);
                        System.out.println("Salary Account Created!");
                    } 
                    
                    else {
                        System.out.println("Minimum balance 5000 required!");
                    }
                } 
                
                else if (typeChoice == 3) {
                    System.out.print("Enter Initial Balance: ");
                    double cbalance = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Overdraft Limit: ");
                    double od = sc.nextDouble();
                    sc.nextLine();
                    if (cbalance >= 5000) {
                        controll.CreateCurrentAcc("Current", name, cbalance, od);
                        System.out.println("Current Account Created!");
                    } 
                    
                    else {
                        System.out.println("Minimum balance 5000 required!");
                    }
                } 
                
                else if (typeChoice == 4) {
                    System.out.print("Enter Loan Amount: ");
                    double amount = sc.nextDouble();
                    System.out.print("Enter Months: ");
                    int months = sc.nextInt();
                    System.out.print("Enter Interest Rate (%): ");
                    double rate = sc.nextDouble();
                    sc.nextLine();
                    controll.CreateLoanAccount("Loan", name, amount, months, rate);
                   // System.out.println("Loan Account Created!");
                } 
                
                else {
                    System.out.println("Invalid choice!");
                }
            } 
            
            else if (ch == 2) { // Pay EMI
                System.out.print("Enter Loan Account Number: ");
                int accno = sc.nextInt();
                sc.nextLine();
                Acc = controll.findAcc(accno);
                if (Acc != null && Acc instanceof LoanAccount) {
                    ((LoanAccount) Acc).payEMI();
                } else {
                    System.out.println("Loan Account not found!");
                }
            } 
            
            else if (ch == 3) { // Pay Full Loan
                System.out.print("Enter Loan Account Number: ");
                int accno = sc.nextInt();
                sc.nextLine();
                Acc = controll.findAcc(accno);
                if (Acc != null && Acc instanceof LoanAccount) {
                    ((LoanAccount) Acc).payFullLoan();
                } 
                
                else {
                    System.out.println("Loan Account not found!");
                }
            } 
            else if (ch == 4) { // Show Loan Info
                System.out.print("Enter Loan Account Number: ");
                int accno = sc.nextInt();
                sc.nextLine();
                Acc = controll.findAcc(accno);
                if (Acc != null && Acc instanceof LoanAccount) {
                    ((LoanAccount) Acc).printLoanInfo();
                } 
                
                else {
                    System.out.println("Loan Account not found!");
                }
            } 
            else if (ch == 5) { // Deposit
                System.out.print("Enter Account Number: ");
                int accno = sc.nextInt();
                sc.nextLine();
                Acc = controll.findAcc(accno);
                if (Acc != null) {
                    System.out.print("Enter amount to deposit: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();
                    Acc.deposit(amt);
                } 
                
                else {
                    System.out.println("Account not found!");
                }
            } 
            else if (ch == 6) { // Withdraw
                System.out.print("Enter Account Number: ");
                int accno = sc.nextInt();
                sc.nextLine();
                Acc = controll.findAcc(accno);
                if (Acc != null) {
                    System.out.print("Enter amount to withdraw: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();
                    Acc.Withdraw(amt);
                }
                
                else {
                    System.out.println("Account not found!");
                }
            } 
            else if (ch == 7) { // Show Transactions
                System.out.print("Enter Account Number: ");
                int accno = sc.nextInt();
                sc.nextLine();
                Acc = controll.findAcc(accno);
                if (Acc != null) {
                    Acc.getalltransection();
                } 
                
                else {
                    System.out.println("Account not found!");
                }
            } 
            else if (ch == 8) { // Find Account
                System.out.print("Enter Account Number: ");
                int accno = sc.nextInt();
                sc.nextLine();
                Acc = controll.findAcc(accno);
                if (Acc != null) {
                    Acc.printdetails();
                } 
                else {
                    System.out.println("Account not found!");
                }
            } 
            else if (ch == 9) { // Show All Accounts
                controll.findAllAcc();
            } 
            else if (ch == 10) { // Delete Account
                System.out.print("Enter Account Number to delete: ");
                int accno = sc.nextInt();
                sc.nextLine();
                controll.deleteAcc(accno);
            } 
            else if (ch == 11) { // Show EOD Report
                controll.reportEOD();
            } 
            else if (ch == 12) { // Exit
                System.out.println("Thank you for using the bank!");
                break;
            } 
            else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
}