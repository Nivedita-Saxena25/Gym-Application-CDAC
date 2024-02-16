package project.gym.pojos;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_id")
    private Long attendanceID;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @Column(name = "check_in_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkInTime;

    @Column(name = "check_out_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkOutTime;

    // Constructors, getters, and setters...

    public Attendance() {
        // Default constructor
    }

    public Attendance(Users user, Date checkInTime, Date checkOutTime) {
        this.user = user;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

    public Long getAttendanceID() {
        return attendanceID;
    }

    public void setAttendanceID(Long attendanceID) {
        this.attendanceID = attendanceID;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Date getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Date checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    // Additional methods, if needed
}
