package ua.automatisationInc.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.automatisationInc.pos.models.Bill;
import ua.automatisationInc.pos.models.Dish;
import ua.automatisationInc.pos.models.Ingredient;
import ua.automatisationInc.pos.services.AdministratorService;
import ua.automatisationInc.pos.services.CashierService;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by PavelGrudina on 05.04.2017.
 */
@Controller
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;
    @Autowired
    private CashierService cashierService;


    @RequestMapping(path = "/administrator", method = RequestMethod.GET)
    public String getAdminPage(Model model) {
        List<Ingredient> ingredientList = administratorService.getAllIngredients();
        model.addAttribute("administratorService", administratorService);
        model.addAttribute("ingredientList", ingredientList);
        List<Dish> dishList = administratorService.getAllDishes();
        model.addAttribute("dishList", dishList);
        List<Bill> billList = administratorService.getAllBills();
        model.addAttribute("billList", billList);
        model.addAttribute("dateNow", LocalDate.now());
        return "/administrator";
    }

    @RequestMapping(path = "/ingredient", method = RequestMethod.GET)
    public String getIngredientEdit(@RequestParam(name = "ingredientId") String ingredientId, Model model) {
        Ingredient ingredient = administratorService.findById(Long.parseLong(ingredientId));
        model.addAttribute("ingredient", ingredient);
        return "/ingredient";
    }

    @RequestMapping(path = "/ingredient", method = RequestMethod.POST)
    public String edit(@ModelAttribute Ingredient ingredient) {
        administratorService.saveIngredient(ingredient);
        return "redirect:/administrator";
    }


    @RequestMapping(path = "/dish", method = RequestMethod.GET)
    public String getDishEdit(@RequestParam(name = "dishId") String dishId, Model model) {
        Dish dish = cashierService.getDishById(Long.parseLong(dishId));
        model.addAttribute("dish", dish);
        return "/dish";
    }

    @RequestMapping (path = "/dish", method = RequestMethod.POST)
    public String edit (@ModelAttribute Dish dish) {
        administratorService.saveDish(dish);
        return "redirect:/administrator";
    }

}
