/*

 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください

  	動物名：ライオン
	体長：2.1m
	速度：80km/h

 */

package lesson1_23;

public class C23 {
	private String name;
	private double bodyLength;
	private double speed;

	public C23() {}

	public C23(String name,double bodyLength,double speed)
	{this.name = name;
	this.bodyLength = bodyLength;
	this.speed = speed;
	}

	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public double getBodyLength() {
		return bodyLength;
	}
	public void setBodyLength(double bodyLength) {
		this.bodyLength = bodyLength;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}	
}

