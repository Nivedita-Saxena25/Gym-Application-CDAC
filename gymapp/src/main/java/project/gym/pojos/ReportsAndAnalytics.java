package project.gym.pojos;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reports_and_analytics")
public class ReportsAndAnalytics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    private Long reportID;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @Column(name = "report_type")
    private String reportType;

    @Column(name = "generated_date")
    @Temporal(TemporalType.DATE)
    private Date generatedDate;

    @Column(name = "content")
    private String content;

    // Constructors, getters, and setters...

    public ReportsAndAnalytics() {
        // Default constructor
    }

    public ReportsAndAnalytics(Users user, String reportType, Date generatedDate, String content) {
        this.user = user;
        this.reportType = reportType;
        this.generatedDate = generatedDate;
        this.content = content;
    }

    public Long getReportID() {
        return reportID;
    }

    public void setReportID(Long reportID) {
        this.reportID = reportID;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public Date getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(Date generatedDate) {
        this.generatedDate = generatedDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Additional methods, if needed
}

