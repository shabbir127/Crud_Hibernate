package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       SessionFactory factory= HibernateUtil.getSessionFactory();
        
       Session session=factory.openSession();
       
       
      /*
       Student student=new Student();
       student.setName("sk");
       student.setAddress("Mumbai");
       student.setCollegename("Mumbaiuniversity");
       student.setEmail("sk@gmail.com");
       
       Student student1=new Student();
       student1.setName("rohit");
       student1.setAddress("pune");
       student1.setCollegename("puneuniversity");
       student1.setEmail("pune@gmail.com");
       
       Transaction tx=session.beginTransaction();
       tx.commit();
       session.save(student);
       session.save(student1);
      */
       
//       List<Student> students=session.createQuery("from Student",Student.class).list();
//       students.forEach(e-> System.out.println(e));
//      
//       Student st=session.get(Student.class, 1);
//         st.setName("shabbir");
//         st.setAddress("kalyan");
//         st.setCollegename("ChennaiUniversity");
//         st.setEmail("shabbir@gmail.com");
//         Transaction tx=session.beginTransaction();
//         tx.commit();
//         session.saveOrUpdate(st);
//         System.out.println(st);
       
       
       
       
       
       
       
       
       
       session.close();
        factory.close();
    }
}
