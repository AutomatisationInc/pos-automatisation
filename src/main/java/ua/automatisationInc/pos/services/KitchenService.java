package ua.automatisationInc.pos.services;

import ua.automatisationInc.pos.models.Bill;

/**
 * Created by Евгений on 20.03.2017.
 */
public interface KitchenService {
    Bill showOrder(long id);
}
