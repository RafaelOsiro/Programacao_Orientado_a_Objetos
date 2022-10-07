package ViewModel;

public class VIP extends Ingresso {

	private float valorAdicional;
	
	public float getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public void imprimeValor() {
		System.out.println("O valor do ingresso VIP é: " + (getPrice() + getValorAdicional()));
	}
}