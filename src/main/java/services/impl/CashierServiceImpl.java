package services.impl;

import dao.BillDao;
import dao.DishDao;
import dao.IngredientDao;
import models.Bill;
import models.Dish;
import models.Ingredient;
import models.enums.DishType;
import services.CashierService;

import javax.xml.ws.ServiceMode;
import java.util.Date;
import java.util.List;

/**
 * Created by Konstantin on 20.03.2017.
 */
public class CashierServiceImpl implements CashierService {
    private DishDao dishDao;
    private IngredientDao ingredientDao;
    private BillDao billDao;

    public CashierServiceImpl(DishDao dishDao, IngredientDao ingredientDao, BillDao billDao) {
        this.dishDao = dishDao;
        this.ingredientDao = ingredientDao;
        this.billDao = billDao;
    }

    @Override
    public Bill createBill() {
        Bill bill = new Bill();
        return bill;
    }

    @Override
    public Dish addDishToBill(long billId, Dish dish) {
        return null;
    }

    @Override
    public void deleteDishFromBill(long billId, Dish dish) {

    }

    @Override
    public void cleanBill(long id) {

    }

    @Override
    public double setBonus(long billId, int percent) {
        Bill bill = billDao.findById(billId);
        double bonus = bill.getPrice() * percent/100;
        return bonus;
    }

    @Override
    public double setBonus(long billId, double amount) {
        Bill bill = billDao.findById(billId);
        bill.setBonus(amount);
        return amount;
    }

    @Override
    public String setComment(long billId, String comment) {
        Bill bill = billDao.findById(billId);
        bill.setComment(comment);
        return comment;
    }

    @Override
    public Bill getBill(long billId) {
        return billDao.findById(billId);
    }

    @Override
    public List<Bill> getAllBillsByToDay(Date date) {
        return billDao.findByDate(date);
    }
    @Override
    public void postToKitchen(Bill bill) {
        billDao.save(bill);
    }

    @Override
    public List<Bill> divideBill(Bill bill) {
        return null;
    }

    @Override
    public List<Dish> getDishesByType(DishType type) {
        return dishDao.findByType(type);
    }


    @Override
    public List<DishType> getTypes() {
        return null;
    }
}
