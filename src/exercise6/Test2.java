package exercise6;

public class Test2 {
	//基本データ型の受けとり
	int methodA(int i) {
		i += 20;
		return i;
	}
	
	//参照型の受け取り
	int methodB(int[] array) {
		array[0] += 20;
		return array[0];
	}

}
