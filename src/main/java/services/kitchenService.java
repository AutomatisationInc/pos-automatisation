package main.java.services;

import java.util.List;

/**
 * Created by Евгений on 20.03.2017.
 */
public interface kitchenService {
    List<Bill> showOrder(long id);
    void finishOrder(long id);
}
