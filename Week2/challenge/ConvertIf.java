package challenge;

public class ConvertIf implements IConvertAndPrint {
	
	@Override
	public Word convertNum(int num) {
		if(num == 1)
			return Word.ONE;
		else if(num == 2)
			return Word.TWO;
		else if(num == 3)
			return Word.THREE;
		else if(num == 4)
			return Word.FOUR;
		else if(num == 5)
			return Word.FIVE;
		else if(num == 6)
			return Word.SIX;
		else if(num == 7)
			return Word.SEVEN;
		else if(num == 8)
			return Word.EIGHT;
		else if(num == 9)
			return Word.NINE;
		else
			return Word.OTHER;
	}

	@Override
	public void printNum() {
	}
	

}
