package nl.vanderbinckesbakfietsen.bakfiets;

import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.HuurtariefRepository;
import nl.vanderbinckesbakfietsen.bakfiets.Service.Products.HuurTariefService;
import nl.vanderbinckesbakfietsen.bakfiets.Service.Products.OptionalsService;
import nl.vanderbinckesbakfietsen.bakfiets.Service.Products.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BakfietsSem1SchoolprojectApplication {

    private static final Logger log = LoggerFactory.getLogger(BakfietsSem1SchoolprojectApplication.
            class);

    /*@Autowired
    private static ProductService service;*/

    public static void main(String[] args) throws Exception {

        SpringApplication.run(BakfietsSem1SchoolprojectApplication.class, args);
        //run();
    }

    @Bean
    CommandLineRunner start(ProductService service, HuurTariefService huurService, OptionalsService optionalService){
        return args -> {
            log.info("@@ Inserting Data....");
            service.insertData();
            huurService.insertData();
            optionalService.insertData();
            log.info("@@ findAll() call...");
            service.findAll().forEach(entry -> log.info(entry.toString()));
            huurService.findAll().forEach(entry -> log.info(entry.toString()));
            optionalService.findAll().forEach(entry -> log.info(entry.toString()));

        };
    }
}
