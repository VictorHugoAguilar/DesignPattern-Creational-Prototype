package prototype.impl;

import java.util.HashMap;

/**
 * Esta clase sigue el patron de diseñó Factory, la utilizaremos para delegarle
 * la responsabilidad de crear los prototipos que tendríamos que hacer nosotros
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
@SuppressWarnings("rawtypes")
public class PrototypeFactory {

	private static HashMap<String, IPrototype> prototypes = new HashMap<>();

	public static IPrototype getPrototype(String prototypeName) {
		return prototypes.get(prototypeName).deepClone();
	}

	public static void addPrototype(String prototypeName, IPrototype prototype) {
		prototypes.put(prototypeName, prototype);
	}

}
