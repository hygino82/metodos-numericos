package entities;

public class Bissecao {
	private double a;
	private double b;
	
	public Bissecao() {
		
	}
	
	public Bissecao(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double f(double x) {
		return Math.exp(x) + x - 2;
		//aqui vai a função que iremos achar as raízes;		
	}
	
	
	
	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}
	
	public boolean testeIntervalo(double a, double b) {
		if (f(a) * f(b) < 0) {
			return true;
		}
		else {
			return false;
		}
			
	}
	
	public void resolverMetodo() {
		double xa = getA();
		double xb = getB();
		double xm;
		int k = 0;
		
		System.out.println("k   a\t f(a)\t b\t f(b)\t xm\t f(xm)\t |a - b|\n");
		while (true) {
			xm = (xa + xb) / 2.0;
			System.out.printf("%d  %.5f  %.5f  %.5f  %.5f  %.5f  %.5f  %5f\n", k, xa, f(xa), xb, f(xb), xm, f(xm), Math.abs(xa - xb));
			if (Math.abs(xa - xb) < 0.01) {
				break;
			}
			
			if (f(xm) * f(a) < 0) {
				xb = xm;
			}
			else {
				xa = xm;
			}
			
			k++;
			
		}
	}
/*
	@Override
	public String toString() {
		StringBuilder sb = "";
		sb.append("k\t a\t f(a)\t b \t f(b)\t xm\t f(xm)\t |a - b|\n");
		return sb.toString();
		
	}*/
	
}
