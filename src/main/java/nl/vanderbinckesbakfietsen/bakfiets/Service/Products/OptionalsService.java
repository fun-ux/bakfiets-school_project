package nl.vanderbinckesbakfietsen.bakfiets.Service.Products;

import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.Optionals;
import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.OptionalsRepository;
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


        optionalsRepository.save(new Optionals("Smart phone houder",3.50,"","optional_1", "https://assets.website-files.com/6069bb84af95c28548254801/606a82e98b6c203104d7740d_ujr2vhw6.png"));
        optionalsRepository.save(new Optionals("Regen- of zonnedak",10.00,"","optional_2", "https://assets.website-files.com/6069bb84af95c28548254801/606a82d458182515e982a17f_barsa9ty.png"));
        optionalsRepository.save(new Optionals("Babystoeltje",4.00,"","optional_3", "https://assets.website-files.com/6069bb84af95c28548254801/606a82d7e139de64f471098c_ID9rs08vld.png"));
        optionalsRepository.save(new Optionals("Kaarthouder",3.00,"","optional_4", "https://assets.website-files.com/6069bb84af95c28548254801/606a82d35818256c3782a17e_ID8nch7pw8.png"));
        optionalsRepository.save(new Optionals("Helm",3.00,"","optional_5", "https://assets.website-files.com/6069bb84af95c28548254801/606a82d205ece06f96e1e80f_ID2sokcbqm.png"));



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
