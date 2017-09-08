// R-3.2 Write a Java method that repeatedly selects and removes a random entry from an array until
// the array holds no more entries.

import java.util.Random;

public class Ex_3_02 {
	int[] valores;
	int total;
	
	public Ex_3_2 () {
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		valores = new int[10];
		for (int i=0; i < 10; i++) {
			valores[i] = rand.nextInt(100);
		}
		total = 10;
	}
	private void remove (int index) {
		for (int i=index; i < total-1; i++) {
			valores[i] = valores[i+1];
		}
		valores[total-1] = 0;
		System.out.println("Remoção do elemento " + index + ":");
		imprimir();
	}
	
	private void imprimir () {
		String saida = "";
		for (int i=0; i < 10; i++) {
			saida = saida + this.valores[i] + " ";
		}
		System.out.println(saida);
	}
	
	public static void main (String args[]) {
		Ex_3_02 objeto = new Ex_3_02();
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		System.out.println("Array inicial: ");
		objeto.imprimir();
		for (int i=0; i < 10; i++) {
			objeto.remove(rand.nextInt(objeto.total));
			objeto.total--;
		}
	}
}
