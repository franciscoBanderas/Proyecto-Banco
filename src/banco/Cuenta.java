package banco;

public class Cuenta {
	
	
	private int numero_de_cuenta;
	
	private int saldo;
	
	private Cliente cliente;
	
	public Cuenta() {
	
	numero_de_cuenta=0;
	
	saldo=0;
	
	cliente= new Cliente();

}

	public Cuenta(int numero_de_cuenta, int saldo, Cliente cliente) {
		this.numero_de_cuenta = numero_de_cuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public int getNumero_de_cuenta() {
		return numero_de_cuenta;
	}

	public void setNumero_de_cuenta(int numero_de_cuenta) {
		this.numero_de_cuenta = numero_de_cuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
