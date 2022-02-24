package package002;

class DefaultClass {
	public String public_attribute_package002_DefaultClass = "public Attribute - package002.DefaultClass";
	private String private_attribute_package002_DefaultClass = "private Attribute - package002.DefaultClass";
	String default_attribute_package002_DefaultClass = "default Attribute - package002.DefaultClass";
	protected String protected_attribute_package002_DefaultClass = "protected Attribute - package002.DefaultClass";
	
	public void public_method_package002_DefaultClass() {
		System.out.println("public Method - package002.DefaultClass");
	}
	private void private_method_package002_DefaultClass() {
		System.out.println("private Method - package002.DefaultClass");
	}
	void default_method_package002_DefaultClass() {
		System.out.println("default Method - package002.DefaultClass");
	}
	protected void protected_method_package002_DefaultClass() {
		System.out.println("protected Method - package002.DefaultClass");
	}
	
	public void accessPrivate() {
		System.out.println(private_attribute_package002_DefaultClass);
		this.private_method_package002_DefaultClass();
	}
	
	public void accessDefaultProtected() {
		System.out.println(default_attribute_package002_DefaultClass);
		System.out.println(protected_attribute_package002_DefaultClass);
		this.default_method_package002_DefaultClass();
		this.protected_method_package002_DefaultClass();
	}
}
