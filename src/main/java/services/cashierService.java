package main.java.services;

import java.util.Date;
import java.util.List;

/**
 * Created by Евгений on 20.03.2017.
 */
public interface cashierService {
    List<Dish> getAllResipts();
    List<Dish> getResiptById(long id);
    void deleteItemFromResipt(long id);
    void clearResipt(long id);
    void addItemToResipt(Dish dish);
    void findResiptByDate(Date date);
}
