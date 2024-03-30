

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();



        //QueryCourses(builder, session);
        TestClass(builder, session);


        sessionFactory.close();
    }

    private static void QueryCourses(CriteriaBuilder builder, Session session){

        //работающий запрос для записи в таблицу linkedPurchaseList
        String hql = "INSERT INTO " + LinkedPurchaseList.class.getSimpleName() + " ( student_id, course_id) SELECT s.id ,  c.id\n" +
                "\tFROM " + PurchaseList.class.getSimpleName() +" p\n" +
                "JOIN " + Students.class.getSimpleName() + " s \n" +
                "JOIN " + Courses.class.getSimpleName() + " c";


        List<LinkedPurchaseList> linkedPurchaseLists  = session.createQuery(hql).getResultList();
        for (LinkedPurchaseList o : linkedPurchaseLists){
            //System.out.println(o.getId());
        }

       /* List<LinkedPurchaseList> linkedPurchaseLists =  session.createQuery("INSERT INTO courses.linkedpurchaselist (student_id, course_id)" +
                "SELECT s.id, c.id from FROM courses.purchaselist p\n" +
                " JOIN courses.students s \n" +
                " JOIN courses.courses c").getResultList();

        linkedPurchaseLists.forEach(lp-> System.out.println(lp.getCourseId() + lp.getStudentId()));*/

    }

    private static void TestClass(CriteriaBuilder builder, Session session){
        String hqlPurchaseList = "From " + PurchaseList.class.getSimpleName();
        List<PurchaseList> purchaseLists = session.createQuery(hqlPurchaseList).getResultList();

        String hqlCourse  = "From " + Courses.class.getSimpleName();
        List<Courses> coursesList = session.createQuery(hqlCourse).getResultList();

        String hqlStudents = "From " + Students.class.getSimpleName();
        List<Students> studentsList = session.createQuery(hqlStudents).getResultList();


        /*purchaseLists.forEach(p -> System.out.println(p.getPrice()));
        coursesList.forEach(c -> System.out.println(c.getId()));
        studentsList.forEach(st -> System.out.println(st.getId()));*/

        LinkedPurchaseList linkedPurchaseList = new LinkedPurchaseList();

        for (Students students : studentsList) {
            linkedPurchaseList.setStudentId(students.getId());
        }
        for (Courses courses : coursesList){
            linkedPurchaseList.setCourseId(courses.getId());
        }
        System.out.println(linkedPurchaseList.getCourseId() + " - " + linkedPurchaseList.getStudentId());
    }
}
