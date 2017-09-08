// R-3.1 Give the next five pseudorandom numbers generated by the process described on page 113,
// with a = 12, b = 5, and n = 100, and 92 as the seed for cur.

public class Ex_3_01 {
	public static void main (String args[]) {
		int next, cur, i;
		cur = 92;
		for (i=0; i < 5; i++) {
			next = (12 * cur + 5) % 100;
			System.out.println("pseudorandom number[" + i + "] = " + next);
			cur = next;
		}
	}
}
