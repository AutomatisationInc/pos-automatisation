package main.java.services.impl;

import main.java.services.cashierService;

import java.util.Date;
import java.util.List;

/**
 * Created by Евгений on 20.03.2017.
 */
public class cashierServiceImpl implements cashierService {

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
}
