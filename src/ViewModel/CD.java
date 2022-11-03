package ViewModel;

public class CD extends Midia {

	private int nMusicas;
	
	public CD() { };
	
	public CD(int c, double p, String s, int m) {
		this.setCodigo(c);
		this.setPreco(p);
		this.setNome(s);
		this.nMusicas = m;
	}
	
	@Override
	public String getTipo() {
		return "CD";
	}
	
	@Override
	public String getDetalhes() {
		return "Codigo: " + getCodigo() + " " + "Preco: " + getPreco() + " " + "Nome: " + getNome() + " " + "Musicas: " + getnMusicas();
	}
	
	public void setMusica(int m) {
		this.nMusicas = m;
	}
	
	@Override
	public void inserirDados() {

		int codigo;
		double preco;
		String nome;
		int nMusicas;
		boolean isValid = false;
		
		do {
			
			System.out.println("Digite o Código do CD: ");
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
			
			System.out.println("Digite o Preco do CD: ");
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
			
			System.out.println("Digite o Nome do CD: ");
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
			System.out.println("Digite o Numero de Musicas: ");
			nMusicas = scanner.nextInt();
			
			if (nMusicas >= 0) {
				isValid = true;
				setMusica(nMusicas);
			} else {
				isValid = false;
				System.out.println("O Numero de Musicas digitado e invalido!");
			}
		} while (isValid == false);
	}

	public int getnMusicas() {
		return nMusicas;
	}
}
