package banco;

/**
 * clase para crear objetos de tipo cliente.
 * @author paco.
 *@version 1/2022
 */
public class Cliente {

	private String dni;
	private String nombre;
	private String direccion;

	/**
	 * constructor vacio.
	 */
	public Cliente() {
		dni= ""; //atributo dni.
		nombre = "";
		direccion="";	

	}
	/**
	 * constructor por par�metros.
	 * @param dni.
	 * @param nombre.
	 * @param direccion.
	 */
	public Cliente(String dni, String nombre, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	/**
	 * m�todo get del atributo dni.
	 * @return devuelve el valor del atributo dni.
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * M�todo set del atributo dni.
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * m�todo get del atributo nombre.
	 * @return devuelve el valor del atributo nombre.
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * M�todo set del atributo nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * M�todo get del atributo direcci�n.
	 * @return devuelve el valor del atributo direcci�n
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * M�todo set del atributo direcci�n.
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


}