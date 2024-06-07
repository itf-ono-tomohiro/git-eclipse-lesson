package exercise5;

public class Bmi {
	String name;
	
	Bmi(String name){
		this.name = name;
	}
	
	public double calcBmi(double height, double weight) {
		height /= 100;
		double result = weight / Math.pow(height, 2);
		return result;
	}

}
