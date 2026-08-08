package interfacepack;

import entity.Product;

public interface Searchable {
    Product searchProduct(String keyword);
    Product searchProduct(String name, String category);
    Product searchProduct(double minPrice, double maxPrice);
}
