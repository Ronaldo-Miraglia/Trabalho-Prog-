package Aulas;

public class buscaBinaria{

//Algoritmo para busca em vetor ordenado	
	public int busca(int[] v, int valor){
		
		 int inicio = 0;
		 int fim = v.length-1;

		 while(inicio <= fim){
			 int meio = (inicio+fim)/2;

			 if(v[meio] == valor){
				 return meio;
			 	}

			 if(valor > v[meio]){
				 inicio = meio+1;
			 } else {
				 fim = meio-1;
			 	}
		 }
		 
		 return -1;
	}

}