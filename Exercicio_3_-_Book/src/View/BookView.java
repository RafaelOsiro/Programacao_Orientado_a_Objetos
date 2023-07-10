package View;

import java.util.Scanner;

import ViewModel.BookViewModel;

public class BookView {
	
	private BookViewModel viewModel;
	
	public void setViewModel(BookViewModel viewModel) {
		this.viewModel = viewModel;
	}

	Scanner scanner = new Scanner(System.in);

	public void funcTitle() {
		
		int option;
		boolean isExit = false;
		
		do {
			
			funcPrintTitle();
			
			option = scanner.nextInt();
			
			switch (option) {
			case 1: {
				viewModel.funcAddNewBook();
				break;
			}
			case 2: {
				isExit = funcConfirmExit();
				break;
			}
			default:
				System.out.println("DIGITE UMA OPCAO VALIDA");
				break;
			}
		} while (isExit == false);
		
	}

	private void funcPrintTitle() {
		System.out.println("DIGITE UMA OPCAO!");
		System.out.println("1 - CADASTRAR UM LIVRO");
		System.out.println("2 - SAIR DO SISTEMA");
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
