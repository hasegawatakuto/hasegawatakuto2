/*

 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
	 	 メソッドのオーバーライドを使用してください
		 superクラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

 */

package lesson1_25;
import java.util.Scanner;

import lesson1_25_2.Sub;
//このパッケージで最終的処理をする。
public class L25main {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		//scaner文を使い名前を入力することで各パラメーターを表示させる。
		System.out.println(new Sub(scanner.nextLine())); 
	}
}