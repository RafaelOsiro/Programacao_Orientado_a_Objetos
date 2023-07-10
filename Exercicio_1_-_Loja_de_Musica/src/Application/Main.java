package Application;

import ViewModel.CD;
import ViewModel.DVD;
import ViewModel.Midia;
import View.AddMidiaView;

public class Main {

	public static void main(String[] args) {
		
		Midia midia = new Midia();
		CD cd = new CD();
		DVD dvd = new DVD();
		
		AddMidiaView midiaView = new AddMidiaView(midia, cd, dvd);
		
		midiaView.funcMenu();
	}
}
