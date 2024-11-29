package com.example.bookstorewebsite;

import com.example.bookstorewebsite.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UsersTest {
    public static void main(String[] args) {
        Users user = new Users();
        user.setEmail("atiq@example.com");
        user.setFullName("Atiq");
        user.setPassword("1234");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BookStoreWebsite");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();

        System.out.println("A new user has been created");
    }
}
