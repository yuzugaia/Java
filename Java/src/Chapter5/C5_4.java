package Chapter5;
//5.2.2　1つの引数を渡す例 5-4引数の例
 public class C5_4{
	 public static void main(String[] args) {
		 System.out.println("メソッドを呼び出します");
		 hello("湊");
		 hello("朝香");
		 hello("菅原");
		 System.out.println("メソッドの呼び出しが終わりました");
	 }
	 public static void hello(String name) {
		 System.out.println(name + "さん、こんにちは");
	 }
 }