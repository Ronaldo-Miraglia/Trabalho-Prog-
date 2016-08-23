
public class SelectionSort extends Pai {

	
	public void sort(int[] v) {
		
		for(int i = 0; i < v.length; i ++){
			int min = i;
			for( int j = i+1; j < v.length; j++){
				if(v[j] < v[min])
					min = j;	
			}
			
			if(min != i)
				swap(v, v[i], v[min]);
		}
		
	}

}
