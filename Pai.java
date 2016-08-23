
public abstract class Pai implements Ordenacao{
	
	
	
	
	public void swap(int[] v, int p1, int p2){
		int aux;
		
		aux = v[p1];
		v[p1] = v[p2];
		v[p2] = aux;	
		
	}
	public void print(int[] v){
		
		for(int i = 0; i < v.length; i++)
			System.out.println(v[i]);
		
	}

}
