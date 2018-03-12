package chapter11_Programming2;

class Customer extends Person {
	private int CID;
	private int point;
	
	public Customer(String name, String phone, int CID, int point) {
		super(name, phone);
		this.CID = CID;
		this.point = point;
	}
	
	public Customer(String name, String address, String phone, int CID, int point) {
		super(name, address, phone);
		this.CID = CID;
		this.point = point;
	}
	
	public int getCID() { return CID; }
	public int getPoint() { return point; }
	public void setCID(int CID) { this.CID = CID; }
	public void setPoint(int point) { this.point = point; }
	
	public String toString() {
		return super.toString() + ", " + CID + ", " + point;
	}
}
