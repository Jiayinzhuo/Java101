package qfr3;

public class LoadDog extends Dog {

	public LoadDog(String name) {
		super(name);
	}

	@Override
	public String speak() {
		return super.speak() + super.speak();
	}

}
