package assignments;

public class CozaLozaWoza {

	public static void main(String[] args) {
		
		int num = 1;
		
		for(int i = num; i <= 110; i++) {
			if(i % 3 == 0) {
				if(i % 5 == 0) {
					if(i % 7 == 0)
						System.out.print("CozaLozaWoza ");
					else
						System.out.print("CozaLoza ");
				}
				else if(i % 7 == 0)
					System.out.print("CozaWoza ");
				else
					System.out.print("Coza ");
				if(i % 11 == 0)
					System.out.println();
			}
			else if(i % 5 == 0) {
				if(i % 7 == 0)
					System.out.print("LozaWoza ");
				else
				 System.out.print("Loza ");
				if(i % 11 == 0)
					System.out.println();
			}	
			else if(i % 7 == 0) {
				System.out.print("Woza ");
				if(i % 11 == 0)
					System.out.println();
			}
			else if(i % 11 == 0)
				System.out.println(i);
			else
				System.out.print(i + " ");
		}
		
	}

}
