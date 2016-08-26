
public class cockTailSort extends Pai {
	
    public void sort(int[] v){
    	
        int inicio, fim;
        inicio = v[0];
        fim = v.length - 1;
        while (inicio < fim){
        	
            for (int i = inicio; i < fim; i = i + 1)
            {
                if (v[i] > v[i + 1])
                {
                    swap(v,v[i],v[i+1]);
                }
            }
            fim = fim - 1;
            for (int i = fim; i > inicio; i = i - 1)
            {
                if (v[i] < v[i - 1])
                {
                    swap(v,v[i],v[i-1]);
                }
            }
            inicio = inicio + 1;
        }
        
    }

}
