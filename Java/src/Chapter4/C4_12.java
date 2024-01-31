package Chapter4;

//4.4.4パターン3添え字に対応した情報の利用 4-12 DNAの記号をランダムに表示する

public class C4_12{
	public static void main(String[] args) {
		int[] seq = new int[10];
		
		//塩基配列をランダムに作成
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
		//生成した塩基配列の記号を表示
		
		for (int i = 0; i < seq.length; i++) {
			switch (seq[i]) {
				case 0:
					System.out.print("A ");
					break;
				
				case 1:
					System.out.print("T ");
					break;
				
				case 2:
					System.out.print("G ");
					break;
					
				case 3:
					System.out.print("C ");
					break;
			}
		}
	}
}