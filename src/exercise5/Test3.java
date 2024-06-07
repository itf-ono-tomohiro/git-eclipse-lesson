package exercise5;

public class Test3 {
	void method(String s,int... a) {
		System.out.println(s + "size" + a.length);
		for(int i : a) {
			System.out.println("第二引数の値" + i);
		}
	}

}
