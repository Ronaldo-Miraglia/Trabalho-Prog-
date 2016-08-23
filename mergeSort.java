
public class mergeSort extends Pai {
	 private int[] vetor;
	 private int end;
	 
	public void sort(int[] v) {
		this.vetor = v;
	    end = v.length;
	    mergesort(v, 0, end - 1);
	}
	public void mergesort(int v[],int start,int end){
		int middle;
		if(start < end){
			middle = (start + end)/2;
			mergesort(v,start,middle);
			mergesort(v,middle+1,end);
			merge(v,start,middle,end);
		}
	}

	public void merge(int v[], int start,int middle, int end){
		for(int i = start; i < end; i++){
			vetor[i] = v[i];
			
			int j = middle + 1;
			int k = start;
			
			while(i <= middle && j<= end){
				if(vetor[i] <= vetor[j])
					v[k++] = vetor[i++];
				else 
					v[k++] = vetor[j++];
				}
			
			while(i <= middle)
				v[k++] = vetor[i++];
		}
		
	}

}
