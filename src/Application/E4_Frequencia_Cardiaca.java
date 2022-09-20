package Application;

import View.HeartRatesView;
import ViewModel.HeartRatesViewModel;

public class E4_Frequencia_Cardiaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HeartRatesViewModel viewModel = new HeartRatesViewModel();
		
		HeartRatesView view = new HeartRatesView(viewModel);
		
		view.funcMenu();
	}

}
