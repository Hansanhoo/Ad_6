

public class Start {
	public static void main(String[] args) {

		System.out.println("Bestcase Array mit der Länge ");
		int counter = 0;
		for(int i = 0 ; i < 10 ; i ++){
			Sort.counter=0;	
			Data[] arr = shuffelCreator(10);
			arr = Sort.sort(arr);
			counter += Sort.counter;
			
		}
		System.out.println(counter/10);
		Sort.counter=0;	
		
		Data[] a = shuffelCreator(10);
		
		for(int i = 0; i < a.length;i++ ) {
			System.out.println(a[i]);
			
		}
		System.out.println("Sort Array:");
		a = Sort.sort(a);
		for(int i = 0; i < a.length;i++ ) {
			System.out.println(a[i]);
			
		}
	}
	public static Data[] shuffelCreator(int size) {
		Data[] arr = new Data[size];
		for (int i = 0; i < arr.length; i++) {
			int random =(int)(Math.random()*(size*100)+(700*size));
			arr[i] = new Data(random);
		}
		return arr;
	}

	
}
