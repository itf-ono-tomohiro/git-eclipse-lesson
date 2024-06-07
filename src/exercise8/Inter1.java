package exercise8;
//インターフェース１
interface Inter1 {
	double methodA(int i);
	default void methodB() {
		System.out.println("methodB");
	}

}
