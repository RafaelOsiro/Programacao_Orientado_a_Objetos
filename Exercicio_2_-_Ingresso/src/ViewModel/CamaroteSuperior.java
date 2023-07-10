package ViewModel;

public class CamaroteSuperior extends VIP {

	@Override
	public void imprimeValor() {
		System.out.println("O valor do ingresso VIP do Camarote Superior é: " + (getPrice() + getValorAdicional()));
	}
}