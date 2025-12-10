package com.group_vaccineapi.artifact_vaccineapi.modules.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class NotificationScheduler {

    private final EmailService emailService;

    public NotificationScheduler(EmailService emailService) {
        this.emailService = emailService;
    }

    @Scheduled(fixedRate = 60000)
    public void notifyUser() {
        emailService.sendEmail(
        "valleriaduraes@hotmail.com",
        "Aviso automático",
        "Essa é uma mensagem enviada automaticamente pelo sistema."
        );
    }
}
