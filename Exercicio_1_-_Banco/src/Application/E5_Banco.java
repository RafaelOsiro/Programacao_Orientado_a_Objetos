package Application;

import View.SavingsAccountView;
import ViewModel.SavingsAccountViewModel;

public class E5_Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccountViewModel viewModel = new SavingsAccountViewModel();
		
		SavingsAccountView view = new SavingsAccountView(viewModel);
		
		view.funcMenu();
	}

}
