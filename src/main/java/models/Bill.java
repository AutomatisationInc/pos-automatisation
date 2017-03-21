package models;

import java.util.Date;
import java.util.List;

/**
 * Created by PavelGrudina on 21.03.2017.
 */
public class Bill {

    private long id;
    private int bonus;
    private double price;
    private String comment;
    private int number;
    private Date date;
    private List<Dish> dishList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bill bill = (Bill) o;

        if (getId() != bill.getId()) return false;
        if (getNumber() != bill.getNumber()) return false;
        if (getDate() != null ? !getDate().equals(bill.getDate()) : bill.getDate() != null) return false;
        return getDishList() != null ? getDishList().equals(bill.getDishList()) : bill.getDishList() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getNumber();
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        result = 31 * result + (getDishList() != null ? getDishList().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", bonus=" + bonus +
                ", price=" + price +
                ", comment='" + comment + '\'' +
                ", number=" + number +
                ", date=" + date +
                ", dishList=" + dishList +
                '}';
    }
}
