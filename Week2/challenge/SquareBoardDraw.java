package challenge;

public class SquareBoardDraw implements ISquareBoard {

	@Override
	public void computeAndPrint() {

		int n = 7;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++)
				System.out.print("# ");
			System.out.println("");
		}
		
	}

}
