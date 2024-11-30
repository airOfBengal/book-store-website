package com.example.bookstorewebsite.dao;

import com.example.bookstorewebsite.entity.Users;

import javax.persistence.EntityManager;
import java.util.List;

public class UserDAO extends JpaDAO<Users> implements GenericDAO<Users>{

    public UserDAO(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Users create(Users entity) {
        return super.create(entity);
    }

    @Override
    public Users update(Users entity) {
        entityManager.getTransaction().begin();
        return null;
    }

    @Override
    public Users get(Object id) {
        return null;
    }

    @Override
    public void delete(Object id) {

    }

    @Override
    public List<Users> listAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
