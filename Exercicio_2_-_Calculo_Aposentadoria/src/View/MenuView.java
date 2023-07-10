package View;

public class MenuView {

	/**
	 * Use this function to print in java console the menu of the system
	 */
	public void funcPrintMenu() {
		System.out.println("\n");
		System.out.println("[1] Cadastrar um funcionario");
		System.out.println("[2] Buscar um funcionario");
		System.out.println("[3] Checar a aposentadoria");
		System.out.println("[4] Sair do sistema");
		System.out.println("\nDigite uma opcao: ");
	}
	
	/**
	 * Use this function to print in java console to ask user if wants to confirm exit of the program
	 */
	public void funcPrintExit() {
		System.out.println("Voce quer sair do programa?");
		System.out.println("[1] Sim");
		System.out.println("[2] Nao");
	}
}
