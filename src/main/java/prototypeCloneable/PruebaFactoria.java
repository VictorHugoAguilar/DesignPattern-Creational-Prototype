package prototypeCloneable;

/**
 * Clase de Prueba de la factoría
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class PruebaFactoria {
	public static void main(String[] args) {
		FactoriaPrototipo factoria = new FactoriaPrototipo();
		IProducto producto = (IProducto) factoria.create("producto 1");
		System.out.println("Este es el objeto creado: " + producto);
	}
}
