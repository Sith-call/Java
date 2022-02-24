package initialization;

public class Testor {
	public static void main(String[] args) {
		Class instance_01 = new Class();
		Class instance_02 = new Class();
		Class instance_03 = new Class();
	}
}

class Class{
	static {
		System.out.println("The class has been loaded into the static memory area.");
	}
	{
		System.out.println("Instance of Class is created!");
	}
}
