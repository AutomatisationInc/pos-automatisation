package ua.automatisationInc.pos;

import ua.automatisationInc.pos.models.Dish;
import ua.automatisationInc.pos.models.Ingredient;
import ua.automatisationInc.pos.models.enums.DishType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

/**
 * Created by Man on 23.03.2017.
 */
public class testMain {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("pos-automatisation");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
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
        breed.setDate(new Date());
        breed.getDishes().add(royalBurger);
        cheese.setName("Cheese");
        cheese.setWeight(200);
        cheese.setDate(new Date());
       cheese.getDishes().add(royalBurger);
        tomato.setName("Tomato");
        tomato.setWeight(200);
        tomato.setDate(new Date());
        tomato.getDishes().add(royalBurger);
        avocado.setName("Avocado");
        avocado.setWeight(200);
        avocado.setDate(new Date());
        avocado.getDishes().add(royalBurger);
        beef.setName("Beef");
        beef.setWeight(200);
        beef.setDate(new Date());
        beef.getDishes().add(royalBurger);
        salad.setName("Salad");
        salad.setWeight(200);
        salad.setDate(new Date());
       salad.getDishes().add(royalBurger);
        royalBurger.setCategory(DishType.SANDWICH);
        royalBurger.setName("Royal Burger");
        royalBurger.setPrice(400);
        royalBurger.setWeight(300);
        royalBurger.getIngredients().add(breed);
        royalBurger.getIngredients().add(beef);
        royalBurger.getIngredients().add(cheese);
        royalBurger.getIngredients().add(tomato);
        manager.persist(royalBurger);
        manager.getTransaction().commit();
        manager.close();
        factory.close();
    }
}
