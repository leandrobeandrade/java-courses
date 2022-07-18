package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 0.1);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.2, 500.0);
		
		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.3, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.4, 0.1);
		
		System.out.println(acc.getBalance());
		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());
		System.out.println(acc3.getBalance());
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		
		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;    		// cast from Account to BusinessAcount
		System.out.println(acc4.getBalance());
		
		// BusinessAccount acc5 = (BusinessAccount) acc3;		// error in runtime, no inheritance enter Classes
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(55.00);
			System.out.println("FALSE " + acc.getBalance());
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("TRUE " + acc.getBalance());
		}
	}
}