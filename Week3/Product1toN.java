package assignments;

public class Product1toN {

	public static void main(String[] args) {
		
		long product = 1;
		
		for(long i = product; i <= 14; i++)
			product *= i;
		
		System.out.println(product);
		
	}

}
