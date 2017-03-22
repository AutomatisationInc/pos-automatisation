package services;

import models.Bill;

import java.util.List;

/**
 * Created by Евгений on 20.03.2017.
 */
public interface KitchenService {
    Bill showOrder(long id);
}
