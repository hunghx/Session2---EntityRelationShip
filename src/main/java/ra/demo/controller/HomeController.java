package ra.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ra.demo.model.Catalog;
import ra.demo.model.Product;
import ra.demo.service.ICatalogService;
import ra.demo.service.IProductService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private ICatalogService catalogService;
    @Autowired
    private IProductService productService;

    @GetMapping
    public ResponseEntity<?> getAll(){
        List<Product> products = productService.joinCatalog();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        catalogService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<?> add(){
//        Product product = new Product(null,"áo dài",1000,"dsjdjs",null);
//        Catalog catalog = new Catalog(null,"Áo",new ArrayList<>());
//        product.setCatalog(catalog);
//        catalog.getProductList().add(product);
//        catalogService.save(catalog);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
