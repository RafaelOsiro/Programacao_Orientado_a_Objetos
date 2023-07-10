package Application;

import View.HealthProfileView;
import ViewModel.HealthProfileViewModel;

public class E4_Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HealthProfileViewModel viewModel = new HealthProfileViewModel();
		HealthProfileView view = new HealthProfileView(viewModel);
		
		view.funcMenu();
	}

}
