package exercise5;

public class Test4 {
	void method(int... a) {
		System.out.println("可長引数が優先");
	}
	
	void method(int i) {
		System.out.println("引数が優先");
	}

}
