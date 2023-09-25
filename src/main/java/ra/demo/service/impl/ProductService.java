package ra.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.demo.model.Product;
import ra.demo.repository.IProductRepository;
import ra.demo.service.IProductService;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> joinCatalog() {
        return productRepository.joinCatalog();
    }
}
