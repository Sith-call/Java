package casting;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("Parent p = new Son();");
		Parent p = new Son();
		System.out.println("printInfo is overrided in Son class.");
		p.printInfo(); // 문제 1 : 출력 결과는? -> 오버라이딩된 경우
		
		System.out.println();
		
		try {
			Son c = (Son) new Parent(); // 문제 2 : 에러 종류는?
		} catch(Exception e) {
			System.out.println("Son c = (Son) new Parent(); : Error");
			e.printStackTrace();
		}
		
		System.out.println();
		
		Parent human = new Daughter();
		System.out.println("Parent human = new Daughter();");
		System.out.println("printInfo is overrided in Daughter class.");
		human.printInfo();
		System.out.println();
		
		if(human instanceof Daughter) {
			System.out.println("human instanceof Daughter : True");	
		} else {
			System.out.println("human instanceof Daughter : False");
		}
		
		if(human instanceof Son) {
			System.out.println("human instanceof Son : True");	
		} else {
			System.out.println("human instanceof Son : False");
		}
		
		if(human instanceof Parent) {
			System.out.println("human instanceof Parent : True");	
		} else {
			System.out.println("human instanceof Parent : False");
		}
		
		System.out.println();
		
		if((Daughter)human instanceof Daughter) {
			System.out.println("(Daughter)human instanceof Daughter : True");	
		} else {
			System.out.println("(Daughter)human instanceof Daughter : False");
		}
		
		
		try {
			if((Son)human instanceof Son) {
				System.out.println("(Son)human instanceof Son : True");	
			}
		} catch(Exception e) {
			System.out.println("(Son)human instanceof Son : Error");
			e.printStackTrace();
		}
		
		System.out.println();
		
		Daughter d = new Daughter();
		if((Parent)d instanceof Parent) {
			System.out.println("(Parent)d instanceof Parent : True");	
		} else {
			System.out.println("(Parent)d instanceof Parent : False");
		}
		if((Parent)d instanceof Daughter) {
			System.out.println("(Parent)d instanceof Daughter : True");	
		} else {
			System.out.println("(Parent)d instanceof Daughter : False");
		}
	}
}