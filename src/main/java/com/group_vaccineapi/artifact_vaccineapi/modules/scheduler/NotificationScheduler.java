package com.group_vaccineapi.artifact_vaccineapi.modules.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class NotificationScheduler {
    @Scheduled(fixedRate = 10000)
    public void sendTestEmail() {
        System.out.println("Sending test email: " + System.currentTimeMillis());
    }
}
