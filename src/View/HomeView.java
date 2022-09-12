package View;

import java.util.Scanner;

import View.ProductsView;
import ViewModel.ProductsViewModel;

public class HomeView {
	
	public void funcMenu() {
		
		ProductsView productsView = new ProductsView();
		ProductsViewModel productsViewModel = new ProductsViewModel();
		productsView.setViewModel(productsViewModel);

		Scanner scanner = new Scanner(System.in);

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
			
				break;
			}
			case 3: {
				
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
}
