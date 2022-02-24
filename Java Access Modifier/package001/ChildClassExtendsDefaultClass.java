package package001;

public class ChildClassExtendsDefaultClass {
	public void accessParent() {
		System.out.println("========   Child of package002.DefaultClass Accessing his parent    ========");
		System.out.println("********   Accessing Attribute & Method of package002.DefaultClass  ********");
		System.out.println("ChildClassExtendsDefaultClass can not access pakage002.DefaultClass.");
		System.out.println("So ChildClassExtendsDefaultClass can not extend pakage002.DefaultClass also.");
		System.out.println("**********************************************************************");
		System.out.println();
	}
}
