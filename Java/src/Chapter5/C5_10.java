package Chapter5;
//5.4.1類似する複数のメソッドを定義する 5-10オーバーロード(引数の型が異なる場合)
public class C5_10{
	//1つ目のaddメソッド
	public static int add(int x, int y) {
		return x + y;
	}
	//2つ目のaddメソッド
	public static double add(double x, double y) {
		return x +  y;
	}
	//3つ目のaddメソッド
	public static String add(String x, String y) {
		return x + y;
	}
	public static void main(String[] args) {
		System.out.println(add(10, 20));
		System.out.println(add(3.5, 2.7));
		System.out.println(add("Hello", "World"));
	}
}