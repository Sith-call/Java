package expert;

public class Driver {
	public static void main(String[] args) {
		Class cls = new Class(200);
		cls.method();
		System.out.println(cls);
	}
}

class Class {
	int attribute;
	
	Class(int variable) {
		attribute = variable;
	}
	
	void method() {
		System.out.println(attribute);
		System.out.println(this);
	}
}

// Class in JVM
/**

class Class {
	int attribute;
	
	Class(Class this, int variable) {
		this.attribute = variable;
	}
	
	void method(Class this) {
		System.out.println(this.attribute);
	}
	
}

**/