// C-3.17 Let A be an array of size n ≥ 2 containing integers from 1 to n − 1 inclusive, one of which
// is repeated. Describe an algorithm for finding the integer in A that is repeated.

public int findRepeated(int[] numeros) {
	for (int i = 0; i < numeros.length; i++) {
		for (int j = i+1; j < numeros.length; j++) {
			if (numeros[i] == numeros[j]) {
				return numeros[i];
			}
		}
	}
	return 0;
}
