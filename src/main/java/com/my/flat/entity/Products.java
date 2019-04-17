package com.my.flat.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")

    public int id;

    @Column
    public String unit;

    @Column
    public double count;

    @Column
    public double price;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "act_id", referencedColumnName = "id")
//    private Act act;

    public Products(String unit, double count, double price) {
        this.unit = unit;
        this.count = count;
        this.price = price;
    }

    public Products() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}