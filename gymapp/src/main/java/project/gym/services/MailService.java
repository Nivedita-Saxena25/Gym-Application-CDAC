package project.gym.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import project.gym.pojos.MailStructure;

@Service
public class MailService {

	@Autowired
	private JavaMailSender mailSender;

	@Value("${spring.mail.username}")
	private String fromMail;

	public void Sendmail(String mail, MailStructure mailStructure) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom(fromMail);
		mailMessage.setSubject(mailStructure.getSubject());
		mailMessage.setText(mailStructure.getMessage());
		mailMessage.setTo(mail);
		
		mailSender.send(mailMessage);
	}
}
