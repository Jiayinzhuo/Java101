package q14;

public class Mystery {
	public void mystery(int x) {
		System.out.print(x % 10);
		if ((x / 10) != 0) {
			mystery(x / 10);
		}
		System.out.print(x % 10);
	}

	public static void main(String[] args) {
		Mystery m = new Mystery();
		m.mystery(1234);
	}

}
