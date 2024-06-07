package exercise2;

public class Training {

	public static void main(String[] args) {
		String[] arr; //配列変数の宣言
		arr = new String[3]; //配列のインスタンス化
		
		arr[0] = "a"; 
		arr[1]="lemon";
		arr[2]="banana";
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		String[] name = {"佐藤","鈴木","高橋"}; //配列の宣言と代入
		name[1] = "小野"; //要素の上書き
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
		int[] arr2 = new int[1];
		
		System.out.println(arr[0]);
 		
	}

}
