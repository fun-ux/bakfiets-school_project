package nl.vanderbinckesbakfietsen.bakfiets.Service.Products;

import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.Huurtarief;
import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.Product;
import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private static final Logger log = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private ProductRepository productRepository;

    public void insertData(){
        productRepository.save(new Product("Normale bakfiets (2 persoons)",60.00,""));
        productRepository.save(new Product("Grote bakfiets (4 persoons)",80.00,""));
        productRepository.save(new Product("Luxe bakfiets (4 persoons)",100.00,""));





    }
    public List<Product> findAll(){
        return productRepository.findAll();
    }


    public Product findProductbyid(int id){
        return productRepository.findById(id);
    }

    public Product findProductbyName(String Naam){
        return productRepository.findByNaam(Naam);
    }

}
