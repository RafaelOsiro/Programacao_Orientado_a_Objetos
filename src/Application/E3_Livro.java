package Application;

import View.BookView;
import ViewModel.BookViewModel;

public class E3_Livro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookViewModel viewModel = new BookViewModel();
		
		BookView bookView = new BookView();
		
		bookView.setViewModel(viewModel);
		
		bookView.funcTitle();

	}
}
