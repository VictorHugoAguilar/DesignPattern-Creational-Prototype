package prototypeCloneable;

import java.util.HashMap;

/**
 * La clase encargada de generar objetos a partir de los prototipos
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class FactoriaPrototipo {
	private HashMap<String, IProducto> mapaObjetos;
	private String nombrePorDefecto;

	public FactoriaPrototipo() {
		mapaObjetos = new HashMap<String, IProducto>();
		// Se incluyen en el mapa todos los productos prototipo
		mapaObjetos.put("producto 1", new UnProducto(1));
	}

	public Object create() {
		return create(nombrePorDefecto);
	}

	public Object create(String nombre) {
		nombrePorDefecto = nombre;
		IProducto objeto = (IProducto) mapaObjetos.get(nombre);
		return objeto != null ? objeto.clone() : null;
	}
}
