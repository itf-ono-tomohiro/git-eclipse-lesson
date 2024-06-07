package exercise11;

public class Training {

	public static void main(String[] args) {
		int[] num = {10,20,30};
		
		for(int i = 0; i <5 ; i++) {
			try {
				System.out.println(num[i]);
				System.out.println((":"+ (i+ 1) + "回目のループ"));
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("エラー：配列のindexを超えたものをしています。");
				
			} finally{
				System.out.println("finallyの実行");
			}
			
		}
		System.out.println("終了");
	}

}
