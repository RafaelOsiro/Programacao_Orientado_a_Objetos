package Application;

import View.BookView;
import ViewModel.BookViewModel;
import ViewModel.BorrowViewModel;
import ViewModel.ClientViewModel;

public class E3_Biblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookViewModel bookViewModel = new BookViewModel();
		BorrowViewModel borrowViewModel = new BorrowViewModel();
		ClientViewModel clientViewModel = new ClientViewModel();
		
		BookView bookView = new BookView();
		
		bookView.setViewModel(bookViewModel);
		bookView.setBorrowViewModel(borrowViewModel);
		bookView.setClientViewModel(clientViewModel);
		
		bookView.funcTitle();
		
	}
}
