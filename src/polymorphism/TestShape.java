package polymorphism;

public class TestShape {

	public static void main(String[] args) {
		LandCalculator cal = new LandCalculator();
		int line = cal.areaOfLand(10, 12);
		System.out.println(line);
		int triangle = cal.areaOfLand(10, 12, 15);
		System.out.println(triangle);
		int rectangle = cal.areaOfLand(10, 12, 15, 16);
		System.out.println(rectangle);
		
		ModernCalculator mc = new ModernCalculator();
		int modifiedRectangle = mc.areaOfLand(10, 12, 15, 16);
		System.out.println(modifiedRectangle);
		
		LandCalculator landModernCal = new ModernCalculator();
		int landModernRec = landModernCal.areaOfLand(10, 12, 15, 16);
		System.out.println(landModernRec);
	}

}
