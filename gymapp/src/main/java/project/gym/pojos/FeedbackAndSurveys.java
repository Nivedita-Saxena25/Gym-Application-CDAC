package project.gym.pojos;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "feedback_and_surveys")
public class FeedbackAndSurveys {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "survey_id")
    private Long surveyID;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @Column(name = "feedback_type")
    private String feedbackType;

    @Column(name = "feedback_content")
    private String feedbackContent;

    @Column(name = "survey_date")
    @Temporal(TemporalType.DATE)
    private Date surveyDate;

    // Constructors, getters, and setters...

    public FeedbackAndSurveys() {
        // Default constructor
    }

    public FeedbackAndSurveys(Users user, String feedbackType, String feedbackContent, Date surveyDate) {
        this.user = user;
        this.feedbackType = feedbackType;
        this.feedbackContent = feedbackContent;
        this.surveyDate = surveyDate;
    }

    public Long getSurveyID() {
        return surveyID;
    }

    public void setSurveyID(Long surveyID) {
        this.surveyID = surveyID;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public Date getSurveyDate() {
        return surveyDate;
    }

    public void setSurveyDate(Date surveyDate) {
        this.surveyDate = surveyDate;
    }

    // Additional methods, if needed
}

