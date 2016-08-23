
public class insertionSort extends Pai {

	public void sort(int[] v) {
		int j;
		for(int i = 0; i < v.length; i++){
			j = i;
			while (j > 0 && v[j-1] > v[j]){
				swap(v,v[j],v[j-1]);
				j = j - 1;
			}
		}
	}
	
}
