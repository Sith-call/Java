package package001;

public class ChildClassExtendsPublicClass extends package002.PublicClass {
	public void accessParent() {
		System.out.println("========   Child of package002.PublicClass Accessing his parent   ========");
		System.out.println("********   Accessing Attribute & Method of package002.PublicClass  ********");
		System.out.println(super.public_attribute_package002_PublicClass);
		// System.out.println(super.private_attribute_package002_PublicClass);
		// System.out.println(super.default_attribute_package002_PublicClass);
		System.out.println(super.protected_attribute_package002_PublicClass);
		super.public_method_package002_PublicClass();
		// super.private_method_package002_PublicClass();
		// super.default_method_package002_PublicClass();
		super.protected_method_package002_PublicClass();
		System.out.println("**********************************************************************");
		System.out.println("Accessing package002.PublicClass private and default attribute and method at package001.Driver makes compilation error.");
		System.out.println("So access package002.PublicClass.accessPrivate(public method)");
		System.out.println("So access package002.PublicClass.accessDefaultProtected(public method)");
		super.accessPrivate();
		super.accessDefaultProtected();
		System.out.println("**********************************************************************");
		System.out.println();
	}
}
