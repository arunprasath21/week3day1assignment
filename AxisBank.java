package week3.Day1.org.Bank;

public class AxisBank extends BankInfo{
	
	
	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		
		axis.saving();
		System.out.println("The Savings account number is :" + axis.saving());
		
		axis.fixed();
		System.out.println("The Fixed account number is : " + axis.fixed());

		axis.deposit();
		System.out.println("The Deposit account number is : " + axis.deposit());
		
		
	}

}
