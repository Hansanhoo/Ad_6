
public class Sort {
	public static int counter = 0;
	// Sort the Array in a new Array wich is divided up in diffrent Arrays
	// data going to be sorted by theier Key Area
	public static Data[] sort(Data[] arr) {
		Data[][] a = new Data[arr.length][arr.length];

		Data[] returnArr = new Data[arr.length];
		for (int i = 0; i < arr.length; i++) {
			counter++;
			Data tmp = arr[i];
			counter++;
			int j = 0;
			int area = (tmp.key-(700*arr.length))/100;
			
			if(a[area][0] == null){
				counter++;
				a[area][0] = tmp;				
			}
			else{
				Data currentdata = a[area][0];
				if(currentdata.key > tmp.key) {
					a[area][0] = tmp;
					a[area][1] = currentdata;
					counter+=2;
				}
				else{					
					
					while(a[area][++j] != null && a[area][j].key < tmp.key){
						counter++;
						
					}
					if(a[area][j] == null){
						a[area][j] = tmp;
						counter++;
					}
					else{
						Data temp = a[area][++j];
						a[area][j] = tmp;
						a[area][++j] = temp;
						counter += 3;
					}
				}
			}
			
		}
		returnArr = repack(a);
		return returnArr;
	}
	// Pack the array wich is sorted by Key Areas in a normal sorted Array
	public static Data[] repack(Data[][] a){
		Data[] sortarray = new Data[a.length];
		int j = 0;
		int k;
		for (int i = 0; i <a.length;i++) {
			
			k = 0;
			counter++;
			if(a[i][k] != null) {
				sortarray[j] = a[i][k];
				k++;
				j++;
				counter+=2;
					while( a[i][k] != null) {
						sortarray[j] = a[i][k];
						j++;
						k++;
						counter+=2;						
					}
				
			}
		}
		
		return sortarray;
	}
		

}
