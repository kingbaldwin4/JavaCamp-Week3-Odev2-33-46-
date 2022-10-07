package staticDemo;

public class ProductManager {
	@SuppressWarnings("static-access")
	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}
		else {
			System.out.println("Ürün bilgileri geçersizdir");
		}
		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey();
	}
}
