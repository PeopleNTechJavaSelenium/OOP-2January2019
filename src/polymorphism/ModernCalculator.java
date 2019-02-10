package polymorphism;

public class ModernCalculator extends LandCalculator {
    @Override
	public int areaOfLand(int a, int b, int c, int d) {
		int total = a + b + c + d + 3;
		return total;
	}
}
