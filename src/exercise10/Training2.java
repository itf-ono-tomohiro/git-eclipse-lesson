package exercise10;

import java.util.ArrayList;

public class Training2 {
	public static void main(String[] args){
		//Listの宣言・初期化
		ArrayList<Integer> list = new ArrayList<>();
		Integer i1 = 1;
		Integer i2 = 2;
		Integer i3 = i1;
		
		list.add(i1); //要素の追加
		list.add(i2); //intをBoxing
		list.add(i3); //重複要素
		list.add(3,4); //index3に４を追加
		
		System.out.println("list_size:"+ list.size());
		
		for(int i = 0; i < list.size();i++ ) {
			System.out.println(list.get(i));
		}
		System.out.println();
		for(Integer i : list) {
			System.out.println(i);
		}
	}

}
