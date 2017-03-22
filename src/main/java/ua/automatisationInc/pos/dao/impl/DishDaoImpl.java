package ua.automatisationInc.pos.dao.impl;

import org.springframework.stereotype.Repository;
import ua.automatisationInc.pos.dao.DishDao;
import ua.automatisationInc.pos.models.Dish;
import ua.automatisationInc.pos.models.enums.DishType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by PavelGrudina on 21.03.2017.
 */
@Repository
public class DishDaoImpl implements DishDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Dish save(Dish dish) {
        return null;
    }

    @Override
    public Dish update(Dish dish) {
        return null;
    }

    @Override
    public Dish saveOrUpdate(Dish dish) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Dish findById(long id) {
        return null;
    }

    @Override
    public Dish findByName(String name) {
        return null;
    }

    @Override
    public List<Dish> findByType(DishType type) {
        return null;
    }

    @Override
    public List<Dish> findAllDish() {
        return null;
    }
}
