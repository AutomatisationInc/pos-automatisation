package dao;

import models.Dish;
import models.enums.DishType;

import java.util.List;

/**
 * Created by PavelGrudina on 21.03.2017.
 */
public interface DishDao {

    Dish save(Dish dish);

    Dish update(Dish dish);

    Dish saveOrUpdate(Dish dish);

    void delete(long id);

    Dish findById(long id);

    Dish findByName(String name);

    List<Dish> findByType(DishType type);

    List<Dish> findAllDish();
}
