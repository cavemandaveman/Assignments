package basic;

public class SumAndAverage {

	public static void main(String[] args) {
		
		double min = 1;
		double max = 100;
		double sum = 0;
		double avg = 0;
		
		for(double i = min; i <= max; i++) {
			sum += i;
		}
		
		avg = sum / (max - min + 1.0);
		
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + avg);
		
	}

}
