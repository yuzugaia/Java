package Chapter5;
//5.1.4mainメソッド以外からのメソッドの呼び出し 5-3mainメソッド以外からメソッドを呼び出す
public class C5_3{
	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}
	public static void methodB() {
		System.out.println("methodB");
	}
	public static void main(String[] args) {
		methodA();
	}
}