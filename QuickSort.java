
public class QuickSort extends Pai {
	
	 private int vetor[];
	    private int length;
	 
	    public void sort(int[] v) {
	         
	        if (v == null || v.length == 0) {
	            return;
	        }
	        this.vetor = v;
	        length = v.length;
	        quickSort(0, length - 1);
	    }
	 
	    private void quickSort(int init, int end) {
	         
	        int i = init;
	        int j = end;
	    
	        int pivot = vetor[init+(end-init)/2];
	        while (i <= j) {
	            while (vetor[i] < pivot) {
	                i++;
	            }
	            while (vetor[j] > pivot) {
	                j--;
	            }
	            if (i <= j) {
	                swap(vetor,i, j);
	                i++;
	                j--;
	            }
	        }
	        
	        if (init < j)
	            quickSort(init, j);
	        if (i < end)
	            quickSort(i, end);
	    }    
	
}
