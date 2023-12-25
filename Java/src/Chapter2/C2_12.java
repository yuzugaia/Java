package Chapter2;

// 2.6.3 大きいほうの数値を代入する命令

public class C2_12 {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int m = Math.max(a, b);		//2つの引数を指定して呼び出す命令
		System.out.println("比較実験：" + 
			a + "と" + b + "とで大きいほうは･･･" + m);
	}
}