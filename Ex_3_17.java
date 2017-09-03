// C-3.17 Let A be an array of size n ≥ 2 containing integers from 1 to n − 1 inclusive, one of which
// is repeated. Describe an algorithm for finding the integer in A that is repeated.

import java.util.Random;
import java.util.Scanner;

public class Ex_3_17 {

	public int findRepeated(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			for (int j = i+1; j < numeros.length; j++) {
				if (numeros[i] == numeros[j]) {
					return numeros[i];
				}
			}
		}
		return -1;
	}

	public String toString(int[] numeros) {
		String saida = "(";
		for (int i = 0; i < numeros.length; i++) {
			saida = saida + numeros[i];
			if (i < numeros.length-1) {
				saida = saida + ", ";
			}
		}
		saida = saida + ")";
		return saida;
	}

	public static void main(String args[]) {
		int n, repetido = -1;
		int[] numeros;
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		Ex_3_17 classeExercicio = new Ex_3_17();

		// Verifica se o tamanho do array é ≥ 2
		do {
			n = scanner.nextInt();
		} while (n < 2);

		// Instância o array
		numeros = new int[n];

		// Inicializa o array
		for (int i = 0; i < n; i++) {
			numeros[i] = rand.nextInt(n);
		}

		// Verifica se existe um inteiro repetido
		repetido = classeExercicio.findRepeated(numeros);
		if (repetido != -1) {
			System.out.println("Número repetido encontrado: " + repetido);
		} else {
			System.out.println("Nenhum número repetido foi encontrado");
		}

		System.out.println(classeExercicio.toString(numeros));
	}
}
