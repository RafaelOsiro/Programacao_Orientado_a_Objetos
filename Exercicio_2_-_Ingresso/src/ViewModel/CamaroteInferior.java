package ViewModel;

public class CamaroteInferior extends VIP {

	private int localizacaoDoIngresso;

	public int getLocalizacaoDoIngresso() {
		return localizacaoDoIngresso;
	}

	public void setLocalizacaoDoIngresso(int localizacaoDoIngresso) {
		this.localizacaoDoIngresso = localizacaoDoIngresso;
	}

	@Override
	public void imprimeValor() {
		System.out.println("A localização do ingresso do Camarote inferior é: " + localizacaoDoIngresso);
	}
}
