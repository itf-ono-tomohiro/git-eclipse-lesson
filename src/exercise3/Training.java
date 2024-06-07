package exercise3;

public class Training {
	public static void main(String[] args) {
		int x = 10;
		int y = 2;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);//剰余（割り算の余り）
		System.out.println(-(x+y));
		
		int x2 = 10;
		int y2 = 2;
		double z = 2.0;
		
		System.out.println(x/y);
		System.out.println(x/z);
		System.out.println(x%y);
		
		String text = "Text";
		int num1 = 2;
		double num2 = 2.0;
		boolean t = true;
		String n = null;
		
		System.out.println(text + num1);
		System.out.println(num1 + text);
		System.out.println((num1 + 5) + text);
		System.out.println(num2 + text);
		System.out.println(t + text);
		System.out.println(n + text);
		
		int a = 10;
		int b = 2;
		int c = 10;
		
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a == b);
		System.out.println(a != b); //aとbは異なるか(not イコール)
	}

}
