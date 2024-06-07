package exercise5;

public class Test6 {
	String instanceVal = "instance変数";
	static String staticVal = "static変数";
	
	void instanceMethod() {
		System.out.println(instanceVal);
	}
	
	static void staticMethod() {
		System.out.println(staticVal);
	}
	void instanceMethodB() {
		System.out.println(staticVal);
	}
	
}
