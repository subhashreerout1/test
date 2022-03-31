package helloworld.controller;
//added abc
import helloworld.model.Product;
import helloworld.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;
@RestController
public class ProductController {

   @Autowired
    private ProductRepository productRepository;

    @GetMapping("/getproducts")
    public List<Product> getProducts() {
        return (List<Product>) productRepository.findAll();
    }



    @GetMapping("/products")
    public Product createProduct() {
        Product product=new Product ();
        product.setProductName("abc");
        product.setDescription("hggjhff");
        return productRepository.save(product);
    }
/*
    @PutMapping("/products/{productId}")
    public Product updateProduct(@PathVariable Long productId,
                                   @RequestBody Product productRequest) {
        return productRepository.findById(productId)
                .map(product -> {
                    product.setProductName(productRequest.getProductName());
                    product.setDescription(productRequest.getDescription());
                    product.setPrice(productRequest.getPrice());
                    return productRepository.save(product);
                }).orElseThrow(() -> new ResourceNotFoundException("Product not found with id " + productId));
    }


    @DeleteMapping("/products/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long productId) {
        return productRepository.findById(productId)
                .map(product -> {
                    productRepository.delete(product);
                    return ResponseEntity.ok().build();
                }).orElseThrow(() -> new ResourceNotFoundException("Product not found with id " + productId));
    }*/
}
