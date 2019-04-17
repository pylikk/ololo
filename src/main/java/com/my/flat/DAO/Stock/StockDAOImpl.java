package com.my.flat.DAO.Stock;

import com.my.flat.entity.Stock;
import com.my.flat.entity.Storekeeper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class StockDAOImpl implements StockDAO {

    static EntityManagerFactory emf;
    static EntityManager em;

    public StockDAOImpl() {
        emf = Persistence.createEntityManagerFactory("JPATest");
        em = emf.createEntityManager();
    }


    @Override
    public void add(Scanner sc) {
        System.out.println("Enter number:");
        int number = sc.nextInt();

        em.getTransaction().begin();
        try {
            Stock c = new Stock(number);
            em.persist(c);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

}


