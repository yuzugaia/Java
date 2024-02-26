package Chapter5;
//5.3.2戻り値を受け取る 5-7戻り値の例
public class C5_7{
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	public static void main(String[] args) {
		int ans = add(100, 10);		//addメソッドの呼び出し
		System.out.println("100 + 10 = " + ans);
	}
}