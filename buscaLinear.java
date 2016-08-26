package Aulas;

public class buscaLinear {
	//Se o numero não for achado retorna -1 
	public int procura(int[] vetor, int elementoProcurado) {
	     for (int i = 0; i < vetor.length; i++)
	         if (vetor[i] == elementoProcurado)
	             return i;//Retorna a posicao que esta o elemento
	     return -1;
	 }

}
