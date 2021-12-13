package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a-b;
	}

	public int mul(int a, int b) {
		return a*b;
	}

	public int div(int a, int b) {
		if (a/b != 0){
			return a/b;
		}
		else{
			return -1;
		}
	}
}
