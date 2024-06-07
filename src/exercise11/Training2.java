package exercise11;

public class Training2 {

	public static void main(String[] args) {
		try {
			Test obj = new Test();
			obj.loop();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("エラー：配列のindexを超えたものをしています。");
			
		}
		System.out.println("終了");

	}

}
