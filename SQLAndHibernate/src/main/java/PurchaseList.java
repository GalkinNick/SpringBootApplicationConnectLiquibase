
import java.util.List;
import java.util.Date;
import jakarta.persistence.*;
@Entity
@Table(name = "PurchaseList")
public class PurchaseList {

    @Id
    @GeneratedValue
    @Column(name = "student_name", insertable = false, updatable = false)
    private String students;

    @Column(name = "course_name", insertable = false, updatable = false)
    private String courseName;
    @Column(name="price")
    private int price;
    @Column(name = "subscription_date")
    private Date subscriptionDate;

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(Date subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }



}
