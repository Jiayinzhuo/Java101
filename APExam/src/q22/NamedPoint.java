package q22;

public class NamedPoint extends Point {
	private String name;

	public NamedPoint() {
		name = "";
	}

	public NamedPoint(int d1, int d2, String pointName) {
		super(d1, d2);
		name = pointName;
	}

//	public NamedPoint(int d1, int d2, String pointName, String dummy) {
//		super.setX(d1);
//		super.setY(d2);
//		name = pointName;
//	}

	// public String getName() {
	// return name;
	// }
	//
	// public void setName(String name) {
	// this.name = name;
	// }
}
