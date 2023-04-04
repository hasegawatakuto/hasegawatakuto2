package lesson31main;

import bicycle_31.Bicycle;
import car_31.Car;
import person_30.Person;

public class Lesson31main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		  //person1.print();
		  Person person2 = new Person("山田花子", 22, 1.5, 40);
		  //person2.print();

		  //Person.printCount();
		 
		  Car car = new Car();
		  Bicycle bicycle = new Bicycle();
		 
		  car.setOwner(person1.name);

		  bicycle.setOwner(person2.name);

		  System.out.println(car.getOwner());  System.out.println(bicycle.getOwner());

		  person1.buy(car);

		  person2.buy(bicycle);
		}

	}


