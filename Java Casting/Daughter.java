package casting;

public class Daughter extends Parent {
	String name;
	
	Daughter() {}

	Daughter(int age, String name) {
		super(age);
		this.name =name;
	}

	@Override
	void printInfo() {
		System.out.println("Daughter Call !!");
	}

	void sing() {
		System.out.println("La La La");
	}
}
