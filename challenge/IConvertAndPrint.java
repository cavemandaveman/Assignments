package challenge;

public interface IConvertAndPrint {
	
	Word convertNum(int num);
	
	void printNum();

}

enum Word {
	ONE(1) {
		public String str() {
            return "ONE";
		}
	},
	TWO(2) {
		public String str() {
            return "TWO";
		}
	},
	THREE(3) {
		public String str() {
            return "THREE";
		}
	},
	FOUR(4) {
		public String str() {
            return "FOUR";
		}
	},
	FIVE(5) {
		public String str() {
            return "FIVE";
		}
	},
	SIX(6) {
		public String str() {
            return "SIX";
		}
	},
	SEVEN(7) {
		public String str() {
            return "SEVEN";
		}
	},
	EIGHT(8) {
		public String str() {
            return "EIGHT";
		}
	},
	NINE(9) {
		public String str() {
            return "NINE";
		}
	},
	OTHER(-1) {
		public String str() {
            return "OTHER";
		}
	};
	
	public abstract String str();
	
	private int value;
	
	private Word(int value) {
		this.value = value;
	    }
	    public int getValue() {
	    	return value;
	    }
}
