package project.gym.pojos;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Long bookingID;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private ClassSchedule classSchedule;

    @Column(name = "facility_id")
    private Long facilityID;  // Assuming facilityID is of Long type

    @Column(name = "booking_date")
    @Temporal(TemporalType.DATE)
    private Date bookingDate;

    @Column(name = "status")
    private String status;


    public Booking() {
        // Default constructor
    }

    public Booking(Users user, ClassSchedule classSchedule, Long facilityID, Date bookingDate, String status) {
        this.user = user;
        this.classSchedule = classSchedule;
        this.facilityID = facilityID;
        this.bookingDate = bookingDate;
        this.status = status;
    }

    public Long getBookingID() {
        return bookingID;
    }

    public void setBookingID(Long bookingID) {
        this.bookingID = bookingID;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public ClassSchedule getClassSchedule() {
        return classSchedule;
    }

    public void setClassSchedule(ClassSchedule classSchedule) {
        this.classSchedule = classSchedule;
    }

    public Long getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(Long facilityID) {
        this.facilityID = facilityID;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
  
