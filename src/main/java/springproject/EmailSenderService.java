package springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype. Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class EmailSenderService {

	@Autowired
	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	private JavaMailSender mailSender;
	public void sendEmail
	(String toEmail,
	String subject,
	String body) {
	SimpleMailMessage message = new SimpleMailMessage();
	message.setFrom("najahcleanservice@gmail.com");
	message.setTo(toEmail);
	message.setText (body);
	message.setSubject (subject);
	mailSender.send(message);
		logger.info("Mail Sent successfully...");
	}
	
}