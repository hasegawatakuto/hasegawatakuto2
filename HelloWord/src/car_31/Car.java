package car_31;

public class Car {
    // カプセル化でprivateでownerを定義
private String owner;
	// ゲッターセッターを定義
	public String getOwner(){
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
}
