
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3307/skillbox";
        String user = "root";
        String pass = "testtest";

        List<Integer> monthList = new ArrayList<Integer>();

        float value;

        try {
            Connection connection = DriverManager.getConnection(url, user, pass);

            Statement statement = connection.createStatement();


            ResultSet resultSet = statement.executeQuery("SELECT course_name, COUNT(course_name)/(MAX(MONTH(subscription_date)) - MIN(MONTH(subscription_date))) AS number \n" +
                    "FROM PurchaseList \n" +
                    "GROUP BY course_name");


            while (resultSet.next()) {

                String mon = resultSet.getString("course_name");
                String months = resultSet.getString("number");
                System.out.println(mon + " - " + months);

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }


       /* StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

        Session session = sessionFactory.openSession();*/


        //CriteriaBuilder builder = session.getCriteriaBuilder();

        /*Course course = session.get(Course.class, 1);
        System.out.println(course.getPrice());

        Student student = session.get(Student.class, 1);
        System.out.println(student.getAge());*/

        /// в этом месте возникает ошибка при получении значения даты
        /*PurchaseList purchaseList = session.get(PurchaseList.class, 1);
        System.out.println(purchaseList.getSubscriptionDate());*/


      /*  CriteriaQuery<PurchaseList> queryPurchase = builder.createQuery(PurchaseList.class);
        Root<PurchaseList> rootPurchase = queryPurchase.from(PurchaseList.class);
        queryPurchase.select(rootPurchase).where(builder.greaterThan(rootPurchase.get("price"), 100))
                .orderBy(builder.desc(rootPurchase.get("price")));

        List<PurchaseList> purchaseLists = session.createQuery(queryPurchase).getResultList();
        purchaseLists.forEach(p-> System.out.println(p.getPrice()));*/


        /*CriteriaQuery<Course> query = builder.createQuery(Course.class);
        Root<Course> root = query.from(Course.class);
        query.select(root).where(builder.greaterThan(root.get("price"), 100000))
                .orderBy(builder.desc(root.get("price")));

        List<Course> courseList = session.createQuery(query).getResultList();
        courseList.forEach(c -> System.out.println(c.getName() + " - " + c.getPrice()));*/

        //sessionFactory.close();
    }
}
