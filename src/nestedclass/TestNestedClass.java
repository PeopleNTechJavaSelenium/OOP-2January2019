package nestedclass;

public class TestNestedClass {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.outerMethodA();
		OuterClass.InnerClassC.innerMethodC();
		OuterClass.InnerClassC.InnerInnerC.innerInnerMethodC();

	}

}
