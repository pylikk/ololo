package com.my.flat.Runner;

import com.my.flat.DAO.Act.ActDAOImpl;
import com.my.flat.DAO.Product.ProductDAOImpl;
import com.my.flat.DAO.Stock.StockDAO;
import com.my.flat.DAO.Stock.StockDAOImpl;
import com.my.flat.DAO.Storekeeper.StorekeeperDAOImpl;
import com.my.flat.entity.Stock;


import java.util.*;


public class App {

    public static void main(String[] args) {


        try {
            Scanner sc = new Scanner(System.in);
            ActDAOImpl act = new ActDAOImpl();
            StockDAOImpl stock = new StockDAOImpl();
            ProductDAOImpl product = new ProductDAOImpl();
            StorekeeperDAOImpl storekeeper = new StorekeeperDAOImpl();
            try {

                while (true) {


                    System.out.println("1: Add act");
                    System.out.println("2: Add product");
                    System.out.println("3: Add storekeeper");
                    System.out.println("4: Add stock");
//                    System.out.println("5: view min max");
////                System.out.println("6: view sale");
//                    System.out.println("6: add random flat");

                    System.out.print("-> ");

                    String s = sc.nextLine();


                    switch (s) {
                        case "1":
                            act.add(sc);
                            break;
                        case "2":
                            product.add(sc);
                            break;
                        case "3":
                            storekeeper.add(sc);
                            break;
                        case "4":
                            stock.add(sc);
                            break;
//                        case "5":
//                            flat.viewForParameter();
//                            break;
////                    case "6":
////                        flat.viewForSale();
////                        break;
//                        case "6":
//                            flat.addRandomFlat();
//                            break;
                        default:
                            return;

                    }
                }

            } finally {
                sc.close();

            }
        } catch (
                Exception ex) {
            System.out.println(ex);
            return;
        }
    }
}


//
//    private static void addFlat(String distric, String adress, double price, int nRoom) {
//        try {
//            em.getTransaction().begin();
//
//            Flat flat = new Flat(distric, adress, price, nRoom);
//            em.persist(flat);
//            em.getTransaction().commit();
//        } catch (Exception ex) {
//            em.getTransaction().rollback();
//        }
//    }
//
//    private static void getByPrice(double from, double to) {
//        Query query = em.createQuery("SELECT m FROM Flat m WHERE m.price>:from AND m.price<=:to", Flat.class);
//        query.setParameter("from", from);
//        query.setParameter("to", to);
//
//        List<Flat> flat = query.getResultList();
//
//        if (!flat.isEmpty()) {
//            for (Flat m : flat)
//                System.out.println(m);
//        } else
//            System.out.println("Sorry, no such Flat");
//    }

//    public static void getFlat() {
//        try {
////            Query qu = em.createQuery("SELECT c FROM Flat c", Flat.class);
////            List<Flat> flat = (List<Flat>) qu.getResultList();
////            for (Flat m : flat) {
////                System.out.println(m);
////            }
//
//        } catch (NoResultException ex) {
//            System.out.println("Sorry, we don't any Flat.Try later..");
//        }
//        return;
//    }


//    private static void getFlat() {
//        Query query;
//
//        query = em.createNamedQuery("Flat", Flat.class);
//
//
//        List<Flat> flat = query.getResultList();
//
//        if (!flat.isEmpty()) {
//            for (Flat m : flat)
//                System.out.println(m);
//        } else
//            System.out.println("Sorry, no discounts");
//    }





