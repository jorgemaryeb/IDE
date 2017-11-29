/**
 * Clase que proporciona métodos relacionados con cálculos sobre un péndulo.
 * @author Jorge
 * @version 1.0 
 */

public class Pendulo {
	/**
	 * Constante que representa la aceleración de la gravedad terrestre
	 */
	public static final double GRAVEDAD = 9.8;
	/**
	 * Método que calcula el periodo del péndulo
	 * @param longitud que es la longitud de dicho péndulo
	 * @return double representando el periodo de oscilación
	 */
	public static double calcularPeriodo(double longitud) {
		
		return 2 * Math.PI * Math.sqrt(longitud/GRAVEDAD);
	}
}