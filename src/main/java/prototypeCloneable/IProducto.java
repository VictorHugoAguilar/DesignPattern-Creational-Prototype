package prototypeCloneable;

/**
 * Los productos deben implementar esta interface
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public interface IProducto extends Cloneable {
	Object clone();
	// Aquí van todas las operaciones comunes a los productos que genera la factoría
}
