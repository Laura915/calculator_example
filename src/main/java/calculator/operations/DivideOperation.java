package calculator.operations;

final public class DivideOperation {

	int a = 0;
	int b = 0;
	
	public void setA(int input) {
		this.a = input;
	}
	
	public void setB(int input) {
		this.b = input;
	}
	
	public int getResult() {
		if(a==0 ||b==0) {
			return 0;
		}
		return this.a /= this.b;
	}
	
}
