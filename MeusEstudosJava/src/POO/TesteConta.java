package POO;

public class TesteConta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Conta conta = new Conta(12345);
		conta.setSalario(1000);
		System.out.println(conta.getSalario());
	}
}
