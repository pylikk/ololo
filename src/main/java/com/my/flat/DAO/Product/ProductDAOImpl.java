package com.my.flat.DAO.Product;

import com.my.flat.entity.Products;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class ProductDAOImpl implements ProductDAO {

    static EntityManagerFactory emf;
    static EntityManager em;

    public ProductDAOImpl() {
        emf = Persistence.createEntityManagerFactory("JPATest");
        em = emf.createEntityManager();
    }

    @Override
    public void add(Scanner sc) {
        System.out.println("Enter unit:");
        String unit = sc.nextLine();

        System.out.println("Enter count:");
        double count = sc.nextDouble();

        System.out.println("Enter Price:");
        double price = sc.nextDouble();

        em.getTransaction().begin();
        try {
            Products p = new Products(unit, count,price);
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

}
