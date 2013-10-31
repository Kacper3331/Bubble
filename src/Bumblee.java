
public class Bumblee {

	public int[] sortNumbers(int[] table) {

		for(int i = 0; i < table.length-1; i++){
			if(table[i+1] < table[i]){
				int temp = table[i];
				table[i] = table[i+1];
				table[i+1] = temp;
			}
		}
		
		return table;
		
	}

}
