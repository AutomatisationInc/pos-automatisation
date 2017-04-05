package ua.automatisationInc.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.automatisationInc.pos.models.Dish;
import ua.automatisationInc.pos.models.Ingredient;
import ua.automatisationInc.pos.services.AdministratorService;

import java.util.List;

/**
 * Created by PavelGrudina on 05.04.2017.
 */
@Controller
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @RequestMapping(path = "/administrator", method = RequestMethod.GET)
    public String getAdminPage (Model model){
        List<Ingredient> ingredientList = administratorService.getAllIngredients();
        model.addAttribute("ingredientList", ingredientList);
        List<Dish> dishList = administratorService.getAllDishes();
        model.addAttribute("dishList", dishList);
        return "/administrator";
    }
}
