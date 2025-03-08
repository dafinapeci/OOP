import java.util.Scanner;
import java.lang.Math;
import java.security.PublicKey;
public class MaximumFinder {
	public void determineMaximum() {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter 3 floating-point values separated by space: ");
		
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		double result = maximum(number1, number2, number3);
		
		System.out.printf("Maximum is (using method): %f", result);
		
		result = Math.max(number1, Math.max(number2, number3));
		System.out.printf("\nMaximum is (using Math.max): %f", result);
	}
	
	public double maximum(double x, double y, double z) {
		double maximumValue = x;
		
		if (y > maximumValue) {
			maximumValue = y;
		}
		
		if (z > maximumValue) {
			maximumValue = z;
		}
		return maximumValue;
	}
	
//minimum method
	public double minimum(double x, double y, double z) {
		double minimumValue = x;
		
		if (y < minimumValue) {
			minimumValue = y;
		}
		
		if (z < minimumValue) {
			minimumValue = z;
		}
		return minimumValue;
	}
}


public class MaximumFinderTest {

	public static void main(String[] args) {
		MaximumFinder maximumFinder = new MaximumFinder();
		
		maximumFinder.determineMaximum();

	}

}
