import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class OrdenarArquivo {

	public static void main(String[] args) {
		
		String arquivo = "C://Users//Junior//Desktop//TrabalhoProg//NumerosAleatorios//10000//Arquivo Vetor.txt";
		String arquivo2 = "C://Users//Junior//Desktop//TrabalhoProg//NumerosAleatorios//10000//Arquivo de Busca.txt";
	
		
		try{
			System.setIn(new FileInputStream(new File(arquivo)));
		}
		catch(FileNotFoundException erro){
			System.out.println("Arquivo Nao Encontrado");
		}
		
		Scanner teclado = new Scanner(System.in);
		Random r = new Random();
		int []v = new int [10000];
		int []v2 = new int [100];
		
		
		while ( teclado.hasNext() ){
			
			for(int i = 0; i < v.length; i++){
				v[i] = teclado.nextInt();	
			}
			
		}
		
		//NÃO CONSEGUE PREENCHER O VETOR COM OS VALORES SALVOS NO ARQUIVO DE 100 POSIÇOES
		try{
			System.setIn(new FileInputStream(new File(arquivo2)));
		}
		catch(FileNotFoundException erro){
			System.out.println("Arquivo Nao Encontrado");
		}
		
		while ( teclado.hasNext() ){
			
			for(int i = 0; i < v2.length; i++){
				v2[i] = teclado.nextInt();	
			}
			
		}
		
		System.out.println("Arquivo com 10000");
		for(int i = 0; i < v.length; i++){
			System.out.println(v[i]);	
		}
		System.out.println("Arquivo com 100");
		for(int i = 0; i < v2.length; i++){
			System.out.println(v2[i]);	
		}
		teclado.close();
	}

}
