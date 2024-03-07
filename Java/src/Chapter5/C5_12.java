package Chapter5;
//5.5.1引数に配列を用いる 5-12引数に配列を受け取るメソッドの利用
public  class C5_12{
	// int型配列を受け取り、全ての要素を表示するメソッド
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		printArray(array);		//配列を渡す
	}
}