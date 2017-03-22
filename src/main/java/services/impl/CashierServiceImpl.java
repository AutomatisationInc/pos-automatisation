package services.impl;

import dao.BillDao;
import dao.DishDao;
import dao.IngredientDao;
import models.Bill;
import models.Dish;
import models.DishType;
import services.CashierService;

import javax.xml.ws.ServiceMode;
import java.util.Date;
import java.util.List;

/**
 * Created by Евгений on 20.03.2017.
 */
public class CashierServiceImpl implements CashierService {
    private BillDao billDao;
    private DishDao dishDao;
    private IngredientDao ingredientDao;

    public CashierServiceImpl(BillDao billDao, DishDao dishDao, IngredientDao ingredientDao) {
        this.billDao = billDao;
        this.dishDao = dishDao;
        this.ingredientDao = ingredientDao;
    }

    public CashierServiceImpl() {
    }

    @Override
    public Dish addDishToBill(long billId, Dish dish) {

        Bill bill = billDao.findById(billId);
        bill.getDishList().add(dish);
        billDao.update(bill);
        return dish;
    }

    @Override
    public void deleteDishFromBill(long billId, Dish dish) {

      Bill bill = billDao.findById(billId);
      bill.getDishList().remove(dish);
      billDao.update(bill);
    }

    @Override
    public void cleanBill(long id) {
        Bill bill = billDao.findById(id);
        bill.getDishList().clear();
        bill.setBonus(0);
        bill.setComment("");
        bill.setPrice(0);
        billDao.update(bill);
    }

    @Override
    public double setBonus(int percent) {
        return 0;
    }

    @Override
    public double setBonus(double amount) {
        return 0;
    }

    @Override
    public String setComment(String comment) {
        return null;
    }

    @Override
    public Bill getBill(long billId) {
        return null;
    }

    @Override
    public List<Bill> getAllBillsByToDay(Date date) {
        return null;
    }

    @Override
    public void postToKitchen(Bill bill) {

    }

    @Override
    public List<Bill> divideBill(Bill bill) {
        return null;
    }

    @Override
    public List<Dish> getDishesByType(DishType type) {
        return null;
    }

    @Override
    public List<DishType> getTypes() {
        return null;
    }
}
