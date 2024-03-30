import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "purchaselist")
public class PurchaseList {
    @EmbeddedId
    private PurchaseListKey id;

    //@PrimaryKeyJoinColumn(name = "student_name")
    //@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Column(name = "student_name",insertable=false, updatable=false)
    private String studentName;

    //@PrimaryKeyJoinColumn(name = "course_name")
   // @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Column(name = "course_name",insertable=false, updatable=false)
    private String courseName;
    private int price;
    @Column(name = "subscription_date")
    private Date subscriptionDate;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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
    public PurchaseListKey getId() {
        return id;
    }

    public void setId(PurchaseListKey id) {
        this.id = id;
    }



}
