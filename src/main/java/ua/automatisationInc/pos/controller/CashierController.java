package ua.automatisationInc.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.automatisationInc.pos.services.CashierService;

/**
 * Created by Man on 21.03.2017.
 */
@Controller
@RequestMapping("/cashier")
public class CashierController {
    @Autowired
    private CashierService cashierService;

    @RequestMapping(method = RequestMethod.GET)
    public String getCashier(Model model) {
        return "cashier";
    }
}
