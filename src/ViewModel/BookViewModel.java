package ViewModel;

import java.util.ArrayList;
import java.util.Scanner;

import Model.BookModel;

public class BookViewModel {
	
	BookModel bookModel;
	
	private String textEntry;
	private boolean isValid = false;
	
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<BookModel> books = new ArrayList<BookModel>();
	

	public ArrayList<BookModel> getBooks() {
		return books;
	}

	public void funcAddNewBook() {
		
		BookModel book = new BookModel();
		
		funcAddTitle(book);
		funcAddSubTitle(book);
		funcAddAuthor(book);
		funcAddPublisher(book);
		funcAddQuantity(book);
		funcAddPrice(book);
		
		books.add(book);
	}
	
	private void funcAddTitle(BookModel bookModel) {
		do {
			System.out.println("Digite o titulo do livro: ");
			this.textEntry = scanner.nextLine();

			if (!textEntry.isBlank() && !textEntry.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'Titular da conta' nao pode ser em branco ou vazio.");
			}

		} while (isValid == false);
		isValid = false;
		bookModel.setTitle(this.textEntry);
	}
	
	private void funcAddSubTitle(BookModel bookModel) {
		do {
			System.out.println("Digite o sub titulo do livro: ");
			this.textEntry = scanner.nextLine();

			if (!textEntry.isBlank() && !textEntry.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'sub titulo' nao pode ser em branco ou vazio.");
			}

		} while (isValid == false);
		isValid = false;
		bookModel.setSubTitle(this.textEntry);
	}
	
	private void funcAddAuthor(BookModel bookModel) {
		do {
			System.out.println("Digite o autor do livro: ");
			this.textEntry = scanner.nextLine();

			if (!textEntry.isBlank() && !textEntry.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'autor' nao pode ser em branco ou vazio.");
			}

		} while (isValid == false);
		isValid = false;
		bookModel.setAuthor(this.textEntry);
	}
	
	private void funcAddPublisher(BookModel bookModel) {
		do {
			System.out.println("Digite a editora do livro: ");
			this.textEntry = scanner.nextLine();

			if (!textEntry.isBlank() && !textEntry.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("O campo 'editora' nao pode ser em branco ou vazio.");
			}

		} while (isValid == false);
		isValid = false;
		bookModel.setPublisher(this.textEntry);
	}
	
	private void funcAddQuantity (BookModel bookModel) {
		
		int quantity = 0;
		
		do {
			System.out.println("Digite a quantidade de livro: ");
			
			quantity = scanner.nextInt();
			
			if (!(quantity < 0)) {
				isValid = true;
			} else {
				System.out.println("O campo 'Preco' nao pode ser menor que 0.");
			}
			
		} while(isValid == false);
		
		isValid = false;
		
		bookModel.setQuantity(quantity);
	}
	
	private void funcAddPrice (BookModel bookModel) {
		
		double price = 0;
		
		do {
			System.out.println("Digite o preco do livro: ");
			price = scanner.nextDouble();

			if (!(price < 0)) {
				isValid = true;
			} else {
				System.out.println("O campo 'Preco' nao pode ser menor que 0.");
			}

		} while (isValid == false);
		isValid = false;
		
		bookModel.setPrice(price);
	}
}
