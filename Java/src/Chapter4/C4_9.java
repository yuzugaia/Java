package Chapter4;

//4.4.1配列とfor文 4-9for文を使って配列を扱う

public class C4_9{
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);		//ループの度にiの値が0~4で変化する
		}
	}
}