package project.gym.dto.DietPlan;

import lombok.Data;
import java.time.LocalDate;

@Data
public class DietPlanDto {

	private Long id;
	private Long userId;
	private String dietType;
	private String mealPlan;
	private LocalDate startDate;
	private LocalDate endDate;

	// Constructors, getters, and setters...

	public DietPlanDto() {
		// Default constructor
	}

	public DietPlanDto(Long id, Long userId, String dietType, String mealPlan, LocalDate startDate, LocalDate endDate) {
		this.id = id;
		this.userId = userId;
		this.dietType = dietType;
		this.mealPlan = mealPlan;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	// Getters and setters...
}
