package LAB5;

public class Account {
    
    private double balance;
    private String yearOfOpening;
    private String cnic;


    public Account(double balance, String yearOfOpening, String cnic) {
        this.balance = balance;
        this.yearOfOpening = yearOfOpening;
        this.cnic = cnic;
    }

    public Account(){

        balance = 0;
        yearOfOpening = null;
        cnic = null;

    }

    public Account(Account acc){
        this.balance = acc.balance;
        this.yearOfOpening = acc.yearOfOpening;
        this.cnic = acc.cnic;
    }

    public boolean equalAccounts(Account acc){

        if (this.balance == acc.balance && this.cnic == acc.cnic && this.yearOfOpening == acc.yearOfOpening) return true;

        return false;
    }

    public Account(double balance){
        this.balance = balance;
    }

    public void setValues(double balance, String yearOfOpening, String cnic){

        this.balance = balance;
        this.cnic = cnic;
        this.yearOfOpening = yearOfOpening;
    }

    public void display(){

        System.out.println("Balance: " + balance + "\nYear of opening: "+ yearOfOpening + "\nCNIC: " + cnic);
    }

    public void withDraw(double toBeWithdrawn){

        if (this.balance < toBeWithdrawn){
            System.out.println("Transaction declined");
            return;
        }

        this.balance -= toBeWithdrawn;
    }

    public void deposit(double toBeDeposited){

        this.balance += toBeDeposited;
    }

    public int ageOfAccount(){

        return 2022 - (Integer.parseInt(this.yearOfOpening)); 
    }

    // Extras

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getYearOfOpening() {
        return yearOfOpening;
    }

    public void setYearOfOpening(String yearOfOpening) {
        this.yearOfOpening = yearOfOpening;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    @Override
    public String toString() {
        return "Account [balance=" + balance + ", cnic=" + cnic + ", yearOfOpening=" + yearOfOpening + "]";
    }

    

}

