package prototype.impl;

/**
 * Esta interface que definiremos nos servirá como base para crear todos los
 * prototipos, se definen los métodos
 * 
 * clone: permite realizar una clonación superficial del prototipo
 * 
 * deepClone: permite realizar una clonacion profunda del prototipo
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 * @param <T>
 */

@SuppressWarnings("rawtypes")
public interface IPrototype<T extends IPrototype> extends Cloneable {

	public T clonar();
	public T deepClone();

}
