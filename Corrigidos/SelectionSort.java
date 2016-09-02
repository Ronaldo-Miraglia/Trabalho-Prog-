package sorts;

public class SelectionSort extends Ordenacao {
	
	public void sort(int[] v) {
		int menor;
	    int indiceMenor;
        for (int i = 0; i < v.length - 1; i++) {
            // antes de comparar, considera-se menor o valor atual do loop
            menor = v[i];
            indiceMenor = i;

            // compara com os outros valores do vetor
            for (int j = i + 1; j < v.length; j++){
                if (v[j] < menor){
                    menor = v[j];
                    indiceMenor = j;
                }
            }

            // troca os valores menor e maior
            v[indiceMenor] = v[i];
            v[i] = menor;
        }
		
	}
}
