package sorts;

public class InsertionSort extends Ordenacao{

	public void sort(int[] v) {
		
		int  j, atual;

		for (int i = 1; i < v.length; i++){
			atual = v[i];
			j = i - 1;

			while ((j >= 0) && (atual < v[j])){
				v[j + 1] = v[j];
	            j--;
			}
	    
			v[j + 1] = atual;
		}
		
	}
}
