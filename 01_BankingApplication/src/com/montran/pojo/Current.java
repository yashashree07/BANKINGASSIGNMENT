package com.montran.pojo;

public class Current extends Account {
	
	private double overdraftBalance;
	private double overdraftBalance_new;
	private double overdraftlimit_initial;
	

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		this.overdraftlimit_initial=overdraftBalance;
	}


	
	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount>0)
		{
			if(amount<=getBalance())
			{
				setBalance(getBalance()-amount);
				return true;
			}
			if(amount>=getBalance() )
			{
					setOverdraftBalance((getBalance()+overdraftBalance)-amount);
					setBalance(getBalance()-getBalance());
					return true;
			}
			
	
		}
		return false;
	}
	
	@Override
	/*public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount>0)
		{
			if(amount<=getBalance())
			{
				setBalance(getBalance()-amount);
				return true;
			}
			if(amount>=getBalance() )
			{
					amount=amount-getBalance();
					setBalance(getBalance()-getBalance());
					overdraftBalance=overdraftBalance-amount;
					return true;
			}
			
	
		}
		return false;
	}*/
	
		public boolean deposit(double amount) {
		if(amount>0)
		{
			if(overdraftBalance!=overdraftlimit_initial)
			{
				overdraftBalance_new=overdraftlimit_initial-overdraftBalance;
				 
				if(overdraftBalance_new<amount)
				{
					overdraftBalance=overdraftBalance+overdraftBalance_new;
					amount=amount-overdraftBalance_new;
					setBalance(amount+getBalance());
					return true;
					
				}
				if(overdraftBalance_new>=amount)
				{
					overdraftBalance=overdraftBalance+amount;
					return true;
				}
			}
				else
				{
					setBalance(amount+getBalance());
				}
				
			
		}
		return false;
	}



		@Override
		public String toString() {
			return "Current [overdraftBalance=" + overdraftBalance + ", getAccountNumber()=" + getAccountNumber()
					+ ", getName()=" + getName() + ", getBalance()=" + getBalance() + "]";
		}


		
	
	
	
	

}
