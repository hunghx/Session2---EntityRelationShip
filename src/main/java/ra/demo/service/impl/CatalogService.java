package ra.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.demo.model.Catalog;
import ra.demo.repository.ICatalogRepository;
import ra.demo.service.ICatalogService;

import java.util.List;
@Service
public class CatalogService implements ICatalogService {
    @Autowired
    private ICatalogRepository catalogRepository;
    @Override
    public List<Catalog> findAll() {
        return catalogRepository.findAll();
    }

    @Override
    public Catalog findById(Long id) {
        return catalogRepository.findById(id).orElse(null);
    }

    @Override
    public Catalog save(Catalog catalog) {
        return catalogRepository.save(catalog);
    }

    @Override
    public void delete(Long id) {
        catalogRepository.deleteById(id);
    }
}
