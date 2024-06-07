package exercisepackage;

public class Training4 {
	public static void main(String[] args) {
		int[] a = {10}; int[] b = {10};
		int [] c = {10}; int[] d = c;
		
		System.out.println(a == b );
		System.out.println(c == d);
	}

}
