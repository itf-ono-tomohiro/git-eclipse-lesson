package exercisepackage;

public class Training2 {

	public static void main(String[] args) {
		char var = 'a';
		String var2 ="Hello World";
		String s = "abcdef";
		StringBuilder sb = new StringBuilder("abcdef");
		
		System.out.println(var);
		System.out.println(var2);
		System.out.println(s.charAt(0));
		System.out.println(s.equals("abcde"));
		System.out.println(s.intern());
		System.out.println(s.indexOf('a'));
		System.out.println(s.length());
		System.out.println(s.replace('c', 'p'));
		System.out.println(s.substring(3));
		System.out.println(sb.append("zzz"));
		System.out.println(sb.insert(2, "zzz"));
		System.out.println(sb.delete(0, 5));
		System.out.println(sb.replace(0,5 , "zzz"));
		System.out.println(sb.substring(4));
		System.out.println(sb.length());
		
	}

}
