package main;

import java.util.List;

/**
 * @author Nicolas
 *
 * Class that sorts a list with the BubbleSort method
 *
 */
public abstract class BubbleSort {

	public static int[] sort(List<Integer> array) {

		int[] list = new int[array.size()];
		int counter = 0;
		int aux;

		for (Integer integer : array) {
			list[counter] = integer;
			counter++;
		}

		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] > list[j]) {
					aux = list[i];
					list[i] = list[j];
					list[j] = aux;
				}
			}
		}

		return list;
	}
}
