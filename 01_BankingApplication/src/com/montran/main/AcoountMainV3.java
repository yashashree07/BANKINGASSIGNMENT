package com.montran.main;

import java.util.Scanner;

import com.montran.pojo.Account;

public class AcoountMainV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int accountNumber;
		String name;
		Double balance;
		int transactionChoice;
		int amount;
		Boolean result;
		String continueChoice;
		
		
		System.out.println("HELLO WELCOME TO XYZ BANK");
		
		System.out.println("Enter account number");
		accountNumber=sc.nextInt();
		
		System.out.println("Enter Name");
		name=sc.next();
		
		System.out.println("Enter salary");
		balance=sc.nextDouble();
		
		Account account=new Account();
		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);
		
		System.out.println("----------------------\n");
	do
	{	
		System.out.println("MENU");
		System.out.println("1.Withdraw");
		System.out.println("2.Deposit");
		System.out.println("3.Balance");
		System.out.println("Enter your choice : ");
		transactionChoice=sc.nextInt();
		
		switch (transactionChoice) {
		case 1:
			System.out.print("Enter amount to withdraw");
			amount=sc.nextInt();
			result=account.withdraw(amount);
			if(result)
				System.out.println("Transaction Success!!");
			else
				System.out.println("Transaction Failed !!");
			break;
			
		case 2:
			System.out.print("Enter amount to deposit");
			amount=sc.nextInt();
			result=account.deposit(amount);
			if(result)
				System.out.println("Transaction Success!!");
			else
				System.out.println("Transaction Failed !!");
			break;
			
		case 3: 
			System.out.println("Account balance :: " +account.getBalance());
			break;

		default:
			System.out.println("Invalid Choice");
			break;
		}
		
		System.out.println("Do you want to continue");
		continueChoice=sc.next();
	}while(continueChoice.equals("yes"));
	
	sc.close();
		
		
		
	}

}
