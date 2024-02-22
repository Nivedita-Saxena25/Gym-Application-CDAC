package project.gym.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "diet_plans")
public class DietPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnoreProperties("dietPlans") // Ignore this property during JSON serialization to prevent infinite recursion
    private Users user;

    @Column(name = "diet_type", nullable = false)
    private String dietType;

    @Column(name = "meal_plan", nullable = false, length = 1000)
    private String mealPlan;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    // Constructors, getters, and setters...

    public DietPlan() {
<<<<<<< HEAD
        // Default constructor
    }

    public DietPlan(Users user, String dietType, String mealPlan, LocalDate startDate, LocalDate endDate) {
        this.user = user;
        this.dietType = dietType;
        this.mealPlan = mealPlan;
        this.startDate = startDate;
        this.endDate = endDate;
    }

=======
        dietType = "";
        mealPlan = "";
        startDate = LocalDate.of(2023, 9, 12);
        endDate = LocalDate.of(2023, 10, 12);
    }


    public DietPlan(Users user, String dietType, String mealPlan, LocalDate startDate, LocalDate endDate) {
        this.user = user;
        this.dietType = dietType;
        this.mealPlan = mealPlan;
        this.startDate = startDate;
        this.endDate = endDate;
    }

     
>>>>>>> branch 'Nivedita' of https://github.com/Nivedita-Saxena25/Health-Fitness-Management-System.git
    // Getters and setters...

    // hashCode() and equals() methods...

    @Override
    public int hashCode() {
        return Objects.hash(id, user, dietType, mealPlan, startDate, endDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DietPlan dietPlan = (DietPlan) o;
        return Objects.equals(id, dietPlan.id) &&
                Objects.equals(user, dietPlan.user) &&
                Objects.equals(dietType, dietPlan.dietType) &&
                Objects.equals(mealPlan, dietPlan.mealPlan) &&
                Objects.equals(startDate, dietPlan.startDate) &&
                Objects.equals(endDate, dietPlan.endDate);
    }
}
