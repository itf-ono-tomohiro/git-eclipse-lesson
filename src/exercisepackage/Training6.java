package exercisepackage;

public class Training6 {
	public static void main(String[]  args) {
		String a = "aaa";
		String b = a + "AA";
		
		String c = "aaa";
		String d = c.concat("AA");
		
		StringBuilder e = new StringBuilder("aaa");
		StringBuilder f = e.append("BB");
		
		int i = 10;
		double g = 20.0;
		
		g = i; //int → double
		i = (int)g; // double→int
				
		System.out.println(a == b);
		System.out.println(c == d);
		System.out.println(e == f);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(i);
		
		foo((short)i);
		
	}
	static void foo(short s) {
		System.out.println(s);
	}

}
