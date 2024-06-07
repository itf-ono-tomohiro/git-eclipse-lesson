package exercise8;

public class Training2 {

	public static void main(String[] args) {
		Test t = new Test();
		
		System.out.println("methodA:" + t.methodA(1));
		System.out.println("methodC:" + t.methodC(1,2));
		
		t.methodB();
		Inter2.methodD();

	}

}
