package ua.automatisationInc.pos.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.automatisationInc.pos.models.Bill;
import ua.automatisationInc.pos.services.KitchenService;

/**
 * Created by Konstantin on 20.03.2017.
 */
@Service
@Transactional(readOnly = true)
public class KitchenServiceImpl implements KitchenService {
    @Override
    @Transactional
    public Bill showOrder(long id) {
        return null;
    }
}
