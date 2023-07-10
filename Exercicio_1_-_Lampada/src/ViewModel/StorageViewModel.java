package ViewModel;

import java.util.ArrayList;
import Model.ProductModel;

public class StorageViewModel {
	
	private ProductModel lampadaModel = new ProductModel();
	private ArrayList<ProductModel> products = new ArrayList<ProductModel>();
	
	public void funcInitiateProduct() {
		
		lampadaModel.setName("Lâmpada Led Super Bulbo 20w Bivolt E27 Branca Fria 6500k");
		lampadaModel.setBrand("Led Planet");
		lampadaModel.setPrice(29.90);
		lampadaModel.setEan("789862703090");
		lampadaModel.setQuantity(500);
		
		products.add(lampadaModel);
	}
	
	public void funcListAllProducts() {
				
		for (ProductModel lampadaModel : this.products) {
			System.out.println(lampadaModel.getName());
			System.out.println(lampadaModel.getBrand());
			System.out.println(lampadaModel.getPrice());
			System.out.println(lampadaModel.getEan());
			System.out.println(lampadaModel.getQuantity());
		}
	}
}
