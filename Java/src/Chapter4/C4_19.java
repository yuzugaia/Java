package Chapter4;
//多次元配列とは？ 4-19親配列と子配列の要素数を表示

public class C4_19{
	public static void main(String[] args) {
		int[][] scores = {{40, 50, 60}, {80, 60, 70}};
		System.out.println(scores.length);
		System.out.println(scores[0].length);
	}
}
