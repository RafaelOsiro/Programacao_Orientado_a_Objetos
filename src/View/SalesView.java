package View;

import java.util.Scanner;

import ViewModel.SalesViewModel;

public class SalesView {
	
	private SalesViewModel salesViewModel;
	Scanner scanner = new Scanner(System.in);

	public SalesViewModel getSalesViewModel() {
		return salesViewModel;
	}

	public void setSalesViewModel(SalesViewModel salesViewModel) {
		this.salesViewModel = salesViewModel;
	}
	
	public void funcMenu() {
		
		boolean isExit = false;
		
		int option;
		
		do {
			
			funcTitles();
			option = scanner.nextInt();
			
			switch (option) {
			case 1: {
				salesViewModel.funcAddNewProduct();
				break;
			}
			case 2: {
				salesViewModel.funcMakeSale();
				break;
			}
			case 3: {
				isExit = funcConfirmExit();
				break;
			}
			default:
				System.out.println("DIGITE UMA OPCAO VALIDA");
				break;
			}
			
		} while (isExit == false);
		
	}
	
	private void funcTitles() {
		System.out.println("DIGITE UMA OPCAO");
		System.out.println("1 - ADICIONAR UM PRODUTO");
		System.out.println("2 - FAZER UMA VENDA");
		System.out.println("3 - SAIR DO SISTEMA");
	}
	
	private boolean funcConfirmExit() {
		
		int option;
		boolean isValid = false, exit = false;
		
		do {
			
			System.out.println("DESEJA SAIR DO SISTEMA?");
			System.out.println("1 - SIM");
			System.out.println("2 - NAO");
			
			option = this.scanner.nextInt();
			
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
