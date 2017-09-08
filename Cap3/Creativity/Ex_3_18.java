// C-3.18 Let B be an array of size n ≥ 6 containing integers from 1 to n − 5 inclusive, five of which
// are repeated. Describe an algorithm for finding the five integers in B that are repeated.

public int[] findRepeated(int[] numeros) {
	int[] repeated = new int[5];
	int encontrados = 0;
	for (int i = 0; i < numeros.length; i++) {
		for (int j = i+1; j < numeros.length; j++) {
			if (numeros[i] == numeros[j]) {
				repeated[encontrados] = numeros[i];
				if (encontrados == 4) {
					return repeated;
				}
				encontrados++;
			}
		}
	}
	return repeated;
}
