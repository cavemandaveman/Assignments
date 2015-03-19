package basic;

public class PrintNumberInWord {

	public static void main(String[] args) {
		
		//(nested-if, switch-case): Write a program which prints "ONE, TWO, etc" if the int number is 1, 2, etc.
		
		//Challenge:
		//Use interface which has 2 methods; one to convert the number, other to just print it
		//Need 2 classes; one achieving the result using an if statement, one using switch statement
		//Use an ENUM
		//Use a stand alone application class that can run the above scenarios. This class should not have any implementations
		
		
		int number = 1;
		
		switch (number){
		case 1:
			System.out.println("ONE");				
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("OTHER");
		}
		
	}

}
