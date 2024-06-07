package exercisepackage;

public class Training7 {

	public static void main(String[] args) {
		short s1 = 10;
		short s2 = 20;
		
		s1 = (short)(s1 + 1); //int型からshort型に変換
		s2 = ++s2;
			
		System.out.println(s1);
		System.out.println(s2);
		
		int i = 10;
		Integer i_class = 10;
		
		System.out.println(i ==i_class); //値自体の比較
		
		i_class =i; //Boxing
		int i2 = i_class; //Unboxing
		add(i2);
		double d = 1;//基本データ型同士の自動変換
		System.out.println(d);
		
	}
	
	static void add(Integer i_class) {
		int i = i_class + 10; //Integerとintの計算
		System.out.println(i);
	}

}
