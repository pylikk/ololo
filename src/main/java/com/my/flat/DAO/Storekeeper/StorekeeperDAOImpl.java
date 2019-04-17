package com.my.flat.DAO.Storekeeper;

import com.my.flat.entity.Storekeeper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class StorekeeperDAOImpl implements StorekeeperDAO {

    static EntityManagerFactory emf;
    static EntityManager em;

    public StorekeeperDAOImpl() {
        emf = Persistence.createEntityManagerFactory("JPATest");
        em = emf.createEntityManager();
    }


    @Override
    public void add(Scanner sc) {
        System.out.println("Enter sername:");
        String sername = sc.nextLine();

        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter Position:");
        String position = sc.nextLine();

        em.getTransaction().begin();
        try {
            Storekeeper c = new Storekeeper(sername,name,position);
            em.persist(c);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

}
