package controller;

public class Ordenacao {

	
	public Ordenacao() {
	super();

	}
	
	public int[] quickSort(int[] vetor, int inicio, int fim) {
		if(fim > inicio) {
			int posicaoPivoFixo = dividir(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivoFixo - 1);
			quickSort(vetor, posicaoPivoFixo + 1, fim);
		}
		return vetor;
	}
	
	private int dividir(int[] vetor, int inicio, int fim) {
		
		int ponteiroEsquerda = inicio + 1; //2ª posição depois do vetor
		int ponteiroDireita = fim; //última posição do vetor
		int pivo = vetor[inicio]; //O pivô é definido arbitrariamente como o 1º valor do vetor
		
		while(ponteiroEsquerda <= ponteiroDireita) {
			while (ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda] <= pivo) {
				ponteiroEsquerda++;
			}
			while(ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroDireita] > pivo) {
				ponteiroDireita--;
			}
			
			if(ponteiroEsquerda < ponteiroDireita) {
				trocar(vetor, ponteiroEsquerda, ponteiroDireita);
				ponteiroEsquerda++;
				ponteiroDireita--;
			}
		}
		
		trocar(vetor, inicio, ponteiroDireita);
		return ponteiroDireita;
		
	}
	
	
	private void trocar(int[] vetor, int i, int j) {
		int auxiliar = vetor[j];
		vetor[j] = vetor[i];
		vetor[i] = auxiliar;
		
	}
	
	
}
