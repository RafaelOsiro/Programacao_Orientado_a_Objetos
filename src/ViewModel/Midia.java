package ViewModel;

import java.util.Scanner;
import java.lang.String;

public class Midia {
	
	private int codigo;
	private double preco;
	private String nome;
	
	protected Scanner scanner = new Scanner(System.in);
	
	public Midia() { }
	
	public Midia(int c, double p, String n) {
		this.codigo = c;
		this.preco = p;
		this.nome = n;
	}
	
	public String getTipo() {
		return "Midia";
	}
	
	public String getDetalhes() {
		return "Codigo: " + getCodigo() + " " + "Preco: " + getPreco() + " " + "Nome: " + getNome();
	}
	
	public void printDados() {
		System.out.println(getTipo());
		System.out.println(getDetalhes());
	}
	
	public void inserirDados() {
		
		int codigo;
		double preco;
		String nome;
		boolean isValid = false;
		
		do {
			
			System.out.println("Digite o Código da Midia: ");
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
			
			System.out.println("Digite o Preco da Midia: ");
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
			
			System.out.println("Digite o Nome da Midia: ");
			nome = scanner.toString();
			
			
			if (!nome.isEmpty() || !nome.isBlank()) {
				isValid = true;
				setPreco(preco);
			} else {
				isValid = false;
				System.out.println("O nome digitado e invalido!");
			}
			
		} while (isValid == false);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
