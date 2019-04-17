package com.my.flat.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Act")

public class Act {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;


    @Column
    public String defaultDateFormat;

    @Column
    public String storekeeper_id;

    @Column
    public String type;

    @Column
    public String stock_id;

    @Column
    public String product;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Products products;


    public Act() {
    }

    public Act(String defaultDateFormat, String storekeeper_id, String type, String stock_id, String product_id) {
        this.defaultDateFormat = defaultDateFormat;
        this.storekeeper_id = storekeeper_id;
        this.type = type;
        this.stock_id = stock_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDefaultDateFormat() {
        return defaultDateFormat;
    }

    public void setDefaultDateFormat(String defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
    }

    public String getStorekeeper_id() {
        return storekeeper_id;
    }

    public void setStorekeeper_id(String storekeeper_id) {
        this.storekeeper_id = storekeeper_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStock_id() {
        return stock_id;
    }

    public void setStock_id(String stock_id) {
        this.stock_id = stock_id;
    }
}





//    @ManyToMany(mappedBy = "Stock", cascade = CascadeType.ALL)
//    List<Act> acts = new ArrayList<>();

//    @OneToMany(mappedBy = "Storekeeper", cascade = CascadeType.ALL)
//    public List<Storekeeper> storekeepers = new ArrayList<>();
//
//    @ManyToMany(mappedBy = "Product", cascade = CascadeType.ALL)
//    List<Product> products = new ArrayList<>();

//    @OneToMany(mappedBy = "Stock", cascade = CascadeType.ALL)
//    public List<Stock> stocks = new ArrayList<>();

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "storekeeper_id")
//    private String storekeeper;
//
//    @ManyToMany
//    @JoinTable(
//            name = "storekeeper",
//            joinColumns = {@JoinColumn(name = "storekeeper_name", referencedColumnName = "storekeeper")},
//            inverseJoinColumns = {@JoinColumn(name = "storekeeper_name", referencedColumnName = "storekeeper_name")})
//    List<Type> type = new ArrayList<>();
//
//
//    @ManyToMany
//    @JoinTable(
//            name = "type",
//            joinColumns = {@JoinColumn(name = "type", referencedColumnName = "type")},
//            inverseJoinColumns = {@JoinColumn(name = "type", referencedColumnName = "type")})
//    List<Type> type = new ArrayList<>();
