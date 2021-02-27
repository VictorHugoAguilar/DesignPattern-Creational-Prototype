package prototype;

import prototype.impl.PriceListImpl;
import prototype.impl.ProductItem;
import prototype.impl.PrototypeFactory;

/**
 * Clase de prueba de la clonacion de objetos.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class PrototypeMain {

	public static void main(String[] args) {

		PriceListImpl standarPriceList = new PriceListImpl("Standar Price List");
		for (int c = 1; c <= 5; c++) {
			ProductItem item = new ProductItem("Product " + c, c * 2);
			standarPriceList.addProducts(item);
		}
		PrototypeFactory.addPrototype(standarPriceList.getListName(), standarPriceList);
		System.out.println(standarPriceList);

		PriceListImpl wholessalesPriceList = (PriceListImpl) PrototypeFactory.getPrototype("Standar Price List");
		wholessalesPriceList.setListName("Whosale Price List");
		for (ProductItem item : wholessalesPriceList.getProducts()) {
			item.setPrice(item.getPrice() * 0.9);
		}
		PrototypeFactory.addPrototype(wholessalesPriceList.getListName(), wholessalesPriceList);
		System.out.println(wholessalesPriceList);

		PriceListImpl vipPriceList = (PriceListImpl) PrototypeFactory.getPrototype("Whosale Price List");
		vipPriceList.setListName("VIP Price List");
		for (ProductItem item : vipPriceList.getProducts()) {
			item.setPrice(item.getPrice() * 0.9);
		}
		System.out.println(vipPriceList);

	}
}
