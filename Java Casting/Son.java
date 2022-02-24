package casting;

public class Son extends Parent{
	String name;
	
	Son() {}

	Son(int age, String name) {
		super(age);
		this.name =name;
	}

	@Override
	void printInfo() {
		System.out.println("Son Call !!");
	}
}
