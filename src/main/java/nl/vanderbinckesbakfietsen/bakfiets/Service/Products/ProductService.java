package nl.vanderbinckesbakfietsen.bakfiets.Service.Products;

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
        productRepository.save(new Product("Normale bakfiets (2 persoons)",60.00,"","Normaal_Bakfiets","slide", "https://assets.website-files.com/6069bb84af95c28548254801/606a1f1a35ae6e846aaba269_testsqwe.jpg"));
        productRepository.save(new Product("Grote bakfiets (4 persoons)",80.00,"","Groot_bakfiets", "slide-2","https://assets.website-files.com/6069bb84af95c28548254801/606a1f1a9386fcd83bb0add5_qweqwe.jpg"));
        productRepository.save(new Product("Luxe bakfiets (4 persoons)",100.00,"","Luxe_Bakfiets","slide-3", "https://assets.website-files.com/6069bb84af95c28548254801/606a1f19a7e7820ea7349d7f_external-content.duckduckgo.com.jpg"));





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
