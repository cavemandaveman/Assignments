package basic;

public class TimeTable {

	public static void main(String[] args) {

		int[][] table = new int[9][9];
		
		System.out.println("*| 1 2 3 4 5 6 7 8 9");
		System.out.println("----------------------------");
		
		for(int i = 0; i < table.length; i++){
			System.out.print((i+1) + "|");
			for(int j = 0; j < table.length; j++){
				System.out.print(" ");
				System.out.print(table[i][j] = (j+1)*(i+1));
			}
			System.out.println("");
		}
		
	}

}
