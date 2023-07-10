package View;

import ViewModel.OrderViewModel;
import ViewModel.ProductsViewModel;

public class OrderView {
	
	private OrderViewModel orderViewModel;
	private ProductsViewModel productViewModel;

	public void setOrderViewModel(OrderViewModel orderViewModel) {
		this.orderViewModel = orderViewModel;
	}

	public void setProductViewModel(ProductsViewModel productViewModel) {
		this.productViewModel = productViewModel;
	}
	
	public void funcAddNewOrder() {
		orderViewModel.setProductsViewModel(productViewModel);
		orderViewModel.funcAddNewOrder();
	}
}
