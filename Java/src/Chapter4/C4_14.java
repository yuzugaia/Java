package Chapter4;

//4.4.5拡張for文 4-14拡張for文

public class C4_14{
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		for (int value : scores) {
			System.out.println(value);
		}
	}
}
//ループ変数や配列の添え字の記述が不要となる