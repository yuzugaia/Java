package Chapter5;
//5.5.2値渡しと参照渡し 5-13同じ配列を参照していることを確認する

public class C5_13{
	//int型配列を受け取り、配列内の要素全てに1を加える
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		incArray(array);
		for (int i : array) {
			System.out.println(i);
		}
	}
}