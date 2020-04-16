package com.usman.sample.mail;

import java.util.Map;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@Builder
@ToString
public class Mail {

    private String from;
    private String to;
    private String subject;


    private Map<String, Object> model;


    public Mail(String from, String to, String subject, Map<String, Object> model) {
        this.from = from;
        this.to = to;
        this.subject = subject;

        this.model = model;
    }



}
