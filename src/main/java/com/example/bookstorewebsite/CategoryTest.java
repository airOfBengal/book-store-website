package com.example.bookstorewebsite;

import com.example.bookstorewebsite.entity.Category;
import com.example.bookstorewebsite.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CategoryTest {
    public static void main(String[] args) {
        Category category = new Category();
        category.setName("Core Java");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BookStoreWebsite");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(category);
        em.getTransaction().commit();
        em.close();

        System.out.println("A new user has been created");
    }
}
