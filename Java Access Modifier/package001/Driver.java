package package001;

public class Driver {
	public String public_attribute_package001_Driver = "public Attribute - package001.Driver";
	private String private_attribute_package001_Driver = "private Attribute - package001.Driver";
	String default_attribute_package001_Driver = "default Attribute - package001.Driver";
	protected String protected_attribute_package001_Driver = "protected Attribute - package001.Driver";
	
	public void public_method_package001_Driver() {
		System.out.println("public Method - package001.Driver");
	}
	private void private_method_package001_Driver() {
		System.out.println("private Method - package001.Driver");
	}
	void default_method_package001_Driver() {
		System.out.println("default Method - package001.Driver");
	}
	protected void protected_method_package001_Driver() {
		System.out.println("protected Method - package001.Driver");
	}
	
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("<-------   package001.Driver.main Method Execute              ------->");
		System.out.println();
		
		Driver driver = new Driver();
		System.out.println("********   Accessing Attribute & Method of package001.Driver  ********");
		System.out.println(driver.public_attribute_package001_Driver);
		System.out.println(driver.private_attribute_package001_Driver);
		System.out.println(driver.default_attribute_package001_Driver);
		System.out.println(driver.protected_attribute_package001_Driver);
		driver.public_method_package001_Driver();
		driver.private_method_package001_Driver();
		driver.default_method_package001_Driver();
		driver.protected_method_package001_Driver();
		System.out.println("**********************************************************************");
		System.out.println();
		
		PublicClass public_class = new PublicClass();
		System.out.println("********   Accessing Attribute & Method of package001.PublicClass  ********");
		System.out.println(public_class.public_attribute_package001_PublicClass);
		// System.out.println(public_class.private_attribute_package001_PublicClass);
		System.out.println(public_class.default_attribute_package001_PublicClass);
		System.out.println(public_class.protected_attribute_package001_PublicClass);
		public_class.public_method_package001_PublicClass();
		// public_class.private_method_package001_PublicClass();
		public_class.default_method_package001_PublicClass();
		public_class.protected_method_package001_PublicClass();
		System.out.println("**********************************************************************");
		System.out.println("Accessing package001.PublicClass private attribute and method at package001.Driver makes compilation error.");
		System.out.println("So access package001.PublicClass.accessPrivate(public method)");
		public_class.accessPrivate();
		System.out.println("**********************************************************************");
		System.out.println();
		
		DefaultClass default_class = new DefaultClass();
		System.out.println("********   Accessing Attribute & Method of package001.DefaultClass  ********");
		System.out.println(default_class.public_attribute_package001_DefaultClass);
		// System.out.println(default_class.private_attribute_package001_DefaultClass);
		System.out.println(default_class.default_attribute_package001_DefaultClass);
		System.out.println(default_class.protected_attribute_package001_DefaultClass);
		default_class.public_method_package001_DefaultClass();
		// default_class.private_method_package001_DefaultClass();
		default_class.default_method_package001_DefaultClass();
		default_class.protected_method_package001_DefaultClass();
		System.out.println("**********************************************************************");
		System.out.println("Accessing package001.DefaultClass private attribute and method at package001.Driver makes compilation error.");
		System.out.println("So access package001.DefaultClass.accessPrivate(public method)");
		default_class.accessPrivate();
		System.out.println("**********************************************************************");
		System.out.println();
		
		package002.PublicClass public_class_002 = new package002.PublicClass();
		System.out.println("********   Accessing Attribute & Method of package002.PublicClass  ********");
		System.out.println(public_class_002.public_attribute_package002_PublicClass);
		// System.out.println(public_class_002.private_attribute_package002_PublicClass);
		// System.out.println(public_class_002.default_attribute_package002_PublicClass);
		// System.out.println(public_class_002.protected_attribute_package002_PublicClass);
		public_class_002.public_method_package002_PublicClass();
		// public_class_002.private_method_package002_PublicClass();
		// public_class_002.default_method_package002_PublicClass();
		// public_class_002.protected_method_package002_PublicClass();
		System.out.println("**********************************************************************");
		System.out.println("Accessing package002.PublicClass private, default and protected attribute and method at package001.Driver makes compilation error.");
		System.out.println("So access package002.PublicClass.accessPrivate(public method)");
		System.out.println("So access package002.PublicClass.accessDefaultProtected(public method)");
		public_class_002.accessPrivate();
		public_class_002.accessDefaultProtected();
		System.out.println("**********************************************************************");
		System.out.println();
		
		// package002.DefaultClass default_class_002 = new package002.DefaultClass();
		System.out.println("********   Accessing Attribute & Method of package002.DefaultClass  ********");
		System.out.println("Accessing package002.DefaultClass at package001.Driver makes compilation error.");
		System.out.println("So package001.Driver can not access package002.DefaultClass.");
		System.out.println("**********************************************************************");
		System.out.println();
		
		ChildClassExtendsDefaultClass ccedc = new ChildClassExtendsDefaultClass();
		ChildClassExtendsPublicClass ccedpc = new ChildClassExtendsPublicClass();
		ccedpc.accessParent();
		ccedc.accessParent();
		
	}
}
