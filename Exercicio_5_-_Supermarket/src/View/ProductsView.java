package View;

import ViewModel.ProductsViewModel;

public class ProductsView {
	
	ProductsViewModel viewModel;

	public void setViewModel(ProductsViewModel viewModel) {
		this.viewModel = viewModel;
	}
	
	public void funcAddProduct() {
		viewModel.funcAddNewProduct();
	}
}
