
public class BubbleSort extends Pai {

	
	public void sort(int[] v) {
		for(int i = 0;i<v.length; i++){
			for(int j = 0; j < v.length; j++){
				if(j+1 == v.length)
					break;
				
				else if(v[j] > v[j+1])
					swap(v,j,j+1);
				
				
			}
		}
		
	}
	
	
	

}
