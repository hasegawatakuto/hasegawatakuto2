/*
 * 問題1：インスタンスフィールドに「lastName」を追加しましょう
問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください
※順番はfirstNameの次
問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセットしてください
 */

package lesson33main;
import lesson33person.Person;
class Main{
	public static void main(String[] args){
		
		// インスタンス生成してperson1にPersonクラスの引数の入った物を代入する。
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		
		// Person1をPersonクラスで作ったprintメソッドを使いコンソールに出力する。
		person1.print();
		
		// Person1と同様にインスタンス生成してperson2にPersonクラスの引数の入った物を代入する。
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		
		// Person1をPersonクラスで作ったprintメソッドを使いコンソールに出力する。
		person2.print();
		
		// Personクラスで作ったprintCountメソッドを使いコンソールに出力する。
		Person.printCount();
	}
}
