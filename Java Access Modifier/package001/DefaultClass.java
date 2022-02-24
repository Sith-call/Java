package package001;

class DefaultClass {
	public String public_attribute_package001_DefaultClass = "public Attribute - package001.DefaultClass";
	private String private_attribute_package001_DefaultClass = "private Attribute - package001.DefaultClass";
	String default_attribute_package001_DefaultClass = "default Attribute - package001.DefaultClass";
	protected String protected_attribute_package001_DefaultClass = "protected Attribute - package001.DefaultClass";
	
	public void public_method_package001_DefaultClass() {
		System.out.println("public Method - package001.DefaultClass");
	}
	private void private_method_package001_DefaultClass() {
		System.out.println("private Method - package001.DefaultClass");
	}
	void default_method_package001_DefaultClass() {
		System.out.println("default Method - package001.DefaultClass");
	}
	protected void protected_method_package001_DefaultClass() {
		System.out.println("protected Method - package001.DefaultClass");
	}
	
	public void accessPrivate() {
		System.out.println(private_attribute_package001_DefaultClass);
		this.private_method_package001_DefaultClass();
	}
}
