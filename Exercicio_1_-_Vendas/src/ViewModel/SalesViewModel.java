package ViewModel;

import java.util.ArrayList;
import java.util.Scanner;

import Model.ProductsModel;

public class SalesViewModel {
	
	ArrayList<ProductsModel> products = new ArrayList<ProductsModel>();
	Scanner scanner = new Scanner(System.in);
	
	public void funcAddNewProduct() {
		
		ProductsModel product = new ProductsModel();
		
		funcAddProductName(product);
		funcAddProductPrice(product);
		funcAddProductQuantity(product);
		
		products.add(product);
	}
	
	private void funcAddProductName(ProductsModel productsModel) {
		boolean isValidName = false;
		String name;
		
		do {
			System.out.println("DIGITE O NOME DO PRODUTO: ");
			name = scanner.nextLine();
			
			if(name.isBlank() && name.isEmpty()) {
				System.out.println("O CAMPO 'NOME' NAO PODE SER BRANCO OU VAZIO");
				isValidName = false;
			}
			else {
				isValidName = true;
			}
			
		} while (isValidName == false);
		
		productsModel.setName(name);
	}
	
	private void funcAddProductPrice(ProductsModel productsModel) {
		boolean isValidPrice = false;
		double price;
		
		do {
			System.out.println("DIGITE O PRECO DO PRODUTO: ");
			price = scanner.nextDouble();
			
			if(price < 0) {
				System.out.println("O CAMPO 'PRECO' NAO PODE SER MENOR DO QUE 0");
				isValidPrice = false;
			} else {
				isValidPrice = true;
			}
			
		} while (isValidPrice == false);
		
		productsModel.setPrice(price);
	}
	
	private void funcAddProductQuantity(ProductsModel productsModel) {
		boolean isValidPrice = false;
		int quantity;
		
		do {
			System.out.println("DIGITE A QUANTIDADE DO PRODUTO: ");
			quantity = scanner.nextInt();
			
			if(quantity < 0) {
				System.out.println("O CAMPO 'QUANTIDADE' NAO PODE SER MENOR DO QUE 0");
				isValidPrice = false;
			} else {
				isValidPrice = true;
			}
			
		} while (isValidPrice == false);
		
		productsModel.setQuantity(quantity);
	}
	
	public void funcMakeSale() {
		
		String productNameSearch, productName;
		boolean isContinue = true;
		int option;
		
		ProductsModel productSearch = new ProductsModel();
		ProductsModel foundProduct;
		ArrayList<ProductsModel> sale = new ArrayList<ProductsModel>();
		
		do {
			
			System.out.println("DIGITE O NOME DO PRODUTO: ");
			productNameSearch = scanner.nextLine();
			
			foundProduct = funcSearchProduct(productNameSearch);
			
			if (foundProduct != null ) {
				
				productSearch.setName(foundProduct.getName());
				productSearch.setPrice(foundProduct.getPrice());
				
				productSearch.setQuantity(funcSetSaleQuantity());
				productSearch.setPrice(funcSetSaleDiscount(productSearch));
				
				sale.add(productSearch);
				
				System.out.println("DESEJA ADICIONAR OUTRO PRODUTO?");
				System.out.println("1 - SIM");
				System.out.println("2 - NAO");
				option = scanner.nextInt();
				
				if (option == 1) {
					isContinue = true;
				} else {
					isContinue = false;
				}
				
			}
		} while (isContinue == true);
		
		funcPrintSale(sale);
	}
	
	private ProductsModel funcSearchProduct(String productName) {
		
		for (ProductsModel product : products) {
			if (productName.equals(product.getName())) {
				
				if (product.getQuantity() > 0) {
					return product;
				} else {
					return null;
				}
			}
		}
		
		return null;
	}
	
	private int funcSetSaleQuantity() {
		
		boolean isValidQuantity = false;
		int quantity;
		
		do {
			
			System.out.println("DIGITE A QUANTIDADE DO PRODUTO: ");
			quantity = scanner.nextInt();
			
			if (quantity > 0) {
				isValidQuantity = true;
			} else {
				System.out.println("QUANTIDADE DO PRODUTO DEVE SER MAIOR DO QUE 0");
			}
			
		} while (isValidQuantity == false);
		
		return quantity;
	}
	
	private double funcSetSaleDiscount(ProductsModel productsModel) {
		
		double price;
		
		if (productsModel.getQuantity() >= 11 && productsModel.getQuantity() <= 20) {
			price = productsModel.getPrice() - (productsModel.getPrice() * 0.10);
		} else if (productsModel.getQuantity() >= 21 && productsModel.getQuantity() <= 50) {
			price = productsModel.getPrice() - (productsModel.getPrice() * 0.20);
		} else {
			price = productsModel.getPrice() - (productsModel.getPrice() * 0.25);
		}
		
		return price;
	}
	
	private void funcPrintSale(ArrayList<ProductsModel> sale) {
		
		double price;
		
		for (ProductsModel product : sale) {
			
			price = product.getPrice() * product.getQuantity();
			
			System.out.println("PRODUTO: " + product.getName() + "\t QUANTIDADE: " + product.getQuantity() + "\t PRECO: R$" + price);
		}
	}
}
