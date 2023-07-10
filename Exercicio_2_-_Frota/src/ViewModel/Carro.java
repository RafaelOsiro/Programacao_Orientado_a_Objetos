package ViewModel;

public class Carro extends Veiculos {
	
	private double km;

	public Carro(String n, double p, double k) {
		super(n, p);
		setKm(k);
	}
	
	@Override
	public double getPreco() {
		return super.getPreco();
	}

	public void setKm(double km) {
		this.km = km;
	}
	
	public double getKm() {
		return km;
	}
	
	public void insertData() {
		double preco = getPreco();
		if (km >= 100000) {
			setPreco(preco - (preco * 0.08));
		}
	}
}
