package Application;

import View.SalesView;
import ViewModel.SalesViewModel;

public class E4_Vendas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalesViewModel salesViewModel = new SalesViewModel();
		SalesView salesView = new SalesView();
		
		salesView.setSalesViewModel(salesViewModel);
		salesView.funcMenu();
	}

}
