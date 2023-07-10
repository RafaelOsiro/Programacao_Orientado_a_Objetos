package ViewModel;

import java.util.ArrayList;
import java.util.Scanner;

import Model.ClientModel;

public class ClientViewModel {
	
	ClientModel clientModel;
	
	private String textEntry;
	private boolean isValid = false;
	
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<ClientModel> clients = new ArrayList<ClientModel>();
	
	public ArrayList<ClientModel> getClients() {
		return clients;
	}

	public void funcAddNewClient() {
		
		ClientModel client = new ClientModel();
		
		funcAddName(client);
		funcAddAddress(client);
		funcAddPhoneNumber(client);
		
		clients.add(client);
	}
	
	private void funcAddName(ClientModel clientModel) {
		do {
			System.out.println("Digite o nome do cliente: ");
			this.textEntry = scanner.nextLine();

			if (!textEntry.isBlank() && !textEntry.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'Cliente' nao pode ser em branco ou vazio.");
			}

		} while (isValid == false);
		isValid = false;
		clientModel.setName(this.textEntry);
	}
	
	private void funcAddAddress(ClientModel clientModel) {
		do {
			System.out.println("Digite o endereco do cliente: ");
			this.textEntry = scanner.nextLine();

			if (!textEntry.isBlank() && !textEntry.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'Endereco' nao pode ser em branco ou vazio.");
			}

		} while (isValid == false);
		isValid = false;
		clientModel.setAddress(this.textEntry);
	}
	
	private void funcAddPhoneNumber(ClientModel clientModel) {
		do {
			System.out.println("Digite o telefone do cliente: ");
			this.textEntry = scanner.nextLine();

			if (!textEntry.isBlank() && !textEntry.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'Telefone' nao pode ser em branco ou vazio.");
			}

		} while (isValid == false);
		isValid = false;
		clientModel.setPhoneNumber(this.textEntry);
	}
}
