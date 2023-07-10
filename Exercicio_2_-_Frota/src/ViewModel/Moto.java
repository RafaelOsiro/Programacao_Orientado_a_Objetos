package ViewModel;

public class Moto extends Veiculos {
	
	private int ano;

	public Moto(String n, double p, double a) {
		super(n, p);
		setAno((int)a);
	}
	
	@Override
	public double getPreco() {
		return super.getPreco();
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void insertData() {
		double preco = getPreco();
		if (ano >= 2008) {
			setPreco(preco + (preco * 0.10));
		}
	}
}
