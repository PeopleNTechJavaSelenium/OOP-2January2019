package nestedclass;

public class OuterClass {
 public String outerValue;
 
 InnerClassA innerA = new InnerClassA();
	
	public void outerMethodA() {
		innerA.innerMethodA();
		System.out.println("This is from outer method A");
	}
	
	private class InnerClassA{
		String innerAValue;
		
		private void innerMethodA() {
			System.out.println("This is from InnerA method");
		}
	}
	
	private class InnerClassB{
		String innerBValue;
		
		private void innerMethodB() {
			innerA.innerMethodA();
			System.out.println("This is from InnerB method");
		}
	}
	public static class InnerClassC{
		String innerBValue;
		
		public static void innerMethodC() {
			System.out.println("This is from InnerC method");
		}
		
		public static class InnerInnerC{
		   
			public static void innerInnerMethodC() {
				System.out.println("This is from InnerInnerC method");
			}
			
		}
	}
}
