package ua.automatisationInc.pos.services.impl;

import ua.automatisationInc.pos.dao.BillDao;
import ua.automatisationInc.pos.dao.DishDao;
import ua.automatisationInc.pos.dao.IngredientDao;
import ua.automatisationInc.pos.models.Bill;
import ua.automatisationInc.pos.models.Dish;
import ua.automatisationInc.pos.models.enums.DishType;
import ua.automatisationInc.pos.services.CashierService;

import java.util.ArrayList;
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
        List<DishType> dishTypes = new ArrayList<>();
        for (DishType dishType : DishType.values()) {
            dishTypes.add(dishType);
        }
        return dishTypes;
    }
}
