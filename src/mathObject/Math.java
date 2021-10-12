package mathObject;

public class Math {

	public int sum(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}

	public int sub(int n1, int n2) {
		int result;
		result = n1 - n2;
		return result;
	}

	public double mult(int n1, int n2) {
		int result;
		result = n1 * n2;
		return result;
	}

	public double divide(double n1, double n2) {
		double result;
		result = n1 / n2;
		return result;
	}

	private double pi;

	public Math() {
		this.pi = 3.14785;
	}

	public double getPi() {
		return pi;
	}

	public double areaOfCicle(double r) {
		return this.getPi()*r*r;
	}

	public double volumeOfsphere(double r) {
    	 return this.getPi()*r*r*r*4/3;
	}

	public double double areaOfRectangularprism(double a, double b, c2) {
		
	}
    	
 
     }
