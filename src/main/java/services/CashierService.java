package services;

import java.util.Date;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by Евгений on 20.03.2017.
 */
public interface CashierService {
    Dish addDishToBill(long billId ,Dish dish);
    void deleteDishFromBill(long billId, Dish dish);
    void cleanBill(long id);
    double setBonus(int percent);
    double setBonus(double amount);
    String setComment(String comment);
    Bill getBill(long billId);
    List<Bill> getAllBillsByToDay(Date date);
    void postToKitchen(Bill bill);
    List<Bill> divideBill(Bill bill);
    List<Dish> getDishesByType(DishType type);
    List<DishType> getTypes();
}
