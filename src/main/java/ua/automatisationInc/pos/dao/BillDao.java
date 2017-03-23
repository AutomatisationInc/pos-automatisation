package ua.automatisationInc.pos.dao;

import ua.automatisationInc.pos.models.Bill;

import java.util.Date;
import java.util.List;

/**
 * Created by PavelGrudina on 21.03.2017.
 */
public interface BillDao {

    Bill save(Bill bill);

    void delete(long id);

    void deleteByDate(Date date);

    Bill findById(long billId);

    List<Bill> findAll();

    List<Bill> findByDate(Date date);
}
