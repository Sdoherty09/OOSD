package lab3;

import java.util.Arrays;

public class BankCustomer {
private String name;
private String address;
private SavingsAccount[] savaccs=new SavingsAccount[3];
private int noOfAccs=0;

public BankCustomer(String name, String address) {
	setName(name);
	setAddress(address);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public SavingsAccount[] getSavaccs() {
	return savaccs;
}
public void setSavaccs(SavingsAccount[] savaccs) {
	this.savaccs = savaccs;
}
public void addAccount(SavingsAccount sav)
{
	
	if(noOfAccs<=2)
	{
		savaccs[noOfAccs]=sav;
		noOfAccs++;
	}
}
public double balance(SavingsAccount[] savaccs)
{
	double total=0;
	for(int i=0;i<savaccs.length;i++)
	{
		if(savaccs[i]!=null)
		{
			total+=savaccs[i].getSavingsBalance();
		}
	}
	return total;
}
@Override
public String toString() {
	return "BankCustomer [name=" + name + ", address=" + address + ", savaccs=" + Arrays.toString(savaccs) + "]";
}

}
