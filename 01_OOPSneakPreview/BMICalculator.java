/** This class allows the user to calculate the body-mass index, or 
 *  <b><u>BMI</u></b> using the inputs:
 *  <ul>
 *    <li>weight,</li>
 *    <li>height.</li>
 * </ul>
 */
public class BMICalculator {
    // Declare variables
    private double weight, height, BMI;

    public BMICalculator(double w, double h) {
	weight = w;
	height = h;
    }

    public double calculateBMI() {
	return weight / (height * height);
    }

    public boolean isOverweight() {
	return (BMI > 25);
    }

    
    public static void main(String[] args) {
	BMICalculator calculator = new BMICalculator(79.55, 1.85);
	double bmi = calculator.calculateBMI();

	System.out.println("Your BMI is: " + bmi + ".\n");
    }
}