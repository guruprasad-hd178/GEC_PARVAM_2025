package com.SpringSecurityDemo.SpringSecurityDemo.service;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

public class EmailService {
	
	private JavaMailSender mailSender;
	private TemplateEngine templateEngine;

	public EmailService(JavaMailSender mailSender, TemplateEngine templateEngine) {
		super();
		this.mailSender = mailSender;
		this.templateEngine = templateEngine;
	}

	public void sendEmail(String to, String email, String password, String name) throws MessagingException {
		Context context = new Context();
		
		context.setVariable("name", name);
		context.setVariable("username", email);
		context.setVariable("password", password);
		
		String htmlbody = templateEngine.process("registration-email", context);
		
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
	}
}
