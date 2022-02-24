package package002;

public class PublicClass {
	public String public_attribute_package002_PublicClass = "public Attribute - package002.PublicClass";
	private String private_attribute_package002_PublicClass = "private Attribute - package002.PublicClass";
	String default_attribute_package002_PublicClass = "default Attribute - package002.PublicClass";
	protected String protected_attribute_package002_PublicClass = "protected Attribute - package002.PublicClass";
	
	public void public_method_package002_PublicClass() {
		System.out.println("public Method - package002.PublicClass");
	}
	private void private_method_package002_PublicClass() {
		System.out.println("private Method - package002.PublicClass");
	}
	void default_method_package002_PublicClass() {
		System.out.println("default Method - package002.PublicClass");
	}
	protected void protected_method_package002_PublicClass() {
		System.out.println("protected Method - package002.PublicClass");
	}
	
	public void accessPrivate() {
		System.out.println(private_attribute_package002_PublicClass);
		this.private_method_package002_PublicClass();
	}
	
	public void accessDefaultProtected() {
		System.out.println(default_attribute_package002_PublicClass);
		System.out.println(protected_attribute_package002_PublicClass);
		this.default_method_package002_PublicClass();
		this.protected_method_package002_PublicClass();
	}
}
