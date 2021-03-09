package nl.vanderbinckesbakfietsen.bakfiets.Service.Products;

import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.Huurtarief;
import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.HuurtariefRepository;
import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuurTariefService {
    private static final Logger log = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private HuurtariefRepository huurtariefRepository;

    public void insertData(){

        huurtariefRepository.save(new Huurtarief(1, 30.00));
        huurtariefRepository.save(new Huurtarief(2, 55.00));
        huurtariefRepository.save(new Huurtarief(3, 100.00));
        huurtariefRepository.save(new Huurtarief(4, 120.00));
        huurtariefRepository.save(new Huurtarief(5, 150.00));
        huurtariefRepository.save(new Huurtarief(6, 175.00));
        huurtariefRepository.save(new Huurtarief(7, 205.00));
        huurtariefRepository.save(new Huurtarief(8, 225.00));
        huurtariefRepository.save(new Huurtarief(9, 250.00));
        huurtariefRepository.save(new Huurtarief(10, 280.00));


    }

    public List<Huurtarief> findAll(){
        return huurtariefRepository.findAll();
    }

    public Huurtarief findHuurbydag(int Dagen){
        return huurtariefRepository.findByDag(Dagen);
    }

    public Huurtarief findHuurTariefbyid(int id){
        return huurtariefRepository.findById(id);
    }
}
