package curriculum_1＿33;

public class Vehicle {
	
	private String owner;   // ← privateなインスタンスフィールド（外部から直接アクセスできない）
	
	
	
	//ownerフィールドのゲッター
	public  String getOwner() {
		return owner;
	}
	
	// ownerフィールドのセッター
	public void setOwner(String owner) {
		this.owner = owner;
		
	}
}
