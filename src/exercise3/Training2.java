package exercise3;

public class Training2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 2;
		
		System.out.println(x > 2 && x < 15 );
		System.out.println(y >= 10 || y == 2);
		
		int num1 = 10, num2 = 10, num3 =10, num4 = 10;
		
		boolean result = num1++ > 10 & ++num2 > 10;
		System.out.println(result+":"+num1+":"+num2);
		
		boolean result2 = num3++ >10 && ++num4 > 10;
		System.out.println(result2+":"+num3+":"+num4);
		
		int a = 10;
		int b = 2;
		
		System.out.println(x += 100);
		System.out.println(y *= 20);	
		
		int c = 10;
		int d;
		
		d = c++;
		
		System.out.println(c);
		System.out.println(c++);
		System.out.println(d);
		System.out.println(c);
		
		int e = 10;
		int f;
		
		f = ++e;
		
		System.out.println(e);
		System.out.println(++e);
		System.out.println(f);
		System.out.println(e);
		
		
	}

}
