package com.my.flat.entity;


import javax.persistence.*;


@Entity
@Table(name = "Storekeeper")
public class Storekeeper {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Column
    public String sername;

    public String name;

    public String position;

    public Storekeeper(String sername, String name, String position) {
        this.sername = sername;
        this.name = name;
        this.position = position;
    }

    public Storekeeper() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}