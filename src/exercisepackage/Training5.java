package exercisepackage;

public class Training5 {

	public static void main(String[] args) {
		String a ="aaa";
		String b ="aaa";
		String e = a.intern(); //String.intern():同じ領域の文字列を返す
		String c = new String("aaa");
		String d = new String("aaa");
		
		System.out.println(a == b);
		System.out.println(a == e);
		System.out.println(b == e);
		System.out.println(a == c);
		System.out.println(c == d);
	}

}
