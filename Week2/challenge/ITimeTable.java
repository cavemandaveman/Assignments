package challenge;

public interface ITimeTable {

	void compute();
	
}

enum Operator {
	
    ADDITION("+") {
        public int apply(int x1, int x2) {
            return x1 + x2;
        }
    },
    SUBTRACTION("-") {
        public int apply(int x1, int x2) {
            return x1 - x2;
        }
    },
    MULTIPLICATION("*") {
        public int apply(int x1, int x2) {
            return x1 * x2;
        }
    },
    DIVISION("/") {
        public int apply(int x1, int x2) {
            return x1 / x2;
        }
    };
    
    private final String text;

    private Operator(String text) {
        this.text = text;
    }

    public abstract int apply(int x1, int x2);

    public String toString() {
        return text;
    }
}

