package main;

import java.util.Arrays;
import java.util.List;

/**  
 * @author Nicolas
 *
 * Class that uses the MergeSort method to sort an array/list
 *
 */
public abstract class MergeSort {

	public static int[] sort(int[] lista) {

		int[] a = Arrays.copyOfRange(lista, 0, lista.length / 2);
		int[] b = Arrays.copyOfRange(lista, lista.length / 2, lista.length);

		if (a.length > 1) {
			a = sort(a);
		}

		if (b.length > 1) {
			b = sort(b);
		}

		int[] c = new int[lista.length];
		int counterA = 0;
		int counterB = 0;
		int counterC = 0;

		for (; counterC < c.length;) {

			for (; counterA < a.length;) {

				for (; counterB < b.length;) {

					if (a[counterA] < b[counterB]) {

						c[counterC] = a[counterA];
						counterC += 1;
						counterA += 1;

						if (counterA == a.length && counterC != lista.length) {
							while (counterC != lista.length) {
								c[counterC] = b[counterB];
								counterC += 1;
								counterB += 1;
							}
						}

						break;
					}

					if (a[counterA] > b[counterB]) {

						c[counterC] = b[counterB];
						counterC += 1;
						counterB += 1;

						if (counterB == b.length && counterC != lista.length) {
							while (counterC != lista.length) {
								c[counterC] = a[counterA];
								counterC += 1;
								counterA += 1;
							}
						}

						continue;
					}

					if (a[counterA] == b[counterB]) {

						c[counterC] = a[counterA];
						counterC += 1;
						counterA += 1;

						c[counterC] = b[counterB];
						counterC += 1;
						counterB += 1;
						
						if (counterA == a.length && counterC != lista.length) {
							while (counterC != lista.length) {
								c[counterC] = b[counterB];
								counterC += 1;
								counterB += 1;
							}
						}

						if (counterB == b.length && counterC != lista.length) {
							while (counterC != lista.length) {
								c[counterC] = a[counterA];
								counterC += 1;
								counterA += 1;
							}
						}

						break;
					}
				}
			}
		}

		return c;
	}

	public static int[] sort(List<Integer> lista) {

		List<Integer> listA = lista.subList(0, lista.size() / 2);
		List<Integer> listB = lista.subList(lista.size() / 2, lista.size());

		int[] a = new int[listA.size()];
		int[] b = new int[listB.size()];
		int aCounter = 0;
		int bCounter = 0;

		for (Integer integer : listA) {
			a[aCounter] = integer;
			aCounter++;
		}

		for (Integer integer : listB) {
			b[bCounter] = integer;
			bCounter++;
		}

		if (a.length > 1) {
			a = sort(a);
		}

		if (b.length > 1) {
			b = sort(b);
		}

		int[] c = new int[lista.size()];

		int counterA = 0;
		int counterB = 0;
		int counterC = 0;

		for (; counterC < c.length;) {

			for (; counterA < a.length;) {

				for (; counterB < b.length;) {

					if (a[counterA] < b[counterB]) {

						c[counterC] = a[counterA];
						counterC += 1;
						counterA += 1;

						if (counterA == a.length && counterC != lista.size()) {
							while (counterC != lista.size()) {
								c[counterC] = b[counterB];
								counterC += 1;
								counterB += 1;
							}
						}

						break;
					}

					if (a[counterA] > b[counterB]) {

						c[counterC] = b[counterB];
						counterC += 1;
						counterB += 1;

						if (counterB == b.length && counterC != lista.size()) {
							while (counterC != lista.size()) {
								c[counterC] = a[counterA];
								counterC += 1;
								counterA += 1;
							}
						}

						continue;
					}

					if (a[counterA] == b[counterB]) {

						c[counterC] = a[counterA];
						counterC += 1;
						counterA += 1;

						c[counterC] = b[counterB];
						counterC += 1;
						counterB += 1;
						
						if (counterA == a.length && counterC != lista.size()) {
							while (counterC != lista.size()) {
								c[counterC] = b[counterB];
								counterC += 1;
								counterB += 1;
							}
						}

						if (counterB == b.length && counterC != lista.size()) {
							while (counterC != lista.size()) {
								c[counterC] = a[counterA];
								counterC += 1;
								counterA += 1;
							}
						}

						break;
					}
				}
			}
		}

		return c;
	}
}
