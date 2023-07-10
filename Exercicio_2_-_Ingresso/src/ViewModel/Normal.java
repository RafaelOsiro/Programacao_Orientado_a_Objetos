package ViewModel;

public class Normal extends Ingresso {
	
	@Override
	public void imprimeValor() {
		System.out.println("O valor do ingresso normal é: " + getPrice());
	}
}
