package challenge;

public class SquareBoardChecker implements ISquareBoard {

	@Override
	public void computeAndPrint() {

		int n = 7;
		
		for(int i = 0; i < n; i++) {
			if(i%2 == 0) {
				for(int j = 0; j < n; j++)
					System.out.print("# ");
			}
			else {
				System.out.print(" ");
				for(int j = 0; j < n; j++)
					System.out.print("# ");
			}
			
			System.out.println("");
			
		}

	}
}
