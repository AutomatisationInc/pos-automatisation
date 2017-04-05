package ua.automatisationInc.pos;

import ua.automatisationInc.pos.models.Dish;
import ua.automatisationInc.pos.models.Ingredient;
import ua.automatisationInc.pos.models.enums.DishType;
import ua.automatisationInc.pos.services.CashierService;
import ua.automatisationInc.pos.services.impl.CashierServiceImpl;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * Created by Man on 23.03.2017.
 */
public class testMain {
    public static void main(String[] args) {
        Dish royalBurger = initRoyalBurger();

        CashierService cashierService= new CashierServiceImpl();
        List<DishType> dishTypes = cashierService.getDishTypes();
        for (DishType dishType : dishTypes) {
            System.out.println(dishType);
        }
    }

    private static Dish initRoyalBurger() {
        Dish royalBurger = new Dish();
        Ingredient breed = new Ingredient();
        Ingredient cheese = new Ingredient();
        Ingredient salad = new Ingredient();
        Ingredient chicken = new Ingredient();
        Ingredient tomato = new Ingredient();
        Ingredient avocado = new Ingredient();
        Ingredient beef = new Ingredient();
        breed.setName("Breed");
        breed.setWeight(200);
        breed.setDate(LocalDate.now());
        breed.getDishes().add(royalBurger);
        cheese.setName("Cheese");
        cheese.setWeight(200);
        cheese.setDate(LocalDate.now());
        cheese.getDishes().add(royalBurger);
        tomato.setName("Tomato");
        tomato.setWeight(200);
        tomato.setDate(LocalDate.now());
        tomato.getDishes().add(royalBurger);
        avocado.setName("Avocado");
        avocado.setWeight(200);
        avocado.setDate(LocalDate.now());
        avocado.getDishes().add(royalBurger);
        beef.setName("Beef");
        beef.setWeight(200);
        beef.setDate(LocalDate.now());
        beef.getDishes().add(royalBurger);
        salad.setName("Salad");
        salad.setWeight(200);
        salad.setDate(LocalDate.now());
        salad.getDishes().add(royalBurger);
        royalBurger.setCategory(DishType.SANDWICH);
        royalBurger.setName("Royal Burger");
        royalBurger.setPrice(400);
        royalBurger.setWeight(300);
        royalBurger.getIngredients().add(breed);
        royalBurger.getIngredients().add(beef);
        royalBurger.getIngredients().add(cheese);
        royalBurger.getIngredients().add(tomato);
        return royalBurger;
    }
}
