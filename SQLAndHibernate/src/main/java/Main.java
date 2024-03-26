

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



        String hql = "INSERT INTO linkedpurchaselist (student_id, course_id)" +
                "SELECT student_name, course_name FROM purchaselist";
        Query queryt = session.createQuery(hql);
        int result = queryt.executeUpdate();
        System.out.println("Rows affected: " + result);




        CriteriaQuery<LinkedPurchaseList> query = builder.createQuery(LinkedPurchaseList.class);
        Root<LinkedPurchaseList> root = query.from(LinkedPurchaseList.class);
        query.select(root);

        List<LinkedPurchaseList> purchaseLists = session.createQuery(query).getResultList();
        purchaseLists.forEach(p -> System.out.println(p.getStudent_id() + " - " + p.getCourse_id()));
    }
}
