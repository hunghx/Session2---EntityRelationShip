package ra.demo.service;

import ra.demo.model.Product;

import java.util.List;

public interface IProductService extends IGenericService<Product,Long> {
List<Product> joinCatalog();
}
