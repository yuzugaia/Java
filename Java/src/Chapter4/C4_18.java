package Chapter4;
//4.7.1多次元配列とは 4-18 2次元配列の利用

public class C4_18{
	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 60;
		scores[1][0] = 80;
		scores[1][1] = 60;
		scores[1][2] = 70;
		System.out.println(scores[1][2]);
	}
}