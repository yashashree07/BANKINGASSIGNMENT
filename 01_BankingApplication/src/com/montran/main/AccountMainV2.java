package com.montran.main;

import java.util.Scanner;

import com.montran.pojo.Account;

public class AccountMainV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		Account account=new Account();
		Scanner sc=new Scanner(System.in); //scanner obj
		
		//printing o/p using getter and setter
		account.setAccountNumber(101);
		System.out.println("AccountNumber :: " + account.getAccountNumber());
		account.setName("Yashashree");
		System.out.println("Name :: " + account.getName());
		account.setBalance(10000.00);
		System.out.println("Balance :: " +account.getBalance());
		
		System.out.println("-----------------------");
		
		//printing acc details using totring
		System.out.println(account);
		
		//for withdraw
		System.out.println("Enter amount to withdraw : ");
		amount=sc.nextInt();
		
		if(account.withdraw(amount))
		{
			System.out.println("Transaction success!!");
			
		}
		else
		{
			System.out.println("Transaction Failed");
		}
		
		System.out.println(account);
		
		//for deposit
		System.out.println("Enter amount to deposit : ");
		amount=sc.nextInt();
		
		if(account.deposit(amount))
		{
			System.out.println("Transaction success!!");
			
		}
		else
		{
			System.out.println("Transaction Failed");
		}
		
		System.out.println(account);
	}
	

}
