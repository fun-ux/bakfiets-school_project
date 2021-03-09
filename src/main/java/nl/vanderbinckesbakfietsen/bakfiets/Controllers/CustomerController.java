package nl.vanderbinckesbakfietsen.bakfiets.Controllers;

import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.Huurtarief;
import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.Optionals;
import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.Product;
import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.ResultForm;
import nl.vanderbinckesbakfietsen.bakfiets.Service.Products.HuurTariefService;
import nl.vanderbinckesbakfietsen.bakfiets.Service.Products.OptionalsService;
import nl.vanderbinckesbakfietsen.bakfiets.Service.Products.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {


    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private ProductService productservice;

    @Autowired
    private HuurTariefService huurTariefService;

    @Autowired
    private OptionalsService optionalsService;

    public CustomerController() {}

    //products
    @GetMapping("/listproducts")
    public Iterable<Product> getProducts() {
        return productservice.findAll();
    }

    //huurtarieven
    @GetMapping("/list_tarieven")
    public Iterable<Huurtarief> getTarieven() {
        return huurTariefService.findAll();
    }


    @GetMapping("/product/{id}")
    public List<Object> getProductById(@PathVariable("id") int productid){
        List<Object> form = new ArrayList<>();
        Product product = productservice.findProductbyid(productid);
        if(product == null){
            return null;
        }
        else{
            form.add(product);
        }
        return form;
    }

    @PostMapping("/save_calc")
    public ModelAndView getProductByNaam(@ModelAttribute ResultForm resultForm, ModelAndView model){

        List<Optionals> optionals = new ArrayList<>();


        //model.addObject("form", resultForm);
        model.setViewName("result");


        Double calculatie = 0.00;



        if(resultForm.getHuur_dagen() != null){
            Huurtarief huurtarief = huurTariefService.findHuurbydag(Integer.parseInt(resultForm.getHuur_dagen()));
            calculatie += huurtarief.getHuurprijs();
            model.addObject("huur", huurtarief);

        }

        if(resultForm.getType_bakfiets() != null){
            Product bakfiets = productservice.findProductbyName(resultForm.getType_bakfiets());
            calculatie += bakfiets.getPrijs();
            model.addObject("bakfiets", bakfiets);

        }

        if(resultForm.getOptional_1() != null){
            Optionals optie1 = optionalsService.findProductbyName(resultForm.getOptional_1());
            calculatie += optie1.getPrijs();
            optionals.add(optie1);
        }

        if(resultForm.getOptional_2() != null){
            Optionals optie2 = optionalsService.findProductbyName(resultForm.getOptional_2());
            calculatie += optie2.getPrijs();
            optionals.add(optie2);
        }

        if(resultForm.getOptional_3() != null){
            Optionals optie3 = optionalsService.findProductbyName(resultForm.getOptional_3());
            calculatie += optie3.getPrijs();
            optionals.add(optie3);
        }


        if(resultForm.getOptional_4() != null){
            Optionals optie4 = optionalsService.findProductbyName(resultForm.getOptional_4());
            calculatie += optie4.getPrijs();
            optionals.add(optie4);
        }

        if(resultForm.getOptional_5() != null){
            Optionals optie5 = optionalsService.findProductbyName(resultForm.getOptional_5());
            calculatie += optie5.getPrijs();
            optionals.add(optie5);
        }

        model.addObject("options", optionals);

        //System.out.println(optionals);

        //logger.info(String.valueOf(calculatie));

        model.addObject("calculatie", calculatie);

        //System.out.println(calculatie);
        return model;

    }



}
