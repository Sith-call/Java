package Super;

public class Testor {
	public static void main(String[] args) {
		GrandParent gp = new GrandParent();
		Parent p = new Parent();
		Child c = new Child();
		
		gp.method();
		System.out.println();
		
		p.method();
		System.out.println();
		
		c.method();
		System.out.println();
	}
}

class GrandParent {
	int attribute = 10;
	void method() {
		System.out.println("Grand Parent Method");
	}
}

class Parent extends GrandParent {
	int attribute = 20;
	void method() {
		super.method();
		System.out.println("Parent !");
	}
}

class Child extends Parent {
	int attribute = 30;
	void method() {
		super.method();
		System.out.println("Grand Parent !");
	}
}