package com.example.hibernate;

import com.example.hibernate.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Dao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");

    public void insert(Student s){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
    }

    public Student fetch(int id){
        EntityManager em = emf.createEntityManager();
        return em.find(Student.class,id);
    }
    public void update(Student s){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(s);
        em.getTransaction().commit();
    }

    public void delete(int id){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Student s =em.find(Student.class, id);
        em.remove(s);
        em.getTransaction().commit();
    }

}
