public class insertionOtimizado extends Pai{
	
	public void sort (int[] v) {
		 int i ,j ;
		 int n = v.length - 1;
		 for (i = n - 2; i >= 0; i --) {
		 v[n] = v [i];
		 j = i + 1;
		 while (v[n] > v [j]) {
		 v[j-1] = v[j];
		 j ++;
		 }
		 v[j-1] = v[n];
		 }
 }
	
}
