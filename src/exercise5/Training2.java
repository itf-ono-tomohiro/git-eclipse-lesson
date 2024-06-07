package exercise5;

public class Training2 {
	public static void main(String[] args) {
		Bmi human1 = new Bmi("tanaka"); //コンストラクタ実行
		System.out.println(human1.name);
		System.out.println(human1.calcBmi(166,64));//通常メソッドの呼び出し
		
		Bmi human2 = new Bmi("ohtani"); //インスタンス化
		System.out.println(human2.name);
		System.out.println(human1.calcBmi(190,100));
		
	}
}
