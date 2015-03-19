package challenge;

public class SquareBoardDemo {

	public static void main(String[] args) {
		
		SquareBoardDraw sbd = new SquareBoardDraw();
		SquareBoardChecker sbc = new SquareBoardChecker();
		
		sbd.computeAndPrint();
		System.out.println();
		sbc.computeAndPrint();
		
	}

}
