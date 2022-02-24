package This;

public class Testor {
	public static void main(String[] args) {
		Class cls = new Class();
		cls.method();
	}
}

class Class {
	int var = 10;
	void method() {
		int var = 20;
		System.out.printf("var in method : %d\n",var);
		System.out.printf("this.var in method : %d\n",this.var);
	}
}