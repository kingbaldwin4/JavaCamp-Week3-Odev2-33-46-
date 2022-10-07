package staticDemo;

public class ProductValidator { //ana class static olamıyor
	//ama bu class'ın içine yazılan inner class'lar static olabilir
	
	static {
		System.out.println("Static yapıcı blok çalıştı");
	}
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public void bisey() {
		
	}
	//inner class
	//gruplandırma amaçlı kullanılır(temel class içerisinde de onu bölümlendirme için inner class'lar)
	public static class BaskaBirClass{
		public static void Sil() {
			
		}
	}
}
