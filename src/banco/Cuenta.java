package banco;
/**
 * clase para crear objetos de tipo banco
 * @author paco
 *@version 1/2022
 */
public class Cuenta {


	private int numero_de_cuenta;

	private int saldo;

	private Cliente cliente;

	/**
	 * Constructor vacio.
	 */
	public Cuenta() {

		numero_de_cuenta=0;

		saldo=0;

		cliente= new Cliente();

	}
	/**
	 * Contructor por par�metros.
	 * @param numero_de_cuenta
	 * @param saldo
	 * @param cliente
	 */
	public Cuenta(int numero_de_cuenta, int saldo, Cliente cliente) {
		this.numero_de_cuenta = numero_de_cuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	/**
	 * M�todo get del atributo cuenta
	 * @return devuelve el valor del atributo cuenta.
	 */
	public int getNumero_de_cuenta() {
		return numero_de_cuenta;
	}
	/**
	 * M�todo set del atributo cuenta.
	 * @param numero_de_cuenta
	 */
	public void setNumero_de_cuenta(int numero_de_cuenta) {
		this.numero_de_cuenta = numero_de_cuenta;
	}
/**
 * M�todo get del atributo saldo.
 * @return devuelve el valor del atributo saldo.
 */
	public int getSaldo() {
		return saldo;
	}
/**
 * M�todo set del atributo saldo.
 * @param saldo
 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
/**
 * M�todo get del atributo cliente.
 * @return devuelve el valor del atributo cliente
 */
	public Cliente getCliente() {
		return cliente;
	}
/**
 * m�todo set del atributo cliente.
 * @param cliente
 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
