package Chapter4;

//4.5.1配列を理解する 4-15実行結果は？

public class C4_15{
	public static void main(String[] args) {
		int[] arrayA = {1, 2, 3};
		int[] arrayB;
		arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);
	}
}