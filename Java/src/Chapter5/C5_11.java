package Chapter5;
//5.4.1類似する複数のメソッドを定義する 5-11オーバーロード(引数の型が異なる場合)
public class C5_11{
	public static int add(int x, int y) {
		return x + y;
	}
	public static int add(int x, int y, int z) {
		return x + y +z;
	}
	public static void main(String[] args) {
		System.out.println("10+20=" + add(10, 20));		//1つ目のaddメソッドが呼び出される
		System.out.println("10+20+30=" + add(10, 20, 30));	//2つ目のaddメソッドが呼び出される
	}
}