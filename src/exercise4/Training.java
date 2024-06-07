package exercise4;

public class Training {

	public static void main(String[] args) {
		int age = 18;
		
		if (age == 20) {
			System.out.println("二十歳です。");
			
		} else if(age >= 18) {
			System.out.println("二十歳までもう少しです。");
		}else {
			System.out.println("二十歳ではありません。");
		}
		
		int i =20;
		String s ="iの値は";
		s += i > 10 ? "10以上" : "10未満";
		
		System.out.println(s);
	}

}
