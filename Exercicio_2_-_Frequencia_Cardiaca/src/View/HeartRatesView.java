package View;

import java.util.Scanner;

import ViewModel.HeartRatesViewModel;

public class HeartRatesView {
	
	private HeartRatesViewModel viewModel;
	
	public HeartRatesView(HeartRatesViewModel viewModel) {
		this.viewModel = viewModel;
	}
	
	Scanner scanner = new Scanner(System.in);
	
	public void funcMenu() {
		
		boolean isExit = false;
		int option;
		
		do {
			
			option = funcPrintMenu();
			
			switch (option) {
			case 1: {
				viewModel.funcAddPatient();
				break;
			}
			case 2: {
				viewModel.funcSearchPatient();
				break;
			}
			case 3: {
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
		System.out.println("1 - CADASTRAR UM NOVO PACIENTE");
		System.out.println("2 - CHECAR FREQUENCIA CARDIACA");
		System.out.println("3 - SAIR DO SISTEMA");
		
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
