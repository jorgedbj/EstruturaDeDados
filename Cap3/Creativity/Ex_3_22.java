// C-3.22 Write a method, shuffle(A), that rearranges the elements of array A so that every possible
// ordering is equally likely. You may rely on the nextInt(n) method of the java.util.Random class,
// which returns a random number between 0 and n − 1 inclusive.

public int[] shuffle (int[] a) {
	Random r = new Random();
	int randomIndex1, randomIndex2;
	int temp;
	for(int i=0; i < a.length; i++) {
		randomIndex1 = r.nextInt(a.length);
		randomIndex2 = r.nextInt(a.length);
		temp = a[randomIndex1];
		a[randomIndex1] = a[randomIndex2];
		a[randomIndex2] = temp;
	}
	return a;
}
