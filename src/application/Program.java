package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bissecao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bissecao eq = new Bissecao();
		
		while (true) {
			System.out.print("Entre com o intervalo -> ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			if (eq.testeIntervalo(a, b) == false) {
				System.out.println("Intervalo inválido");
			}
			else {
				eq.setA(a);
				eq.setB(b);
				System.out.printf("f(%.5f) = %.5f\n", a, eq.f(a));
				System.out.printf("f(%.5f) = %.5f\n", b, eq.f(b));
				break;
			}
			
		}
		
		System.out.println("\nFim da entrada de dados");
		
		eq.resolverMetodo();
		sc.close();

	}

}
