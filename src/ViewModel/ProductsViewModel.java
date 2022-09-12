package ViewModel;

import java.util.ArrayList;
import java.util.Scanner;

import Model.ProductsModel;

public class ProductsViewModel {
	
	ArrayList<ProductsModel> products = new ArrayList<ProductsModel>();
	Scanner scanner = new Scanner(System.in);
	
	
	public void funcAddNewProduct() {
		
		ProductsModel product = new ProductsModel();
		
		funcAddProductName(product);
		funcAddProductPrice(product);
		funcAddProductQuantity(product);
		
		products.add(product);
	}
	
	private void funcAddProductName(ProductsModel productModel) {
		
		String text;
		boolean isValid = false;
		
		do {
			
			System.out.println("Digite o nome do produto: ");
			text = scanner.nextLine();
			
			if (text.isBlank() && text.isEmpty()) {
				isValid = false;
				System.out.println("O campo 'Nome do produto' nao pode ser vazio ou nulo.");
			} else {
				isValid = true;
			}
		} while (isValid == false);
		
		productModel.setName(text);
	}
	
	private void funcAddProductPrice(ProductsModel productModel) {
		
		double price;
		boolean isValid = false;
		
		do {
			
			System.out.println("Digite o preco do produto: ");
			price = scanner.nextDouble();
			
			if (price < 0) {
				isValid = false;
				System.out.println("O campo 'Preco do produto' nao pode ser vazio ou nulo.");
			} else {
				isValid = true;
			}
		} while (isValid == false);
		
		productModel.setPrice(price);
	}
	
	private void funcAddProductQuantity(ProductsModel productModel) {
		
		int quantity;
		boolean isValid = false;
		
		do {
			
			System.out.println("Digite a quantidade do produto: ");
			quantity = scanner.nextInt();
			
			if (quantity < 0) {
				isValid = false;
				System.out.println("O campo 'Quantidade do produto' nao pode ser vazio ou nulo.");
			} else {
				isValid = true;
			}
		} while (isValid == false);
		
		productModel.setQuantity(quantity);
	}
}
