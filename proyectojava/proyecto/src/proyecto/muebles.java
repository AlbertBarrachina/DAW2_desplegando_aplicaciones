package proyecto;

/**
 * La clase Muebles representa un objeto que modela las características de un
 * mueble, incluyendo su color, dimensiones y peso.
 *
 * Esta clase permite la creación y manipulación de objetos Muebles, con métodos
 * para acceder y modificar sus atributos, así como para realizar operaciones
 * relacionadas con el mueble, como pesar, medir y pintar.
 *
 * @version 1.0
 * @since 2023-10-18
 */
public class muebles {

	private String color;
	private int altura, ancho, peso;

	/**
	 * Constructor de la clase Muebles.
	 *
	 * @param color  El color del mueble.
	 * @param altura La altura del mueble en centímetros.
	 * @param ancho  El ancho del mueble en centímetros.
	 * @param peso   El peso del mueble en kilogramos.
	 */
	public muebles(String color, int altura, int ancho, int peso) {
		this.color = color;
		this.altura = altura;
		this.ancho = ancho;
		this.peso = peso;
	}

	/**
	 * Obtiene el color del mueble.
	 *
	 * @return El color del mueble.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Establece el color del mueble.
	 *
	 * @param color El nuevo color del mueble.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Obtiene la altura del mueble.
	 *
	 * @return La altura del mueble en centímetros.
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * Establece la altura del mueble.
	 *
	 * @param altura La nueva altura del mueble en centímetros.
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * Obtiene el ancho del mueble.
	 *
	 * @return El ancho del mueble en centímetros.
	 */
	public int getAncho() {
		return ancho;
	}

	/**
	 * Establece el ancho del mueble.
	 *
	 * @param ancho El nuevo ancho del mueble en centímetros.
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**
	 * Obtiene el peso del mueble.
	 *
	 * @return El peso del mueble en kilogramos.
	 */

	public int getPeso() {
		return peso;
	}

	/**
	 * Establece el peso del mueble.
	 *
	 * @param peso El nuevo peso del mueble en kilogramos.
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * Muestra el peso del mueble.
	 *
	 */
	public void pesarMueble() {
		System.out.println("El mueble pesa " + this.getPeso() + " kg.");
	}

	/**
	 * Muestra las dimensiones del mueble (altura y ancho).
	 *
	 */
	public void medirMueble() {
		System.out.println("El mueble mide " + this.getAltura() + " cm de alto y " + this.getAncho() + " cm de ancho.");
	}

	/**
	 * Pinta el mueble con un nuevo color.
	 *
	 * @param color El nuevo color del mueble.
	 */
	public void pintarMueble(String color) {
		this.setColor(color);
		System.out.println("El mueble ahora es de color " + this.getColor() + ".");
	}
}
