package entities;

public class NewtonRaphson {
	private double xk;

	public NewtonRaphson() {
		
	}
	
	public NewtonRaphson(double xk) {
		this.xk = xk;
	}
	
	
	
	public double getXk() {
		return xk;
	}

	public void setXk(double xk) {
		this.xk = xk;
	}

	public double f(double x) {
		return Math.exp(x) - x * x - 4 * x;
		//return 4 * Math.pow(x, 4) +5 * Math.pow(x, 3) - 125.0/ 4.0 * Math.pow(x, 2) - 165.0 / 16.0 * x + 351.0 / 4.0;
	}
	
	public double f1(double x) {
		return Math.exp(x) - 2 * x - 4;
		//return 16 * Math.pow(x, 3) + 15 * Math.pow(x, 2) - 125.0 / 8.0 * x -165.0 / 16.0;
	}
	
	public double f2(double x) {
		//return 48 * Math.pow(x, 2) + 30 * x - 125.0 /8.0;
		return Math.exp(x) - 2;
	}
	
	public boolean verificaPonto(double x) {
		if (f(x) * f2(x) > 0.0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void geraMetodo(double x) {
		System.out.println("k\t xk\t f(xk)\t f'(xk)\t |f(xk)|\n");
		double xm = xk;
		int n = 0;
		while (true) {
			System.out.printf("%d %.9f %.9f %9f %.9f\n", n, xm, f(xm), f1(xm), Math.abs(f(xm)) );
			if (Math.abs(f(xm)) < 0.001) {
				break;
			}
			n++;
			xm -= f(xm) / f1(xm);
			
			
			
		}
	}
	
	
}
