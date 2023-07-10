package ViewModel;

public class DVD extends Midia {
	
	private int nFaixas;
	
	public DVD() { }
	
	public DVD(int c, double p, String s, int f) {
		this.setCodigo(c);
		this.setPreco(p);
		this.setNome(s);
		this.nFaixas = f;
	}
	
	@Override
	public String getTipo() {
		return "DVD";
	}
	
	@Override
	public String getDetalhes() {
		return "Codigo: " + getCodigo() + " " + "Preco: " + getPreco() + " " + "Nome: " + getNome() + " " + "Faixas: " + getnFaixas();
	}
	
	public void setFaixas(int f) {
		this.nFaixas = f;
	}
	
	@Override
	public void inserirDados() {

		int codigo;
		double preco;
		String nome;
		int nFaixas;
		boolean isValid = false;
		
		do {
			
			System.out.println("Digite o Código do DVD: ");
			codigo = scanner.nextInt();
			
			if (codigo >= 0) {
				isValid = true;
				setCodigo(codigo);
			} else {
				isValid = false;
				System.out.println("O codigo digitado e invalido!");
			}
			
		} while (isValid == false);
		
		isValid = false;

		do {
			
			System.out.println("Digite o Preco do DVD: ");
			preco = scanner.nextDouble();
			
			if (preco >= 0) {
				isValid = true;
				setPreco(preco);
			} else {
				isValid = false;
				System.out.println("O preco digitado e invalido!");
			}
			
		} while (isValid == false);
		
		isValid = false;

		do {
			
			System.out.println("Digite o Nome do DVD: ");
			nome = scanner.nextLine();
			
			
			if (!nome.isEmpty() || !nome.isBlank()) {
				isValid = true;
				setNome(nome);
			} else {
				isValid = false;
				System.out.println("O nome digitado e invalido!");
			}
			
		} while (isValid == false);
		
		isValid = false;
		
		do {
			System.out.println("Digite o Numero do DVD: ");
			nFaixas = scanner.nextInt();
			
			
			if (nFaixas >= 0) {
				isValid = true;
				setFaixas(nFaixas);
			} else {
				isValid = false;
				System.out.println("O Numero da Faixa digitado e invalido!");
			}
		} while (isValid == false);
	}

	public int getnFaixas() {
		return nFaixas;
	}
}
