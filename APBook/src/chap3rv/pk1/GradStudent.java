package chap3rv.pk1;

public class GradStudent extends Student {
	private int gradID;

	// default constructor
	public GradStudent() {
		super();
		gradID = 0;
	}

	// constructor
	public GradStudent(String studName, int[] studTests, String studGrade, int gradStudID) {
		super(studName, studTests, studGrade);
		gradID = gradStudID;
	}

	public int getID() {
		return gradID;
	}

	public void computeGrade() {
		// invokes computeGrade in Student superclass
		super.computeGrade();
		if (getTestAverage() >= 90)
			setGrade("Pass with distinction");

		System.out.println("In GradStudent computeGrade(): grade= " + getGrade());
	}
}
