package com.usman.sample.mail;

import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

// @Configuration
// public class MailConfig {
//
// @Bean
// public JavaMailSender javaMailService() {
// JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
//
// javaMailSender.setHost("localhost");
// javaMailSender.setPort(25);
//
// javaMailSender.setJavaMailProperties(getMailProperties());
//
// return javaMailSender;
// }
//
// private Properties getMailProperties() {
// Properties properties = new Properties();
// properties.setProperty("mail.transport.protocol", "smtp");
// properties.setProperty("mail.smtp.auth", "true");
// properties.setProperty("mail.smtp.starttls.enable", "false");
// properties.setProperty("mail.debug", "false");
// return properties;
// }
// }
