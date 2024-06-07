package exercise7;

public class SubB extends SuperB{
	//オーバーライド
	public void methodA() {
		num += 500;
	}
	public void methodB () {
		methodA();
		print(); //親のメソッド実行
		super.methodA(); //親のメソッドを実行
		methodA();
		print();
	}
}
