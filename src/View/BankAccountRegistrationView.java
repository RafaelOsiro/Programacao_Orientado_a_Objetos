package View;

import ViewModel.BankAccountViewModel;

import java.util.Scanner;

public class BankAccountRegistrationView {
	
	private BankAccountViewModel viewModel;
	Scanner scanner = new Scanner(System.in);
	
	public BankAccountViewModel getViewModel() {
		return viewModel;
	}

	public void setViewModel(BankAccountViewModel viewModel) {
		this.viewModel = viewModel;
	}
	
	public void funcPrintMenu() {
		
		int option;
		boolean exit = false;
		
		do {
			
			funcMenuTitle();
			option = scanner.nextInt();
			
			switch (option) {
			case 1: {
				viewModel.funcCreateAccount();
				break;
			}
			case 2: {
				exit = funcConfirmExit();
				break;
			}
			default:
				System.out.println("DIGITE UMA OPCAO VALIDA");
				break;
			}
			
		} while(exit == false);
	}
	
	private void funcMenuTitle() {
		System.out.println("DIGITE UMA OPCAO!\n");
		System.out.println("1 - ADICIONAR UMA NOVA CONTA BANCARIA\n");
		System.out.println("2 - SAIR");
	}
	
	private boolean funcConfirmExit() {
		
		int option;
		boolean isValid = false, exit = false;
		
		do {
			
			System.out.println("DESEJA SAIR DO SISTEMA?");
			System.out.println("1 - SIM");
			System.out.println("2 - NAO");
			
			option = scanner.nextInt();
			
			if (option == 1) {
				isValid = true;
				exit = true;
				
			} else if (option == 2) {
				isValid = true;
				exit = false;
			} else {
				isValid = false;
			}
		} while (isValid == false);
		
		return exit;
	}

}
