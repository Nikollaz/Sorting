package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String args[]) {

		// ================================================================================
		// 						Cargar numeros desde un archivo							 //
		// ================================================================================

		List<Integer> array = new ArrayList<Integer>();

		chargeFromFile(array, "resources/IntegerArray.txt");

//		/* MergeSort */
//		int[] lista = MergeSort.sort(array);
		/* BubbleSort */
		int[] lista = BubbleSort.sort(array);

		for (int i = 0; i < lista.length; i++)
			System.out.println(lista[i]);

		// ================================================================================
		// 								Test con int[]									 //
		// ================================================================================

		// lista = chargeRandoms(lista);
		//
		// for (int i = 0; i < lista.length; i++)
		// lista[i] = (int) (Math.random() * 10);
		//
		// for (int i = 0; i < lista.length; i++)
		// System.out.print(lista[i] + " ");
		//
		// lista = MergeSort.sort(lista);
		//
		// System.out.println();
		// System.out.println();
		//
		// for (int i = 0; i < lista.length; i++)
		// System.out.print(lista[i] + " ");

		// ================================================================================
		// 							Test con ArrayList<Integer>							 //
		// ================================================================================

		// int[] lista = new int[10];
		// List<Integer> array = new ArrayList<Integer>();
		//
		// lista = chargeRandoms(lista);
		//
		// for (Integer integer : array) {
		// System.out.print(integer + " ");
		// }
		//
		// lista = MergeSort.sort(array);
		//
		// System.out.println();
		// System.out.println();
		//
		// for (int i = 0; i < lista.length; i++)
		// System.out.print(lista[i] + " ");

	}

	private static void chargeFromFile(List<Integer> lista, String path) {

		File file = new File(path);
		BufferedReader reader = null;
		String text = null;

		try {
			reader = new BufferedReader(new FileReader(file));

			while ((text = reader.readLine()) != null) {
				lista.add(Integer.parseInt(text));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int[] chargeRandoms(int[] lista) {

		for (int i = 0; i < lista.length; i++)
			lista[i] = (int) (Math.random() * 10);

		return lista;
	}

	public static void chargeRandoms(List<Integer> array, int quantity) {

		for (int i = 0; i < quantity; i++)
			array.add((int) (Math.random() * 10));

	}
}
