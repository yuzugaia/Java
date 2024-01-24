package Chapter4;

//4.2.2 配列の利用方法 4-5配列の要素に値を代入

public class C4_5{
	public static void main(String[] args) {
		int[] scores;
		scores = new int[5];
		scores[1] = 30;
		System.out.println(scores[1]);
	}
}