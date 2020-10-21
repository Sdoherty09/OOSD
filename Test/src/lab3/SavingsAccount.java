package lab3;

public class SavingsAccount {
private float savingsBalance;
private double annualInterestRate;
private int accountNo;
private static int setNo=0;


public SavingsAccount(float savingsBalance, double annualInterestRate) {
	setSavingsBalance(savingsBalance);
	setAnnualInterestRate(annualInterestRate);
	setNo++;
	accountNo=setNo;
}

public double getSavingsBalance() {
	return savingsBalance;
}

public void setSavingsBalance(float savingsBalance) {
	this.savingsBalance = savingsBalance;
}

public double getAnnualInterestRate() {
	return annualInterestRate;
}

public void setAnnualInterestRate(double annualInterestRate) {
	this.annualInterestRate = annualInterestRate;
}

public void calculateMonthlyInterest()
{
	this.savingsBalance+=savingsBalance*(annualInterestRate/12);
}
public void modifyInterestRate(double changeInterest)
{
	this.annualInterestRate=changeInterest;
}

@Override
public String toString() {
	return "SavingsAccount [accuntNo="+accountNo+", savingsBalance=" + savingsBalance + ", annualInterestRate=" + annualInterestRate + "]";
}

}
