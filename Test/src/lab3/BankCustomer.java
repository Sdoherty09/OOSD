package lab3;

public class BankCustomer {

	public static void main(String[] args) {
		SavingsAccount saver1=new SavingsAccount(2000f,.04);
		SavingsAccount saver2=new SavingsAccount(3000f,.04);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println(saver1.toString());
		System.out.println(saver2.toString());
		saver1.modifyInterestRate(.05);
		saver2.modifyInterestRate(.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println(saver1.toString());
		System.out.println(saver2.toString());
		}

}
