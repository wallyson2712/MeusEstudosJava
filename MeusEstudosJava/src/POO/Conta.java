package POO;

public class Conta {

	private static double salario;
	private double limite;
	private int numero;

	Conta(int numero) {

		this.numero = numero;

	}

	public double getSalario() {
		return salario;

	}

	public void setSalario(double salario) {
		this.salario = salario;

	}

}
