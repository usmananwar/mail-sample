package com.usman.sample.mail;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.usman.sample.mail.Mail.MailBuilder;

@SpringBootApplication
public class MailApp implements ApplicationRunner {



    @Autowired
    private EmailService emailService;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MailApp.class, args);
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        // log.info("Sending Email with Freemarker HTML Template Example");

        MailBuilder mailBuilder = Mail.builder();
        mailBuilder.from("no-reply@memorynotfound.com")
                .to("ec.tslim@kalmate.net")
                .subject("Sending Email with Freemarker HTML Template Example");

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("name", "ABC");
        model.put("location", "South Korea");
        model.put("signature", "https://www.koreanair.com/global/en.html");
        mailBuilder.model(model);

        emailService.sendSimpleMessage(mailBuilder.build());
    }
}
