package entity;

import entity.Course;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-09T07:16:09", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile ListAttribute<Student, Course> courses;
    public static volatile SingularAttribute<Student, String> name;
    public static volatile SingularAttribute<Student, Integer> id;

}