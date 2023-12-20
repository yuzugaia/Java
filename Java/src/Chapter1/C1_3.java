package Chapter1;

// 1.3.5 定数の利用

public class C1_3 {
	public static void main (String[] args) {
		int age = 20;	//変数を20で初期化
		System.out.println( "私の年齢は" + age);
		age = 31;	//再度代入
		System.out.println( "･･･いや、本当の年齢は" + age);		//変数の上書き
	}
}