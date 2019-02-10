package inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		Father father = new Father();
		father.altheletic();
		
		Son son = new Son();
		son.swimming();
		
		GrandChildren grandChild = new GrandChildren();
		grandChild.musician();

	}

}
