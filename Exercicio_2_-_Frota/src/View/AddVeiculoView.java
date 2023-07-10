package View;

import java.util.Scanner;

import ViewModel.Carro;
import ViewModel.Moto;

public class AddVeiculoView {

	private Scanner scanner = new Scanner(System.in);
	
	Carro carro;
	Moto moto;
	
	public void funcMenu() {

		boolean isExit = false;
		int option;
		
		do {

			option = funcPrintMenu();

			switch (option) {
			case 1: {
				carro = insertNewCarro();
				carro.printDados();
				System.out.println("KM: " + carro.getKm());
				break;
			}
			case 2: {
				moto = insertNewMoto();
				moto.printDados();
				System.out.println("INT: " + moto.getAno());
				break;
			}
			case 3: {
				System.out.println("Preco total dos veiculos: " + (carro.getPreco() + moto.getPreco()));
				moto.insertData();
				carro.insertData();
				System.out.println("Preco total atualizado dos veiculos: " + (carro.getPreco() + moto.getPreco()));
				break;
			}
			case 4: {
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
		System.out.println("1 - CADASTRAR UM CARRO");
		System.out.println("2 - CADASTRAR UMA MOTO");
		System.out.println("3 - MOSTRAR OS VEICULOS");
		System.out.println("4 - SAIR DO SISTEMA");

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
	
	private Carro insertNewCarro() {
		
		String modelo;
		double preco;
		double km;
		boolean isValid = false;
		
		do {
			System.out.println("Digite o Modelo do Carro: ");
			modelo = scanner.nextLine();
			
			if (!modelo.isBlank() && !modelo.isEmpty()) {
				isValid = true;
			} else {
				isValid = false;
				System.out.println("O nome digitado e invalido!");
			}
		} while (isValid == false);
		
		isValid = false;

		do {
			System.out.println("Digite o Preco do Carro: ");
			preco = scanner.nextDouble();
			
			if (preco >= 0) {
				isValid = true;
			} else {
				isValid = false;
				System.out.println("O preco digitado e invalido!");
			}
		} while (isValid == false);
		
		isValid = false;

		do {
			System.out.println("Digite a quantidade de km: ");
			km = scanner.nextDouble();
			
			if (km >= 0) {
				isValid = true;
			} else {
				isValid = false;
				System.out.println("O km digitado e invalido!");
			}
		} while (isValid == false);
		
		Carro carro = new Carro(modelo, preco, km);
		return carro;
	}
	
	private Moto insertNewMoto() {
		
		String modelo;
		double preco;
		int ano;
		boolean isValid = false;
		
		do {
			System.out.println("Digite o Modelo da Moto: ");
			modelo = scanner.nextLine();
			
			if (!modelo.isBlank() && !modelo.isEmpty()) {
				isValid = true;
			} else {
				isValid = false;
				System.out.println("O nome digitado e invalido!");
			}
			
		} while (isValid == false);
		
		isValid = false;

		do {
			System.out.println("Digite o Preco da Moto: ");
			preco = scanner.nextDouble();
			
			if (preco >= 0) {
				isValid = true;
			} else {
				isValid = false;
				System.out.println("O preco digitado e invalido!");
			}
			
		} while (isValid == false);
		
		isValid = false;

		do {
			System.out.println("Digite o ano da Moto: ");
			ano = scanner.nextInt();
			
			if (ano >= 0) {
				isValid = true;
			} else {
				isValid = false;
				System.out.println("O ano digitado e invalido!");
			}
			
		} while (isValid == false);
		
		Moto moto = new Moto(modelo, preco, ano);
		return moto;
	}
}
