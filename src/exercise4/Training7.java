package exercise4;

public class Training7 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i <= 9; i++) {
			System.out.println(arr[i]);
		}
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for (int i = 0; i <= 9; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		char[] c_array = {'a','b','c'};
		
		for(char c: c_array) {
			System.out.println(c);
		}
		double[] c2_array = {1.,2.,3.,};
		
		for(var c2 : c2_array) {
			System.out.println(c2);
		}
	}

}
