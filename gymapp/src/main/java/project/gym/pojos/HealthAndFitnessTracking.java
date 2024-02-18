package project.gym.pojos;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
}
   