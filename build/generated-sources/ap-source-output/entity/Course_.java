package entity;

import entity.Student;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-09T07:16:09", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Course.class)
public class Course_ { 

    public static volatile SingularAttribute<Course, Student> studentId;
    public static volatile SingularAttribute<Course, String> name;
    public static volatile SingularAttribute<Course, Integer> id;

}