package ViewModel;

import java.util.Scanner;

import Model.OrderModel;
import Model.ProductsModel;
import ViewModel.PaymentMethod.Payment;

public class OrderViewModel {
	
	private Scanner scanner = new Scanner(System.in);
	private ProductsViewModel productsViewModel;
	
	public void setProductsViewModel(ProductsViewModel productsViewModel) {
		this.productsViewModel = productsViewModel;
	}
	
	public void funcAddNewOrder() {
		OrderModel order = new OrderModel();
		
		funcAddNewProduct(order);
	}
	
	private void funcAddNewProduct(OrderModel order) {
		
		String text;
		int quantity;
		
		System.out.println("Digite o produto para inserir no carrinho");
		text = scanner.nextLine();
		
		for (ProductsModel product : productsViewModel.getProducts()) {
			
			/// Verifica se o produto existe no estoque
			if (text.equals(product.getName())) {
								
				System.out.println("Digite a quantidade do produto: ");
				quantity = scanner.nextInt();
				
				/// Verifica se a quantidade do produto e maior que o estoque
				if (quantity <= product.getQuantity()) {
					
					product.setQuantity(product.getQuantity() - quantity);
					
					ProductsModel orderProduct = new ProductsModel();
					
					orderProduct.setName(product.getName());
					orderProduct.setPrice(product.getPrice());
					orderProduct.setQuantity(quantity);
					
					order.setPayment(funcAddPayment());
					
				} else {
					System.out.println("Nao ha quantidae no estoque");
				}
			}
		}
	}
	
	private Payment funcAddPayment() {
		
		int option;
		boolean isValid = false;
		Payment payment = null;
		
		 do {
			 System.out.println("Escolha a forma de pagamento");
				System.out.println("1 - CARTAO");
				System.out.println("2 - CHEQUE");
				System.out.println("3 - DINHEIRO");
				
				option = scanner.nextInt();
				
				switch (option) {
				case 1: {
					payment = Payment.CARTAO;
					isValid = true;
					break;
				}
				case 2: {
					payment = Payment.CHEQUE;
					isValid = true;
					break;
				}
				case 3: {
					payment = Payment.DINHEIRO;
					isValid = true;
					break;
				}
				default:
					System.out.println("Digite uma opcao valida!");
					break;
				}
		} while (isValid == false);
		
		return payment;
	}
}
