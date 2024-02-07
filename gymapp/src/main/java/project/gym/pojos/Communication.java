package project.gym.pojos;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "communication")
public class Communication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "communication_id")
    private Long communicationID;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @Column(name = "message_type")
    private String messageType;

    @Column(name = "message_content")
    private String messageContent;

    @Column(name = "send_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendDateTime;

    // Constructors, getters, and setters...

    public Communication() {
        // Default constructor
    }

    public Communication(Users user, String messageType, String messageContent, Date sendDateTime) {
        this.user = user;
        this.messageType = messageType;
        this.messageContent = messageContent;
        this.sendDateTime = sendDateTime;
    }

    public Long getCommunicationID() {
        return communicationID;
    }

    public void setCommunicationID(Long communicationID) {
        this.communicationID = communicationID;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Date getSendDateTime() {
        return sendDateTime;
    }

    public void setSendDateTime(Date sendDateTime) {
        this.sendDateTime = sendDateTime;
    }

    // Additional methods, if needed
}
