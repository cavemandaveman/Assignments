package challenge;

public class SumAvg implements ISumAvg{

	@Override
	public double getSum() {
		double sum = 0;
		for(double i = MIN; i <= MAX; i++) {
			sum += i;
		}
		return sum;
	}

	@Override
	public double getAvg() {
		return getSum() / (MAX - MIN + 1.0);
	}

	@Override
	public void printResult() {
		System.out.println("The sum is: " + getSum());
		System.out.println("The average is: " + getAvg());
	}
	
	public void oddSumAvg() {
		double odds = 0;
		int counter = 0;
		for(double i = MIN; i < MAX; i++) {
			if(i%2 != 0) {
				odds += i;
				counter++;
			}
		}
		System.out.println("\nThe sum of the odds is: " + odds);
		System.out.println("The average of the odds is: " + odds/counter);
	}
	
	public void evenSumAvg() {
		double evens = 0;
		int counter = 0;
		for(double i = MIN; i < MAX; i++) {
			if(i%2 == 0) {
				evens += i;
				counter++;
			}
		}
		System.out.println("\nThe sum of the evens is: " + evens);
		System.out.println("The average of the evens is: " + evens/counter);
	}

}
