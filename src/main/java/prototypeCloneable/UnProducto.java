package prototypeCloneable;

/**
 * Un ejemplo básico de producto
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class UnProducto implements IProducto {
	private int atributo;

	public UnProducto(int atributo) {
		this.atributo = atributo;
	}

	public Object clone() {
		return new UnProducto(this.atributo);
	}

	public String toString() {
		return ((Integer) atributo).toString();
	}
}
