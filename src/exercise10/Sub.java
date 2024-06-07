package exercise10;

public class Sub extends Super {
	 static String x = "サブstatic変数";
	 String y = "サブインスタンス変数";
	 static void methodA(){ System.out.println("サブstaticメソッド"); }
	 void methodB(){ System.out.println("サブインスタンスメソッド"); }
}
