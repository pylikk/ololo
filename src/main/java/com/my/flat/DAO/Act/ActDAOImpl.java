package com.my.flat.DAO.Act;

import com.my.flat.entity.Act;

import javax.persistence.*;
import java.util.Scanner;

public class ActDAOImpl implements ActDAO {

    static EntityManagerFactory emf;
    static EntityManager em;

    public ActDAOImpl() {
        emf = Persistence.createEntityManagerFactory("JPATest");
        em = emf.createEntityManager();
    }


    @Override
    public void add(Scanner sc) {
        System.out.println("Enter Date:");
        String defaultDateFormat = sc.nextLine();

        System.out.println("Enter Storekeeper:");
        String storekeeper_id = sc.nextLine();

        System.out.println("Enter Type:");
        String type = sc.nextLine();

        System.out.println("Enter Stock:");
        String stock_id = sc.nextLine();

        System.out.println("Enter Product:");
        String Product = sc.nextLine();

        em.getTransaction().begin();
        try {
            Act c = new Act(defaultDateFormat, storekeeper_id, type, stock_id, Product);
            em.persist(c);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

}

//    @Override
//    public void add(Scanner sc) {
//        System.out.println("Enter distric Flat:");
//        String distric = sc.nextLine();
//
//        System.out.println("Enter adress Flat:");
//        String adress = sc.nextLine();
//
//        System.out.println("Enter price:");
//        double price = Double.parseDouble(sc.nextLine());
//
//        System.out.println("Enter nRooms:");
//        int nRooms = Integer.parseInt(sc.nextLine());
//
//        System.out.println("Enter street Flat:");
//        String street = sc.nextLine();
//
//        System.out.println("Enter floor Flat:");
//        int flor = Integer.parseInt(sc.nextLine());
//
//        em.getTransaction().begin();
//        try {
//            Flat c = new Flat(distric, adress, price, nRooms,street, flor);
//            em.persist(c);
//            em.getTransaction().commit();
//        } catch (Exception ex) {
//            em.getTransaction().rollback();
//        }
//    }
//
//    @Override
//    public void delete(Scanner sc) {
//        System.out.print("Enter id: ");
//        String sId = sc.nextLine();
//        long id = Long.parseLong(sId);
//
//        Flat c = em.find(Flat.class, id);
//        if (c == null) {
//            System.out.println("not found!");
//            return;
//        }
//
//        em.getTransaction().begin();
//        try {
//            em.remove(c);
//            em.getTransaction().commit();
//        } catch (Exception ex) {
//            em.getTransaction().rollback();
//        }
//    }
//
//    @Override
//    public void change(Scanner sc) {
//        System.out.print("Enter adress: ");
//        String distric = sc.nextLine();
//
//        System.out.print("Enter distric: ");
//        String adress = sc.nextLine();
//
//        System.out.println("Enter price:");
//        double price = Double.parseDouble(sc.nextLine());
//        System.out.println("Enter nRooms:");
//        int nRooms = Integer.parseInt(sc.nextLine());
//        System.out.println("Enter street Flat:");
//        String street = sc.nextLine();
//
//        System.out.println("Enter nRooms:");
//        int flor = Integer.parseInt(sc.nextLine());
//
//        Flat c = null;
//        try {
//            Query query = em.createQuery("SELECT c FROM Flat c WHERE c.adress = :adress\n", Flat.class);
//            query.setParameter("adress", adress);
//            c = (Flat) query.getSingleResult();
//        } catch (NoResultException ex) {
//            System.out.println("not found!");
//            return;
//        } catch (NonUniqueResultException ex) {
//            System.out.println("Non unique result!");
//            return;
//        }
//
//        em.getTransaction().begin();
//        try {
//            c.setDistric(distric);
//            c.setAdress(adress);
//            c.setPrice(price);
//            c.setnRooms(nRooms);
//            em.getTransaction().commit();
//        } catch (Exception ex) {
//            em.getTransaction().rollback();
//        }
//    }
//
//    @Override
//    public void viewAll() {
//        Query query = em.createQuery("SELECT c FROM Flat c", Flat.class);
//        List<Flat> list = (List<Flat>) query.getResultList();
//        for (Flat c : list) {
//            System.out.println(c);
//        }
//    }

//    @Override
//    public void viewForSale() {
//        Query query = em.createQuery("SELECT c FROM Flat c WHERE c.price=true", Flat.class);
//        List<Flat> list = (List<Flat>) query.getResultList();
//        for (Flat c : list) {
//            System.out.println(c);
//        }
//    }
//
//    @Override
//    public void viewForParameter() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Min");
//        double min = sc.nextDouble();
//        System.out.println("Enter Max");
//        double max = sc.nextDouble();
//
//        Query query = em.createQuery("SELECT c FROM Flat c WHERE c.price BETWEEN :min AND :max", Flat.class);
//
//        query.setParameter("min", min);
//        query.setParameter("max", max);
//        List<Flat> list = (List<Flat>) query.getResultList();
//        for (Flat c : list) {
//            System.out.println(c);
//        }
//    }
//    @Override
//    public void addRandomFlat() {
//        try {
//            em.getTransaction().begin();
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter count: ");
//            int a = sc.nextInt();
//            for (int i = 0; i < a; i++) {
//                if (i % 1 == 0) {
//                    Flat flat = new Flat(java.addDistric(), java.addAdress(), java.addPrice(), java.addNRoom(),java.addStreet(), java.addflor()) ;
//                    em.persist(flat);
//
//                }
//            }
//            em.getTransaction().commit();
//        } catch (Exception ex) {
//            em.getTransaction().rollback();
//        }
//    }
//}
//

