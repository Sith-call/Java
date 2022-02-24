package package001;

public class PublicClass {
	public String public_attribute_package001_PublicClass = "public Attribute - package001.PublicClass";
	private String private_attribute_package001_PublicClass = "private Attribute - package001.PublicClass";
	String default_attribute_package001_PublicClass = "default Attribute - package001.PublicClass";
	protected String protected_attribute_package001_PublicClass = "protected Attribute - package001.PublicClass";
	
	public void public_method_package001_PublicClass() {
		System.out.println("public Method - package001.PublicClass");
	}
	private void private_method_package001_PublicClass() {
		System.out.println("private Method - package001.PublicClass");
	}
	void default_method_package001_PublicClass() {
		System.out.println("default Method - package001.PublicClass");
	}
	protected void protected_method_package001_PublicClass() {
		System.out.println("protected Method - package001.PublicClass");
	}
	
	public void accessPrivate() {
		System.out.println(private_attribute_package001_PublicClass);
		this.private_method_package001_PublicClass();
	}
}
