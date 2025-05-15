package ch8;
//EX-8.6
public class SavingAccount {
    private static int annualInterestRate=8;
    private double SavingBalance;

    public static int getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setSavingBalance(double savingBalance) {
        SavingBalance = savingBalance;
    }
    public double calculate(){
        SavingBalance=SavingBalance+(SavingBalance*annualInterestRate/100)/12;
        return SavingBalance;
    }
    public void modifyBalance(int interestRate){
        annualInterestRate=interestRate;
    }

    public static void main(String[] args) {
        SavingAccount sa= new SavingAccount();
        SavingAccount sa3= new SavingAccount();
        sa.setSavingBalance(1000000);
        System.out.println("First Saving Account "+sa.calculate());
        SavingAccount sa2=new SavingAccount();
        sa2.setSavingBalance(2000000);
        System.out.println(sa2.calculate());
        sa2.modifyBalance(9);
        System.out.println(sa2.calculate());
        // System.out.println(SavingAccount.getAnnualInterestRate());
        System.out.println(sa3.getAnnualInterestRate());
    }
}