package exercise4;

public class Training2 {

	public static void main(String[] args) {
		int i = 10;
		
		switch(i){
			case 0:
				System.out.println("iは、0です。");
				break;
			case 5:
				System.out.println("iは、5です。");
				break;
			case 10:
				System.out.println("iは、10です。");
				break;
			default:
				System.out.println("iは、0、5、10ではありません。");
		}
		
		int[] j_array = {1,2,3};
		for( int j : j_array) {
			switch(j) {
			case 1:
				System.out.println("1");
				
			case 2:
				System.out.println("2");
				break;
				
			default:
				System.out.println("Other");
			}
			
		}

	}

}
