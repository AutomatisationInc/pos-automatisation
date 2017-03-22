package ua.automatisationInc.pos.dao.impl;

import org.springframework.stereotype.Repository;
import ua.automatisationInc.pos.dao.IngredientDao;
import ua.automatisationInc.pos.models.Ingredient;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by PavelGrudina on 21.03.2017.
 */
@Repository
public class IngredientDaoImpl implements IngredientDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Ingredient save(Ingredient ingredient) {
        return null;
    }

    @Override
    public Ingredient update(Ingredient ingredient) {
        return null;
    }

    @Override
    public Ingredient saveOrUpdate(Ingredient ingredient) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Ingredient findByName(String name) {
        return null;
    }

    @Override
    public Ingredient findById(long id) {
        return null;
    }

    @Override
    public List<Ingredient> findAll() {
        return null;
    }
}
