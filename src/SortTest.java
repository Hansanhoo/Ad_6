package Sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortTest {
	
	static Data[] a;
	static Data[] b;
	static Data[] c;

	@Test
	public void bestcase() {
		
		bestcaseSuit(10);	
		bestcaseSuit(100);
		bestcaseSuit(1000);
		bestcaseSuit(10000);
		bestcaseSuit(100000);	
	}
	
	@Test
	public void averagecase() {
		
		averagecaseSuit(10);
		averagecaseSuit(100);
		averagecaseSuit(1000);
		averagecaseSuit(10000);
		averagecaseSuit(100000);
	}
	
	@Test
	public void worstcase() {		
		
		worstcaseSuit(10);
		worstcaseSuit(100);
		worstcaseSuit(1000);
		worstcaseSuit(10000);
		worstcaseSuit(100000);	
	}
	
	public void bestcaseSuit(int size) {
		System.out.println("Bestcase Array mit der Länge "+size);
		int counter = 0;
		for(int i = 0 ; i < 10 ; i ++){
			Sort.counter=0;	
			a = DataCreator.sortedArr(size);
			a = Sort.sort(a);
			counter += Sort.counter;
			
		}
		
		a = DataCreator.sortedArr(size);
	//	DataCreator.shuffle(a);
		a = Sort.sort(a);
		System.out.println(counter/10);
		Sort.counter=0;	
		
	}
	
	public void averagecaseSuit(int size) {
		System.out.println("Averagecase  Array mit der Länge "+size);
		int counter = 0;
		for(int i = 0 ; i < 10 ; i ++){
			Sort.counter=0;	
			a = DataCreator.shuffelCreator(size);
			a = Sort.sort(a);
			counter += Sort.counter;		
		}
		System.out.println(counter/10);
		Sort.counter=0;	
		
	}
	
	public void worstcaseSuit(int size) {
		System.out.println("Worstcase  Array mit der Länge "+size);
		int counter = 0;
		for(int i = 0 ; i < 10 ; i ++){
			Sort.counter=0;	
			a = DataCreator.createSameData(size);		
			a = Sort.sort(a);
			counter += Sort.counter;		
		}
		System.out.println(counter/10);
		Sort.counter=0;	
		
	}

}
