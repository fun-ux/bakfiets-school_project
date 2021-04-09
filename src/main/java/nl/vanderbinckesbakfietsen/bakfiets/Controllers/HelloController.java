package nl.vanderbinckesbakfietsen.bakfiets.Controllers;

import nl.vanderbinckesbakfietsen.bakfiets.Models.Products.ResultForm;
import nl.vanderbinckesbakfietsen.bakfiets.Service.Products.HuurTariefService;
import nl.vanderbinckesbakfietsen.bakfiets.Service.Products.OptionalsService;
import nl.vanderbinckesbakfietsen.bakfiets.Service.Products.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @Autowired
    private ProductService productservice;

    @Autowired
    private HuurTariefService huurTariefService;

    @Autowired
    private OptionalsService optionalsService;

    @GetMapping("/huur-bakfiets")
    public String handle(Model model) {


        model.addAttribute("huur", huurTariefService.findAll());
        model.addAttribute("bakfiets", productservice.findAll());
        model.addAttribute("options", optionalsService.findAll());


        model.addAttribute("form", new ResultForm());

        return "huur-bakfiets";
    }

    @GetMapping("/")
    public String handle_home(Model model) {


       /* model.addAttribute("huur", huurTariefService.findAll());
        model.addAttribute("bakfiets", productservice.findAll());
        model.addAttribute("options", optionalsService.findAll());


        model.addAttribute("form", new ResultForm());*/

        return "index";
    }
}