package ViewModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Model.AccountHolderModel;

public class SavingsAccountViewModel {
	
	private double annualInterestRate;
		
	private Scanner scanner = new Scanner(System.in);
	
	private ArrayList<AccountHolderModel> accounts = new ArrayList<AccountHolderModel>();
	
	public ArrayList<AccountHolderModel> getAccounts() {
		return accounts;
	}

	
	public void funcCreateAccount() {
		
		AccountHolderModel account = new AccountHolderModel();
		
		funcAddSavingsBalance(account);
		funcAddAnnualInterestRate(account);
		
		accounts.add(account);
	}
	
	public void funcCalculateMonthlyInterest(ArrayList<AccountHolderModel> accounts, int month) {
		
		double adjustedBalance = 0, monthInterestRate, getSavings;
		
		for (AccountHolderModel account : accounts) {
			
			monthInterestRate = account.getAnnualInterestRate() / 12;
			
			getSavings = account.getSavingsBalance();
			
			for (int i = 0; i < month; i++) {
				
				if (i == 0) {
					adjustedBalance = getSavings + (getSavings * monthInterestRate);
				} else {
					adjustedBalance = adjustedBalance + (adjustedBalance * monthInterestRate);
				}
			}
			
			account.setSavingsBalance(adjustedBalance);
		}
		
		funcShowAccounts(accounts);
	}
	
	public void funcModifyInterestRate() {
		
		boolean isValid = false;
		double interest;
		
		do {
			
			System.out.println("DIGITE A TAXA DE JUROS ANUAL: ");
			interest = scanner.nextDouble();
			
			if (interest > 0) {
				isValid = true;
			} else {
				isValid = false;
				System.out.println("O CAMPO 'TAXA DE JUROS ANUAL' DEVE SER MAIOR DO QUE 0%");
			}
			
		} while (isValid == false);
		
		annualInterestRate = interest;
		
		funcRefreshAnnualInterestRate(accounts);
	}
	
	public void funcShowAccounts(ArrayList<AccountHolderModel> accounts) {
		
		int i = 1;
		for (AccountHolderModel account : accounts) {
			System.out.println("CONTA NUMERO: " + i);
			System.out.println("VALOR: " + account.getSavingsBalance());
			System.out.println("--------------------------");
			i++;
		}
	}
	
	private void funcAddSavingsBalance(AccountHolderModel account) {
		
		boolean isValid = false;
		double value;
		
		do {
			
			System.out.println("DIGITE O VALOR DO SALDO: ");
			value = scanner.nextDouble();
			
			if (value >= 0) {
				isValid = true;
			} else {
				System.out.println("O CAMPO 'SALDO' NAO PODE SER MENOR DO QUE R$ 0.00");
			}
			
		} while (isValid == false);
		
		account.setSavingsBalance(value);
	}
	
	private void funcAddAnnualInterestRate(AccountHolderModel account) {
		account.setAnnualInterestRate(annualInterestRate);
	}
	
	private void funcRefreshAnnualInterestRate(ArrayList<AccountHolderModel> accounts) {
		
		for (AccountHolderModel account : accounts) {
			account.setAnnualInterestRate(annualInterestRate);
		}
	}
	

}
