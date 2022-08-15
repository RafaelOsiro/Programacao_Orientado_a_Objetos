package View;

public class MenuView {

	public void funcPrintMenu() {
		System.out.println("\n");
		System.out.println("[1] Cadastrar um funcionario");
		System.out.println("[2] Buscar um funcionario");
		System.out.println("[3] Checar a aposentadoria");
		System.out.println("[4] Sair do sistema");
		System.out.println("\nDigite uma opcao: ");
	}
	
	public void funcPrintExit() {
		System.out.println("Voce quer sair do programa?");
		System.out.println("[1] Sim");
		System.out.println("[2] Nao");
	}
}
