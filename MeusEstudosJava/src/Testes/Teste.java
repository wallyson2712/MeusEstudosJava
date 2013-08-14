package Testes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Teste {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader ent = new BufferedReader(
				new InputStreamReader(System.in));

		String algo = ent.readLine();
		String algo2 = ent.readLine();

		System.out.println(Integer.parseInt(algo) + Integer.parseInt(algo2));

		// vai ler a primeira linha é ficar cortando por expaços
		StringTokenizer st = new StringTokenizer(ent.readLine());
		// vai pegar o primeiro token da linha
		int valor = Integer.parseInt(st.nextToken());
		int valor2 = Integer.parseInt(st.nextToken());
		System.out.println(valor + "" + valor2);

	}
}
