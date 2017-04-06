package ua.automatisationInc.pos.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.automatisationInc.pos.dao.BillDao;
import ua.automatisationInc.pos.dao.DishDao;
import ua.automatisationInc.pos.dao.IngredientDao;
import ua.automatisationInc.pos.models.Dish;
import ua.automatisationInc.pos.models.Ingredient;
import ua.automatisationInc.pos.services.AdministratorService;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by PavelGrudina on 05.04.2017.
 */
@Service
@Transactional(readOnly = true)
public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    private DishDao dishDao;
    @Autowired
    private IngredientDao ingredientDao;
    @Autowired
    private BillDao billDao;


    @Override
    @Transactional
    public List<Ingredient> getAllIngredients() {
        return null;
    }

    @Override
    @Transactional
    public List<Dish> getAllDishes() {
        return null;
    }

    @Override
    @Transactional
    public String getIngredientStatus(Ingredient ingredient) {
        return null;
    }

    @Override
    @Transactional
    public Ingredient saveIngredient(Ingredient ingredient) {
        return null;
    }

    @Override
    @Transactional
    public void deleteIngredientById(long id) {

    }

    @Override
    @Transactional
    public Dish saveDish(Dish dish) {
        return null;
    }

    @Override
    @Transactional
    public void deleteDishById(long id) {

    }

    @Override
    @Transactional
    public double billSumByDate(LocalDate date) {
        return 0;
    }
}
