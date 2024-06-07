package exercise5;

public class Training6 {
    
    public static void main(String[] args){
        //インスタンスメンバ
        Test6 t = new Test6();
        System.out.println(t.instanceVal);
        t.instanceMethod();
        t.instanceMethodB();
        

     
        
        //staticメンバへのアクセス
        System.out.println(Test6.staticVal);
        Test6.staticMethod();
        
        
        //staticメンバ場合、以下でも問題ない
        //System.out.println(t.staticVal);
        //t.staticMethod();
    }
}