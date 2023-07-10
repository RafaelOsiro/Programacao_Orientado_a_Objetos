import java.util.Scanner;

import View.MenuView;
import ViewModel.RetirementViewModel;

public class Main {

	public static void main(String[] args) {
		
		RetirementViewModel retirementVM = new RetirementViewModel();
		MenuView menuView = new MenuView();
		
		retirementVM.setMenuView(menuView);
		
		int option = 0;
		boolean isExit = false;
		boolean isValid = false;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Sistema para calcular a aposentadoria de um funcionario");
			menuView.funcPrintMenu();
			
			option = scan.nextInt();
			
			switch (option) {
				case 1: {
					retirementVM.funcCreateNewEmployee();
					break;
				}
				case 2: {
					retirementVM.funcSearchEmployee();
					break;
				}
				case 3: {
					retirementVM.funcCheckRetirement();
					break;
				} 
				case 4: {
					
					do {
						menuView.funcPrintExit();
						option = scan.nextInt();
						
						if (option == 1) {
							isExit = true;
							isValid = true;
						} else if (option == 2) {
							isExit = false;
							isValid = true;
						} else {
							System.out.println("Escolha uma opcao valida");
							isValid = false;
						}
						
					} while (isValid == false);
					break;
				}
				default: {
					break;
				}
			}
			
		} while (isExit == false);
		
		System.out.println("O sistema foi encarrado com sucesso!");
	}
}
