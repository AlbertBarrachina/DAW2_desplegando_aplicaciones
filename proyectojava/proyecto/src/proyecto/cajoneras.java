package proyecto;

/**
 * La clase Cajoneras representa un tipo de mueble que hereda las
 * características de la clase Muebles e incluye atributos adicionales como la
 * cantidad de cajones y la cantidad de ladrillos que se pueden guardar en
 * ellos.
 *
 * @version 1.0
 * @since 2023-10-18
 */
public class cajoneras extends muebles {
	private int cajones, ladrillos;

	/**
	 * Constructor de la clase Cajoneras que permite crear una cajonera con
	 * atributos iniciales.
	 *
	 * @param color   El color de la cajonera.
	 * @param altura  La altura de la cajonera en centímetros.
	 * @param ancho   El ancho de la cajonera en centímetros.
	 * @param peso    El peso de la cajonera en kilogramos.
	 * @param cajones La cantidad de cajones en la cajonera.
	 */
	public cajoneras(String color, int altura, int ancho, int peso, int cajones) {
		super(color, altura, ancho, peso);
		this.cajones = cajones;
		this.ladrillos = 0;
	}

	/**
	 * Obtiene la cantidad de cajones en la cajonera.
	 *
	 * @return La cantidad de cajones como un entero.
	 */
	public int getCajones() {
		return this.cajones;
	}

	/**
	 * Establece la cantidad de cajones en la cajonera.
	 *
	 * @param cajones La nueva cantidad de cajones en la cajonera.
	 */
	public void setCajones(int cajones) {
		this.cajones = cajones;
	}

	/**
	 * Obtiene la cantidad de ladrillos guardados en la cajonera.
	 *
	 * @return La cantidad de ladrillos como un entero.
	 */
	public int getLadrillos() {
		return this.ladrillos;
	}

	/**
	 * Establece la cantidad de ladrillos guardados en la cajonera.
	 *
	 * @param ladrillos La nueva cantidad de ladrillos en la cajonera.
	 */
	public void setLadrillos(int ladrillos) {
		this.ladrillos = ladrillos;
	}

	/**
	 * Añade ladrillos a los cajones de la cajonera.
	 *
	 * @param ladrillos La cantidad de ladrillos a añadir.
	 */

	public void llenarCajones(int ladrillos) {
		this.ladrillos = this.ladrillos + ladrillos;
		System.out.println("Has guardado" + ladrillos + " ladrillos en los cajones.");
	}

	/**
     * Mira cuántos ladrillos tienes guardados en los cajones de la cajonera.
     *
     * @return La cantidad de ladrillos guardados como un entero.
     */
	public void mirarCajones() {
		System.out.println("Hay " + getLadrillos() + " ladrillos en los cajones.");
	}
}
