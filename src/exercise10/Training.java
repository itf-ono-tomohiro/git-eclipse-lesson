package exercise10;

public class Training {

	public static void main(String[] args) {
		Super obj = new Sub(); //自動型変換
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.methodA();
        obj.methodB();

	}

}
