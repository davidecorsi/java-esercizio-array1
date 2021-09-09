import java.util.Scanner;

/*
 * Scrivete un applicazione che riceva in input un numero e ne calcoli tutti i numeri primi precedenti.
 * Per la risoluzione utilizzate un array contenente tipi boolean. Alla fine ogni boolean con valore true
 * rappresenta che la sua posizione nell'array ha un indice numerico che è un numero primo. 
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci un numero ");
		int n = input.nextInt();
		boolean[] primi = new boolean[n + 1];
	}
}
