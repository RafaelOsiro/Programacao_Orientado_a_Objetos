package View;

import java.util.Scanner;

import ViewModel.SavingsAccountViewModel;

public class SavingsAccountView {

	private SavingsAccountViewModel viewModel;

	private Scanner scanner = new Scanner(System.in);

	public SavingsAccountView(SavingsAccountViewModel viewModel) {
		this.viewModel = viewModel;
	}

	public void funcMenu() {

		boolean isExit = false;
		int option;
		
		viewModel.funcModifyInterestRate();

		do {

			option = funcPrintMenu();

			switch (option) {
			case 1: {
				viewModel.funcCreateAccount();;
				break;
			}
			case 2: {
				viewModel.funcCalculateMonthlyInterest(viewModel.getAccounts(), funcGetQuantityOfMonths());
				break;
			}
			case 3: {
				viewModel.funcShowAccounts(viewModel.getAccounts());
				break;
			}
			case 4: {
				viewModel.funcModifyInterestRate();
				break;
			}
			case 5: {
				isExit = funcExitProgram();
				break;
			}
			default:
				System.out.println("DIGITE UMA OPCAO VALIDA");;
			}


		} while (isExit == false);

		System.out.println("O SISTEMA FOI ENCERRADO COM SUCESSO!");
	}

	private int funcPrintMenu() {

		int option;

		System.out.println("DIGITE UMA OPCAO: ");
		System.out.println("1 - CADASTRAR UMA CONTA");
		System.out.println("2 - ATUALIZAR JUROS DAS CONTAS");
		System.out.println("3 - MOSTRAR AS CONTAS");
		System.out.println("4 - ATUALIZAR A TAXA DE JUROS");
		System.out.println("5 - SAIR DO SISTEMA");

		option = scanner.nextInt();

		return option;
	}

	private boolean funcExitProgram() {

		int option;
		boolean isValid = false, isExit = false;

		do {

			System.out.println("DESEJA SAIR DO SISTEMA?");
			System.out.println("DIGITE UMA OPCAO: ");
			System.out.println("1 - SIM");
			System.out.println("2 - NAO");

			option = scanner.nextInt();

			if (option == 1) {
				isExit = true;
				isValid = true;
			} else if (option == 2) {
				isExit = false;
				isValid = true;
			} else {
				System.out.println("DIGITE UMA OPCAO VALIDA");
				isValid = false;
			}

		} while (isValid == false);

		return isExit;
	}
	
	private int funcGetQuantityOfMonths() {
		
		int months = 1;
		boolean isValid = false;
		
		do {
			
			System.out.println("QUAL A QUANTIDADE DE MESES QUE DESEJA ATUALIZAR: ");
			months = scanner.nextInt();
			
			if (months >= 1) {
				isValid = true;
			} else {
				isValid = false;
				System.out.println("O CAMPO 'MES' DEVE SER VALIDO.");
			}

		} while (isValid == false);
		
		return months;
	}

}
