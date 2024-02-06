package Chapter4;

//4.6.1null 4-16nullの利用(エラー)

public class C4_17{
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		array = null;
		array[0] = 10;
	}
}