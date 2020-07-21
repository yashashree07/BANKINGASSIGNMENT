package com.montran.main;
import java.util.Scanner;

import com.montran.pojo.Account;
import com.montran.pojo.Savings;


public class AccountMainV5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		int accountNumber;
		String name;
		double balance;
		int amount;
		int transactionChoice;
		String continueChoice;
		int accountChoice;
		boolean isSalary = false;
		boolean result;

		System.out.println(" Hello Welcome to XYZ Bank !!");

		System.out.println("Menu");
		System.out.println("1.. Savings");
		System.out.println("2.. Current");
		System.out.println("Enter your choice");
		accountChoice = sc.nextInt();

		switch (accountChoice) {
		case 1:
			System.out.println("Do you want to open salary account (true-false)");
			isSalary = sc.nextBoolean();
			break;
		case 2:
			System.out.println("Work in progress !!");
		default:
			break;
		}

		System.out.println("Enter account Number");
		accountNumber = sc.nextInt();

		System.out.println("Enter Name");
		name = sc.next();

		System.out.println("Enter BAlance");
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
		sc.close();

	}
}
