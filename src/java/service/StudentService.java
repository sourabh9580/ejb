/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Student;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LENOVO
 */
@Stateless
public class StudentService {
    
    @PersistenceContext(unitName = "myPersistenceUnit")
    private EntityManager em;
    
    public void create(Student student) {
        em.persist(student);
    }
    
    public void update(Student student) {
        em.merge(student);
    }
    
    public void delete(int id) {
        Student student = em.find(Student.class, id);
        em.remove(student);
    }
    
    public Student getById(int id) {
        return em.find(Student.class, id);
    }
    
    public List<Student> getAll() {
        return em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    }
}

