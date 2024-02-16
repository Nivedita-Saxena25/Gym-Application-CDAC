package project.gym.pojos;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "class_schedule")
public class ClassSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private Long classID;

    @Column(name = "class_name")
    private String className;

    @Column(name = "schedule_date")
    @Temporal(TemporalType.DATE)
    private Date scheduleDate;

    @Column(name = "start_time")
    @Temporal(TemporalType.TIME)
    private Date startTime;

    @Column(name = "end_time")
    @Temporal(TemporalType.TIME)
    private Date endTime;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Trainer instructor;

    // Constructors, getters, and setters...

    public ClassSchedule() {
        // Default constructor
    }

    public ClassSchedule(String className, Date scheduleDate, Date startTime, Date endTime, Trainer instructor) {
        this.className = className;
        this.scheduleDate = scheduleDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.instructor = instructor;
    }

    public Long getClassID() {
        return classID;
    }

    public void setClassID(Long classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Trainer getInstructor() {
        return instructor;
    }

    public void setInstructor(Trainer instructor) {
        this.instructor = instructor;
    }

    // Additional methods, if needed
}

