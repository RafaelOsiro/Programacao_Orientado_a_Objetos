package Application;

import Model.AccountModel;
import View.BankAccountRegistrationView;
import ViewModel.BankAccountViewModel;

public class E3_Banco {

	public static void main(String[] args) {
		
		BankAccountViewModel viewModel = new BankAccountViewModel();
		BankAccountRegistrationView bankAccountRegistration = new BankAccountRegistrationView();
		bankAccountRegistration.setViewModel(viewModel);
				
		bankAccountRegistration.funcPrintMenu();
	}

}
