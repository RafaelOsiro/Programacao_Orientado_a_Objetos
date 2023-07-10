package ViewModel;

import java.util.ArrayList;
import java.util.Scanner;

import Model.BookModel;
import Model.BorrowModel;
import Model.ClientModel;

public class BorrowViewModel {
	
	private Scanner scanner = new Scanner(System.in);
	
	public void funcBorrowBook(ArrayList<BookModel> books, ArrayList<ClientModel> clients) {
		
		BorrowModel borrow = new BorrowModel();
		
		BookModel book = funcSearchBooks(books);
		
		if (book == null) {
			System.out.println("O livro pesquisado nao existe.");
			return;
		}
		
		if (book.getQuantity() <= 0) {
			System.out.println("O livro pesquisado nao esta disponivel.");
			return;
		}
		
		ClientModel client = funcSearchClients(clients);
		
		if (client == null) {
			System.out.println("O cliente pesquisado nao existe");
			return;
		}
		
		book.setQuantity(
				book.getQuantity() - 1
				);
		borrow.setBookModel(book);
		
		borrow.setClient(client);
	}
	
	private BookModel funcSearchBooks(ArrayList<BookModel> books) {
		System.out.println("Digite o nome do livro: ");

		String search = scanner.nextLine();
		
		if (books.isEmpty()) {
			System.out.println("O livro do digitado nao existe!");
			return null;
		}
		
		for(BookModel book: books) {
			if (search.equals(book.getTitle())) {
				return book;
			}
		}
		return null;
	}
	
	private ClientModel funcSearchClients(ArrayList<ClientModel> clients) {
		System.out.println("Digite o nome do cliente: ");
		String search = scanner.nextLine();
		
		if (clients.isEmpty()) {
			System.out.println("O livro do digitado nao existe!");
			return null;
		}
		
		for(ClientModel client: clients) {
			if (search.equals(client.getName())) {
				return client;
			}
		}
		return null;
	}
}
