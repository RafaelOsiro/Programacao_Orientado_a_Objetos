package View;

import java.util.Scanner;

import ViewModel.Midia;
import ViewModel.CD;
import ViewModel.DVD;

public class AddMidiaView {
	
	private Midia midiaVM;
	private CD cdVM;
	private DVD dvdVM;

	private Scanner scanner = new Scanner(System.in);

	public AddMidiaView(Midia midiaVM, CD cdVM, DVD dvdVM) {
		this.midiaVM = midiaVM;
		this.cdVM = cdVM;
		this.dvdVM = dvdVM;
	}

	public void funcMenu() {

		boolean isExit = false;
		int option;
		
		do {

			option = funcPrintMenu();

			switch (option) {
			case 1: {
				cdVM.inserirDados();
				break;
			}
			case 2: {
				dvdVM.inserirDados();
				break;
			}
			case 3: {
				cdVM.printDados();
				break;
			}
			case 4: {
				dvdVM.printDados();
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
		System.out.println("1 - CADASTRAR UM CD");
		System.out.println("2 - CADASTRAR UM DVD");
		System.out.println("3 - MOSTRAR O CD");
		System.out.println("4 - MOSTRAR O DVD");
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
}
