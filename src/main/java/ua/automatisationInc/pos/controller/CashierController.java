package ua.automatisationInc.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.automatisationInc.pos.models.enums.DishType;
import ua.automatisationInc.pos.services.CashierService;

import java.util.List;

/**
 * Created by Man on 21.03.2017.
 */
@Controller
@RequestMapping("") // В jsp должна быть папка cashier, в которой будут 2 jsp: с выбранным типом блюда и без.
public class CashierController {
    @Autowired
    private CashierService cashierService;

    @RequestMapping(path = "/cashier", method = RequestMethod.GET)
    public String getCashierPage(Model model) {
        List<DishType> dishTypes = cashierService.getDishTypes();
        model.addAttribute("dishTypes", dishTypes);
        return "/cashier";
    }

}
