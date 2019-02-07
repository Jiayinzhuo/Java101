package chap3rv.pk1;

public class StudentTest {

	public static void computeAllGrades(Student[] studentList) {
		for (Student s : studentList) {
			if (s != null)
				s.computeGrade();
		}
	}

	public static void main(String[] args) {
		Student[] stu = new Student[5];
		
		//dynamic binding
		stu[0] = new Student("Brian Lorenzen", new int[] { 90, 94, 99 }, "none");
		stu[1] = new UnderGrad("Tim Broder", new int[] { 90, 90, 100 }, "none");
		stu[2] = new GradStudent("Kevin Cristella", new int[] { 100, 95, 90 }, "none", 1234);
		computeAllGrades(stu);
	}

}
