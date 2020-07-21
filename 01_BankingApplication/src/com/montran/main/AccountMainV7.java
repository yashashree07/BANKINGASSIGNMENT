package com.montran.main;

import java.util.Scanner;

import com.montran.pojo.Current;
import com.montran.pojo.Savings;

public class AccountMainV7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int accountNumber;
		String name;
		double balance;
		double overdraftBalance;
		double amount;
		int transactionChoice;
		String continueChoice;
		int accountChoice;
		boolean isSalary = false;
		boolean result;

		System.out.println("------------- Hello Welcome to XYZ Bank-------------\n");
		System.out.println("Menu");
		System.out.println("1..Savings");
		System.out.println("2..Current");
		System.out.println("3..Exit");
		
		System.out.println("Enter your account choice :");
		
		accountChoice=sc.nextInt(); //taking input for accountchoice
		
		switch (accountChoice) {
		
		case 1://if account choice is savings
			System.out.println("Do you want to open Salary Account ? (true-False)");
			isSalary=sc.nextBoolean();
			
			if(isSalary==true)
			{
				System.out.println("Enter account Number");
				accountNumber = sc.nextInt();

				System.out.println("Enter Name");
				name = sc.next();

				System.out.println("Enter Balance");
				balance = sc.nextDouble();
				
				Savings savings = new Savings(accountNumber, name, balance, isSalary);

				
				do {
					System.out.println("Menu");
					System.out.println("1. Withdraw");
					System.out.println("2. Deposit");
					System.out.println("3. Balance");
					System.out.println("Enter your choice");
					transactionChoice = sc.nextInt();

					switch (transactionChoice) {
					case 1:
						System.out.println("Enter amount to withdraw");
						amount = sc.nextInt();
						result = savings.withdraw(amount);
						if (result)
							System.out.println("Transaction Success !!");
						else
							System.out.println("Transaction Failed !!");
						break;
					case 2:
						System.out.println("Enter amount to deposit");
						amount = sc.nextInt();
						result = savings.deposit(amount);
						if (result)
							System.out.println("Transaction Success !!");
						else
							System.out.println("Transaction Failed !!");
						break;
					case 3:
						System.out.println("Account Balance :: " + savings.getBalance());
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}

					
					System.out.println("Do you want to continue ?");
					continueChoice = sc.next();
				} while (continueChoice.equals("yes"));
				
				System.out.println("\n Your account is created successfully!!\n");
				if(isSalary==true) {
					System.out.println("---------------------------------------------\n");
					System.out.println("Your account type is :: Savings(SalaryAccount)");
					System.out.println("---------------------------------------------\n");
					
				}
				System.out.println("------------------Account Details-------------\n");
				System.out.println("Account Number :: " + accountNumber);
				System.out.println("Account Holder Name :: " + name);
				System.out.println("Account Balance :: " + savings.getBalance());
				System.out.println("\n---------------------------------------------\n");
				System.out.println("Thank You For Banking With Us!!..");
				
			}
			else
			{
				//System.out.println("Enter your account choice : ");
				//accountChoice=sc.nextInt();
			}
			//end of case1
			break;
			
		case 2://if account choice is current
			System.out.println("Enter overdraft balance : ");
			overdraftBalance=sc.nextDouble();
			
			System.out.println("Enter account number : ");
			accountNumber=sc.nextInt();
			
			System.out.println("Enter Name : ");
			name=sc.next();
			
			System.out.println("Enter Balance");
			balance=sc.nextDouble();
			
			Current current = new Current(accountNumber, name, balance, overdraftBalance);
			
			do {
				System.out.println("Menu");
				System.out.println("1. Withdraw");
				System.out.println("2. Deposit");
				System.out.println("3. Balance");
				System.out.println("Enter your choice");
				
				transactionChoice = sc.nextInt();
				
				switch(transactionChoice) {
				case 1:
					System.out.println("Enter amount to withdraw");
					amount = sc.nextInt();
					result = current.withdraw(amount);
					if (result)
						System.out.println("Transaction Success !!");
					else
						System.out.println("Transaction Failed !!");
					break;
					
				case 2: 
					System.out.println("Enter amount to deposit");
					amount = sc.nextInt();
					result = current.deposit(amount);
					if (result)
						System.out.println("Transaction Success !!");
					else
						System.out.println("Transaction Failed !!");
					break;
					
				case 3:
					System.out.println("Account Main Balance :: \n" + current.getBalance());
					System.out.println("OverdraftBalance :: " + current.getOverdraftBalance());
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}
				

				System.out.println("Do you want to continue ?");
				continueChoice = sc.next();
		} while (continueChoice.equals("yes"));

			System.out.println("\n Your account is created successfully!!\n");
			System.out.println("---------------------------------------------\n");
			System.out.println("Your account type is :: Current Account ");
			System.out.println("---------------------------------------------\n");
			
			System.out.println("------------------Account Details-------------\n");
			System.out.println("Account Number :: " + accountNumber);
			System.out.println("Account Holder Name :: " + name);
			System.out.println("Balance :: " + current.getBalance());
			System.out.println("OverdraftBalance :: " + current.getOverdraftBalance());
			System.out.println("Thank You For Banking With Us!!..");
			//end of case2
			break;
			
		//case 3: break;
		
		default:	
					System.out.println("Invalid Choice!!");
					break;
		}
	
	}

}
		



