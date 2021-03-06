package a09_클래스2;

public class ProductTest {
	public static void test2(Product pp) {
		pp.showProduct();
	}
	public static Product test() {
		Product product = new Product();
		product.showProduct();
		product.setProductCode(20220307);
		product.setProductName("모니터1");
		return product;
	}
	
	public static void main(String[] args) {
		Product p = test();
		test2(p);
		
		Product tumbler = new Tumbler(2000, "스타벅스", "오픈식");
		Product cup = new MugCup(3000, "스타벅스 머그컵", true);

		
		Product[] products = new Product[2];
		products[0] = tumbler;
		products[1] = cup;
		
		for(int i = 0; i < products.length; i++) {
			products[i].showProduct();
			if(products[i] instanceof Tumbler) {
				Tumbler tumbler2 = (Tumbler)products[i];
						tumbler2.tumblerTset();
			}else {
				MugCup cup2 = (MugCup)products[i];
				cup2.mugcupTset();
			}
		}
				
	}

}
