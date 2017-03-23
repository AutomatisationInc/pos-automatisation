package ua.automatisationInc.pos.dao.impl;

import org.springframework.stereotype.Repository;
import ua.automatisationInc.pos.dao.BillDao;
import ua.automatisationInc.pos.models.Bill;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.List;

/**
 * Created by PavelGrudina on 21.03.2017.
 */
@Repository
public class BillDaoImpl implements BillDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Bill save(Bill bill) {
        return null;
    }


    @Override
    public void delete(long id) {

    }

    @Override
    public void deleteByDate(Date date) {

    }

    @Override
    public Bill findById(long billId) {
        return null;
    }

    @Override
    public List<Bill> findAll() {
        return null;
    }

    @Override
    public List<Bill> findByDate(Date date) {
        return null;
    }
}
