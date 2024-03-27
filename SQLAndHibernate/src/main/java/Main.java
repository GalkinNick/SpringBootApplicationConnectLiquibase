

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

import java.util.List;


public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();



        QueryCourses(builder, session);


        sessionFactory.close();
    }

    private static void QueryCourses(CriteriaBuilder builder, Session session){

        //работающий запрос для записи в таблицу linkedPurchaseList
        String hql = "INSERT INTO courses.linkedpurchaselist (student_id, course_id) SELECT s.id ,  c.id\n" +
                "\tFROM courses.purchaselist p\n" +
                "    JOIN courses.students s \n" +
                "    JOIN courses.courses c";


        List<LinkedPurchaseList> linkedPurchaseLists  = session.createQuery(hql).getResultList();
        for (LinkedPurchaseList o : linkedPurchaseLists){
            System.out.println(o.getStudent_id() + " - " + o.getCourse_id());
        }

    }
}
