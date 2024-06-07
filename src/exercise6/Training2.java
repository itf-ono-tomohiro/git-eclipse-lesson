package exercise6;

public class Training2 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		int i = 10;
		int[] array = {10};
		
		System.out.println("メソッドに渡す前の変数" + i);
		System.out.println("メソッドに渡す前の変数" + array[0]);
		
		
		System.out.println(t.methodA(i));
		System.out.println(t.methodB(array));
		
		System.out.println("メソッド実行後の変数" + i);
		System.out.println("メソッド実行後の変数" + array[0]); //渡した値も更新
		

	}

}
