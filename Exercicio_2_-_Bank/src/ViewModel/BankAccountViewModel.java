package ViewModel;

import Model.AccountModel;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class BankAccountViewModel {

	private ArrayList<AccountModel> accounts = new ArrayList<AccountModel>();
	private Scanner scanner = new Scanner(System.in);
	private String text;
	private boolean isValid = false;

	public void funcCreateAccount() {

		AccountModel account = new AccountModel();

		funcAddAccountHolderName(account);
		funcAddHolderCpf(account);
		funcAddHolderRg(account);
		funcAddHolderPhoneNumber(account);
		funcAddHolderFather(account);
		funcAddHolderMother(account);

		funcAddHolderAddress(account);
		funcAddHolderNumber(account);
		funcAddHolderZipCode(account);
		funcAddHolderCity(account);
		funcAddHolderUf(account);

		funcSetAccountNumber(account);
		funcSetHolderBalance(account);

		this.accounts.add(account);
	}

	private void funcAddAccountHolderName(AccountModel account) {
		do {
			System.out.println("Digite o titular da conta: ");
			this.text = scanner.nextLine();

			if (!text.isBlank() && !text.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'Titular da conta' nao pode ser em branco ou vazio.");
			}

		} while (isValid == false);

		isValid = false;

		account.getAccountHolder().setName(this.text);
	}

	private void funcAddHolderCpf(AccountModel account) {
		do {
			System.out.println("Digite o CPF: ");
			this.text = scanner.nextLine();

			if (!text.isBlank() && !text.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'CPF' nao pode ser em branco ou vazio.");
			}

		} while (isValid == false);

		isValid = false;

		account.getAccountHolder().setCpf(this.text);
	}

	private void funcAddHolderRg(AccountModel account) {
		do {
			System.out.println("Digite o RG: ");
			this.text = scanner.nextLine();

			if (!text.isBlank() && !text.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'RG' nao pode ser em branco ou vazio.");
			}

		} while (isValid == false);

		isValid = false;

		account.getAccountHolder().setRg(this.text);
	}

	private void funcAddHolderPhoneNumber(AccountModel account) {
		do {
			System.out.println("Digite o Telefone: ");
			this.text = scanner.nextLine();

			if (!text.isBlank() && !text.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'Telefone' nao pode ser em branco ou vazio.");
			}

		} while (isValid == false);

		isValid = false;

		account.getAccountHolder().setPhoneNumber(this.text);
	}

	private void funcAddHolderFather(AccountModel account) {
		do {
			System.out.println("Digite o Nome do pai: ");
			this.text = scanner.nextLine();

			if (!text.isBlank() && !text.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'Nome do pai' nao pode ser em branco ou vazio.");
			}

		} while (isValid == false);

		isValid = false;

		account.getAccountHolder().setFather(this.text);
	}

	private void funcAddHolderMother(AccountModel account) {
		do {
			System.out.println("Digite o Nome da mae: ");
			this.text = scanner.nextLine();

			if (!text.isBlank() && !text.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'Nome da mae' nao pode ser em branco ou vazio.");
			}

		} while (isValid == false);

		isValid = false;

		account.getAccountHolder().setMother(this.text);
	}

	private void funcAddHolderAddress(AccountModel account) {
		do {
			System.out.println("Digite o endereco: ");
			this.text = scanner.nextLine();

			if (!text.isBlank() && !text.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'endereco' nao pode ser em branco ou vazio.");
			}

		} while (isValid == false);

		isValid = false;

		account.getAccountHolder().getAddress().setAddress(this.text);
	}

	private void funcAddHolderNumber(AccountModel account) {
		do {
			System.out.println("Digite o numero: ");
			this.text = scanner.nextLine();

			if (!text.isBlank() && !text.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'numero' nao pode ser em branco ou vazio.\n");
				System.out.println("Caso for 'Sem Numero' colocar 'S\\N'.\n");
			}

		} while (isValid == false);

		isValid = false;

		account.getAccountHolder().getAddress().setAddress(this.text);
	}

	private void funcAddHolderZipCode(AccountModel account) {
		do {
			System.out.println("Digite o CEP: ");
			this.text = scanner.nextLine();

			if (!text.isBlank() && !text.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'CEP' nao pode ser em branco ou vazio.\n");
			}

		} while (isValid == false);

		isValid = false;

		account.getAccountHolder().getAddress().setZipCode(this.text);
	}

	private void funcAddHolderCity(AccountModel account) {
		do {
			System.out.println("Digite a cidade: ");
			this.text = scanner.nextLine();

			if (!text.isBlank() && !text.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'cidade' nao pode ser em branco ou vazio.\n");
			}

		} while (isValid == false);

		isValid = false;

		account.getAccountHolder().getAddress().setZipCode(this.text);
	}

	private void funcAddHolderUf(AccountModel account) {
		do {
			System.out.println("Digite o UF: ");
			this.text = scanner.nextLine();

			if (!text.isBlank() && !text.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'UF' nao pode ser em branco ou vazio.\n");
			}

		} while (isValid == false);

		isValid = false;

		account.getAccountHolder().getAddress().setZipCode(this.text);
	}

	private void funcSetAccountNumber(AccountModel account) {

		int max = 10000000, randomNumber;
		String casting;

		
		Random rand = new Random();
		randomNumber = rand.nextInt(max);
		 
		DecimalFormat formatter = new DecimalFormat("00000000");
		formatter.format(randomNumber);
		 
		casting = String.valueOf(formatter);
		
		account.setAccountNumber(casting);
	}

	private void funcSetHolderBalance(AccountModel account) {
		account.setBanlance(0);
	}
}