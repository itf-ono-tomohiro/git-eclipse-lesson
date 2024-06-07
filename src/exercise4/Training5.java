package exercise4;

public class Training5 {
	public static void main(String[] args) {
		int i = 10;
		while(i < 15) {
			System.out.println(i);
			i++; //これがないと無限ループ
		}
		
		int j = 15;
		
		while(j != 15 && j ==14) {
			System.out.println(j);
		}
		
		do{
			System.out.println(j);
			j--;
		}while(j != 15 && j==14);
		
		for(int k = 0; k <= 10; k++) {
			System.out.println(k);
		}
	}

}
