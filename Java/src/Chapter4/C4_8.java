package Chapter4;

//4.3.1範囲外要素の利用による例外の発生 4-8配列を用いた点数管理プログラム(エラー)

public class C4_8{
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		int sum = scores[1] + scores[2]
				+ scores[3] + scores[4] + scores[5];
		int avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点: + avg");
	}
}