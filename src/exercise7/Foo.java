package exercise7;

public class Foo {
	String str;
	int num;
	
	public Foo() {
		this("データなし");
	}
	
	public Foo(String s) {
		this(s,1);
	}
	public Foo(String s, int i) {
		this.str = s;
		this.num = i;
		System.out.println(this.str);
		System.out.println(this.num);		
		
	}

}
