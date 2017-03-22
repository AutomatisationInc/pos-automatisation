package services.impl;

import models.Bill;
import models.Dish;
import models.enums.DishType;
import services.CashierService;

import javax.xml.ws.ServiceMode;
import java.util.Date;
import java.util.List;

/**
 * Created by Евгений on 20.03.2017.
 */
public class CashierServiceImpl implements CashierService {

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
