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