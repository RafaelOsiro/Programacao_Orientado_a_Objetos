package Model;

import java.util.ArrayList;

import ViewModel.PaymentMethod.Payment;

public class OrderModel {
	
	private ArrayList<ProductsModel> orders = new ArrayList<ProductsModel>();
	private Payment payment;

	public ArrayList<ProductsModel> getOrder() {
		return orders;
	}

	public void setOrder(ProductsModel order) {
		this.orders.add(order);
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
}


