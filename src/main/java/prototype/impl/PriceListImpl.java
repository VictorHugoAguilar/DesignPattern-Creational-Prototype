package prototype.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase será la implementación de una lista de precios, lo primero que
 * podemos obsevar es que la clase implementa IPrototype y con ello los métodos
 * clone u deppClone que nos servirán para hacer la clonación de la lista de
 * precio.
 * 
 * El método clonar únicamente clona la lista de precios pero no todos los
 * productos no son clonados y son compartidos con la lista de precios original.
 * El método deepClone por otra parte realiza una clonación en profundidad
 * incluyendo a los productos asociados.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class PriceListImpl implements IPrototype<PriceListImpl> {

	private String listName;
	private List<ProductItem> products = new ArrayList<>();

	public PriceListImpl(String listName) {
		this.listName = listName;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public List<ProductItem> getProducts() {
		return products;
	}

	public void setProducts(List<ProductItem> products) {
		this.products = products;
	}

	public void addProducts(ProductItem item) {
		products.add(item);
	}

	@Override
	public PriceListImpl clonar() {
		PriceListImpl clone = new PriceListImpl(listName);
		clone.setProducts(products);
		return clone;
	}

	@Override
	public PriceListImpl deepClone() {
		List<ProductItem> cloneProducts = new ArrayList<ProductItem>();
		for (ProductItem item : this.products) {
			ProductItem cloneItem = item.clonar();
			cloneProducts.add(cloneItem);
		}
		PriceListImpl clone = new PriceListImpl(listName);
		clone.setProducts(cloneProducts);
		return clone;
	}

	@Override
	public String toString() {
		String items = "";
		for (ProductItem item : this.products) {
			items += "\t" + item.toString() + "\n";
		}
		return "PriceListImple{listName= " + listName + ", products=\n" + items + "}";
	}

}
