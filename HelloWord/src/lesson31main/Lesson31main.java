/*
問題1：Vehicleクラスを作成し、String型のprivateなインスタンスフィールド「owner」を定義しましょう。

問題2：CarクラスとBicycleクラスを作成しましょう。

問題3：Vehicleクラスにownerフィールドのゲッター「getOwner」とセッター「setOwner」を定義しましょう。

問題4：MainクラスからsetOwnerを用いて、Carクラスのインスタンス「car」の所有者を「person1」に、Bicycleクラスのインスタンス「bicycle」の所有者を「person2」に設定します。Personクラスのインスタンスからフルネームを取得し、ownerにセットしてください。

問題5：セットできたら、ownerをコンソールに出力してください。

問題6：Personクラスにインスタンスメソッド「buy」を定義しましょう。（仮引数：car）

問題7：buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセットしましょう。
問題8：さらに、「〇〇が購入しました」と出力する処理を追加してください。

問題9：引数の型が異なるbuyメソッドを定義しましょう。（仮引数：bicycle）

問題10：Mainクラスからbuyメソッドを用いて、「person1」がcarを購入、「person2」がbicycleを購入するプログラムを作成しましょう。
*/


package lesson31main;

import bicycle_31.Bicycle;
import car_31.Car;
import person_30.Person;

public class Lesson31main {
	
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		  //person1.print();
		  Person person2 = new Person("山田花子", 22, 1.5, 40);
		  //person2.print();

		  //Person.printCount();
		 
		  Car car = new Car();
		  // インスタンスの生成
		  Bicycle bicycle = new Bicycle();
		  // Carのownerを鈴木太郎にセッティング
		  car.setOwner(person1.name);
          // bicycleのownerを山田花子にセッティング
		  bicycle.setOwner(person2.name);
          // Carとbicycleのownerの引数をコンソールに出力
		  System.out.println(car.getOwner());  System.out.println(bicycle.getOwner());
          // person1,person2のbuyメソッドにcarとbicycleを定義
		  person1.buy(car);

		  person2.buy(bicycle);
		}

	}


