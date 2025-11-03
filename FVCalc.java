// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
		double p = Double.parseDouble(args[0]);
		double r = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double rateM = 1 + r / 100.0;
		double finalValue = p * Math.pow(rateM,years);
		finalValue = (int) finalValue;
		System.out.println("The future value is " + finalValue);
	}
}