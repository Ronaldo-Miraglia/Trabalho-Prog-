package sorts;

public class MergeSort extends Ordenacao{
	 
		private int[] vetor;
	    private int[] temp;
	    private int length;

	
	 public void sort(int v[]) {
	        this.vetor = v;
	        this.length = v.length;
	        this.temp = new int[length];
	        doMergeSort(0, length - 1);
	    }
	 
	    private void doMergeSort(int min, int max) {
	         
	        if (min < max) {
	            int middle = min + (max - min) / 2;
	            doMergeSort(min, middle);
	            doMergeSort(middle + 1, max);
	            mergeParts(min, middle, max);
	        }
	    }
	 
	    private void mergeParts(int min, int middle, int max) {
	 
	        for (int i = min; i <= max; i++) {
	            temp[i] = vetor[i];
	        }
	        int i = min;
	        int j = middle + 1;
	        int k = min;
	        while (i <= middle && j <= max) {
	            if (temp[i] <= temp[j]) {
	                vetor[k] = temp[i];
	                i++;
	            } else {
	                vetor[k] = temp[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= middle) {
	            vetor[k] = temp[i];
	            k++;
	            i++;
	        }
	 
	    }
	    
}