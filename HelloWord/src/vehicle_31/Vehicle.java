package vehicle_31;

public class Vehicle {
	// カプセル化でprivateにownerを定義
	private String owner;
	// ゲッターセッター定義
	public String getOwner(){
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
}
