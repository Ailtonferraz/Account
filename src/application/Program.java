package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account(11, "ailton", 30.00);
		
		BusinessAccount bacc = new BusinessAccount(111, "ferraz", 0.0, 5000.00);
		
		// Upcasting
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(114, "ANJOS", 0.0, 5000.00);
		Account acc3 = new BusinessAccount(115, "FAMILIA", 0.0, 5000.00);	
		
		// Downcasting
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.2);
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.3);
			System.out.println("Loan");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		
		sc.close();

	}

}
