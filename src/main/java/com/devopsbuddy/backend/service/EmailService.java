package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;

/**
 * Contract for email service
 * Created by Vijay on 10/9/16.
 */
public interface EmailService {
    /**
     * Sends an email with the content in the Feedback Pojo.
     * @param feedbackPojo The Feedback Pojo
     */
    public void sendFeedbackEmail(FeedbackPojo feedbackPojo);

    /**
     * Sends an email with the content of the Simple Mail Message object.
     * @param message The object containing the email content
     */
    public void sendGenericEmailMessage(SimpleMailMessage message);
}
