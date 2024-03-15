package Chapter5;
//5.5.3戻り値に配列を用いる 5-14戻り値が配列野場合

public class C5_14{
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}
	public static void main(String[] args) {
		int[] array = makeArray(3);
		for (int i : array) {
			System.out.println(i);
		}
	}
}