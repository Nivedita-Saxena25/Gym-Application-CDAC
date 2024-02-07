package project.gym.pojos;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "health_and_fitness_tracking")
public class HealthAndFitnessTracking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tracking_id")
    private Long trackingID;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @Column(name = "tracking_date")
    @Temporal(TemporalType.DATE)
    private Date trackingDate;

    @Column(name = "progress")
    private int progress;

    @Column(name = "goals")
    private int goals;

    // Constructors, getters, and setters...

    public HealthAndFitnessTracking() {
        // Default constructor
    }

    public HealthAndFitnessTracking(Users user, Date trackingDate, int progress, int goals) {
        this.user = user;
        this.trackingDate = trackingDate;
        this.progress = progress;
        this.goals = goals;
    }

    public Long getTrackingID() {
        return trackingID;
    }

    public void setTrackingID(Long trackingID) {
        this.trackingID = trackingID;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Date getTrackingDate() {
        return trackingDate;
    }

    public void setTrackingDate(Date trackingDate) {
        this.trackingDate = trackingDate;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    // Additional methods, if needed
}
