package Testes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Uso {

	/**
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {

		// Estou criando um "arquivo" com os dados
		BufferedReader ent = new BufferedReader(
				new InputStreamReader(System.in));
		// estou criando uma forma de quebrar a palavra em parte, no caso por
		// linha
		StringTokenizer st = new StringTokenizer(ent.readLine());

		System.out.println("Digite o tempo");
		int tempo = Integer.parseInt(st.nextToken());
		int tempo2 = Integer.parseInt(st.nextToken());
		int tempo3 = Integer.parseInt(st.nextToken());
		System.out.println(tempo + " " + " " + tempo2 + " " + tempo3);

		// algo bem simple

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String linha = rd.readLine();

	}
}
