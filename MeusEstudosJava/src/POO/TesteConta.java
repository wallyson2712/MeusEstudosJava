package POO;

public class TesteConta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Conta conta = new Conta(12345);
		conta.setSalario(1000);
		System.out.println(conta.getSalario());

		int nome[] = new int[2];

		for (int i = 0; i < nome.length; i++) {

			System.out.println(nome[i]);
		}

		// foreach usando
		for (int nomes : nome) {

			System.out.println(nomes);
		}

		String nomes = "wallyson batista sampaio";

		char[] array = nomes.toCharArray();
	}
}
