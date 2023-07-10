package ViewModel;

public abstract class Ingresso {
	protected float price;

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void imprimeValor() {
		System.out.println("O valor do ingresso é: " + price);
	}
}
