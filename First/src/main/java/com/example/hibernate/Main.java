package com.example.hibernate;

import com.example.hibernate.Dao;
import com.example.hibernate.Student;

//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

       Dao dao = new Dao();

        // CREATE
        Student s1 = new Student(23,"Roshni");
        Student s2 = new Student(25,"Ankit");
//        s.setName("Priyanka");
//        s.setAge(21);
        dao.insert(s1);
        dao.insert(s2);

        // READ
        Student st = dao.fetch(3);
        System.out.println(st.getName());

        // UPDATE
        st.setAge(24);
        dao.update(st);

        // DELETE
        dao.delete(1);
    }
}
