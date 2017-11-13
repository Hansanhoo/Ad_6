package Sort;

import java.util.Random;

public class DataCreator {

	public static Data[] sortedArr(int size){
		Data[] arr = new Data[size];
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Data(700*size + ((100 * i )));

		}
		return arr;
	}
	// fill Array with Keys of diffrent Area
	public static Data[] fillarry(int size) {
		Data[] arr = new Data[size];
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Data(((int) Math.random() * 100) + (700 * n) + (100 * i));

		}
		return arr;
	}

	// Shuffle an Array
	public static void shuffle(Data[] arr) {
		int randomindex;
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			randomindex = random.nextInt(arr.length);
			swap(i, randomindex, arr);
		}
	}

	// Swap two places in a Array
	public static void swap(int i, int j, Data[] arr) {
		Data tmp;
		tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	// Create a array where two Keys are in the same Area
	//WICHTIG onliy works for arrays where length gleich 10
	public static Data[] TwoDataInSameArea(int size) {
		Data[] arr = new Data[size];
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			int zahl = ((int) Math.random() * 100) + (700 * n) + (100 * i);
			int z = 0;
				if (i % 2 == 0) {
					z = 12 * n;
				}
			zahl = zahl + z;
			arr[i] = new Data(zahl);

		}
		return arr;
	}
	// Create a Array where all Keys are the same
	public static Data[] createSameData(int size) {
		Data[] arr = new Data[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Data(700 * size);
		}
		return arr;
	}
	 //Creats array where Keys are shuffle
	public static Data[] shuffelCreator(int size) {
		Data[] arr = new Data[size];
		for (int i = 0; i < arr.length; i++) {
			int random =(int)(Math.random()*(size*100)+(700*size));
			arr[i] = new Data(random);
		}
		return arr;
	}
	
	// Creates a descendig sorted Array
	public static Data[] createWorstData(int n) {
        Data[] data = new Data[n];
        for (int i = 0; i < data.length; i++) {
            data[i] = new Data((790 * n) + (n - i));
        }
        return data;
    }
}