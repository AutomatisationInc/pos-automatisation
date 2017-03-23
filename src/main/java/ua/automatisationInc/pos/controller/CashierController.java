package ua.automatisationInc.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.automatisationInc.pos.models.enums.DishType;
import ua.automatisationInc.pos.services.CashierService;

/**
 * Created by Man on 21.03.2017.
 */
@Controller
@RequestMapping("") // В jsp должна быть папка cashier, в которой будут 2 jsp: с выбранным типом блюда и без.
public class CashierController {
    @Autowired
    private CashierService cashierService;

    @RequestMapping(path = "/cashier", method = RequestMethod.GET)
    public String getCashierPage(@RequestParam(name = "dishType", required = false) String dishType, Model model) {
        model.addAttribute("dishTypes", cashierService.getDishTypes());
        if (dishType != null) {
            model.addAttribute("DishesByType", cashierService.getDishesByType(DishType.valueOf(dishType)));
            return "cashier/some-type";
        } else {
            return "cashier";
        }
    }

}
