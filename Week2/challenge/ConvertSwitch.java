package challenge;

public class ConvertSwitch implements IConvertAndPrint {

	@Override
	public Word convertNum(int num) {
		
		switch(num) {
		case 1:
			return Word.ONE;
			//break;
		case 2:
			return Word.TWO;
			//break;
		case 3:
			return Word.THREE;
			//break;
		case 4:
			return Word.FOUR;
			//break;
		case 5:
			return Word.FIVE;
			//break;
		case 6:
			return Word.SIX;
			//break;
		case 7:
			return Word.SEVEN;
			//break;
		case 8:
			return Word.EIGHT;
			//break;
		case 9:
			return Word.NINE;
			//break;
		default:
			return Word.OTHER;
		}
	}

	@Override
	public void printNum() {
	}

}
