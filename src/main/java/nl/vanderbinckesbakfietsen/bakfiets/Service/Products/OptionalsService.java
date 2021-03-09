package nl.vanderbinckesbakfietsen.bakfiets.Service.Products;

import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.Optionals;
import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.OptionalsRepository;
import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.Product;
import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionalsService {
    private static final Logger log = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private OptionalsRepository optionalsRepository;

    public void insertData(){


        optionalsRepository.save(new Optionals("Smart phone houder",3.50,"","optional_1"));
        optionalsRepository.save(new Optionals("Regen- of zonnedak",10.00,"","optional_2"));
        optionalsRepository.save(new Optionals("Babystoeltje",4.00,"","optional_3"));
        optionalsRepository.save(new Optionals("Kaarthouder",3.00,"","optional_4"));
        optionalsRepository.save(new Optionals("Helm",3.00,"","optional_5"));



    }
    public List<Optionals> findAll(){
        return optionalsRepository.findAll();
    }


    public Optionals findProductbyid(int id){
        return optionalsRepository.findById(id);
    }

    public Optionals findProductbyName(String Naam){
        return optionalsRepository.findByNaam(Naam);
    }
}
