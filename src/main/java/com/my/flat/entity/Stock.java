package com.my.flat.entity;

import javax.persistence.*;

@Entity
@Table(name = "Stock")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Column
    public int number;

    public Stock(int number) {
        this.number = number;
    }

    public Stock() {
    }
}