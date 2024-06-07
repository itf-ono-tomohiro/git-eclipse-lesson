package exercise4;

public class Training8 {
	public static void main(String[] args) {
		for(int i =0; i <= 2; i++) {
			for(int j =0; j <= 2; j++) {
				System.out.println(i+"-"+j);
			}
		}
		
		loop1:
		for(int i = 0; i < 3; i++) {
			for(int j = 0;j <3 ; j++ ) {
				System.out.println(""+ i + j);
				if(i == 1 && j== 0) {
					System.out.println("外側のfor文を終了");
					break loop1;
				}
			}
		}	
		
	}

}
