package Chapter5;
//5.1.3メソッドの呼び出し 5-2メソッドの呼び出し
public class C5_2{
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello();	//helloメソッドの呼び出し
		System.out.println("メソッドを呼び出しが終わりました");
	}
	public static void hello() {	//helloメソッド本体
		System.out.println("湊さん、こんにちは");
	}
}