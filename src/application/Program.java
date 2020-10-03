package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bissecao;
import entities.NewtonRaphson;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		NewtonRaphson op = new NewtonRaphson();
		double xk;
		while (true) {
			System.out.print("Informe um ponto -> ");
			xk = sc.nextDouble();
			if (op.f(xk) * op.f2(xk) > 0.0) {
				op.setXk(xk);
				System.out.printf("f(xk) * f2(xk) = %.5f\n\n", op.f(xk) * op.f2(xk));
				break;
			}
			else {
				System.out.println("Ponto inválido");
			}
		}
		System.out.println("Gera método\n");
		op.geraMetodo(xk);
		/*
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
		
		eq.resolverMetodo();*/
		sc.close();

	}

}
