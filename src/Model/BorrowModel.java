package Model;

public class BorrowModel {
	
	private BookModel bookModel;
	private ClientModel client;
	
	public BookModel getBookModel() {
		return bookModel;
	}
	
	public void setBookModel(BookModel bookModel) {
		this.bookModel = bookModel;
	}
	
	public ClientModel getClient() {
		return client;
	}
	
	public void setClient(ClientModel client) {
		this.client = client;
	}
}
