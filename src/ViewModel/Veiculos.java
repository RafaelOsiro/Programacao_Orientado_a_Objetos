package ViewModel;

public class Veiculos {

	private String modelo;
	private double preco;
	
	public Veiculos(String name, double preco) {
		setModelo(name);
		setPreco(preco);
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void printDados() {
		System.out.println("Modelo: " + this.modelo + " " + "\nPreco: " + this.preco);
	}
}
