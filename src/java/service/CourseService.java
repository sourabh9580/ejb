/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Course;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author LENOVO
 */
@Stateless
public class CourseService {
    
    @PersistenceContext
    private EntityManager em;
    
    public void create(Course course) {
        em.persist(course);
    }
    
    public void update(Course course) {
        em.merge(course);
    }
    
    public void delete(int id) {
        Course course = em.find(Course.class, id);
        em.remove(course);
    }
    
    public Course getById(int id) {
        return em.find(Course.class, id);
    }
    
    public List<Course> getAll() {
        return em.createQuery("SELECT c FROM Course c", Course.class).getResultList();
    }
    
    public List<Course> getByStudentId(int studentId) {
        TypedQuery<Course> query = em.createQuery("SELECT c FROM Course c WHERE c.student.id = :studentId", Course.class);
        query.setParameter("studentId", studentId);
        return query.getResultList();
    }
}
