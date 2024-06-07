package exercise4;

public class Training3 {

	public static void main(String[] args) {
		int i = 10;
		final int f_i =5; //定数表示
		final String[] f_s = {"a"}; //定数の配列
		
		switch(i) {
			case 1:
				System.out.println("iは、0です。");
				break;
			case f_i:
				System.out.println("iは、5です");
				break;
			case i: //コンパイルエラー
				System.out.println("iは、10です。");
				break;
			case f_s[0]: //コンパイルエラー
				Sysetm.out.println("iは、10です。");
				break;
			default:
				Sysetm.out.println("iは、0、5、10ではありません。");
				
		}
	}

}
