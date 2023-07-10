package View;

import java.util.Scanner;

import View.ProductsView;
import ViewModel.OrderViewModel;
import ViewModel.ProductsViewModel;

public class HomeView {
	
	Scanner scanner = new Scanner(System.in);
	
	public void funcMenu() {
		
		ProductsView productsView = new ProductsView();
		ProductsViewModel productsViewModel = new ProductsViewModel();
		productsView.setViewModel(productsViewModel);
		
		OrderView orderView = new OrderView();
		OrderViewModel orderViewModel = new OrderViewModel();
		orderView.setOrderViewModel(orderViewModel);
		orderView.setProductViewModel(productsViewModel);

		boolean isExit = false;
		int option;
		
		do {
			
			funcPrintTitles();
			option = scanner.nextInt();
			
			switch (option) {
			case 1: {
				productsView.funcAddProduct();
				break;
			}
			case 2: {
				orderView.funcAddNewOrder();
				break;
			}
			case 3: {
				isExit = funcConfirmExit();
				break;
			}
			default:
				System.out.println("Digite uma opcao valida!");;
				break;
			}
			
		} while(isExit == false);
	}
	
	private void funcPrintTitles() {
		System.out.println("Digite uma opcao: ");
		System.out.println("1 - Cadastrar um produto.");
		System.out.println("2 - Fazer um pedido.");
		System.out.println("3 - Sair do sistema.");
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
