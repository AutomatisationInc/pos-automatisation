package services.impl;

import dao.BillDao;
import dao.DishDao;
import dao.IngredientDao;
import models.Bill;
import services.CashierService;
import services.KitchenService;

import java.util.List;

/**
 * Created by Евгений on 20.03.2017.
 */
public class KitchenServiceImpl implements KitchenService {

    private BillDao billDao;
    private DishDao dishDao;
    private IngredientDao ingredientDao;
    private CashierService cashierService;

    public KitchenServiceImpl() {
    }

    public KitchenServiceImpl(BillDao billDao, DishDao dishDao, IngredientDao ingredientDao, CashierService cashierService) {
        this.billDao = billDao;
        this.dishDao = dishDao;
        this.ingredientDao = ingredientDao;
        this.cashierService = cashierService;
    }

    @Override
    public Bill showOrder(long id) {
        Bill bill = billDao.findById(id);
        return bill;
    }
}
