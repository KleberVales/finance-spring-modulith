package com.finance.financespringmodulith.notifications.service;


import com.finance.financespringmodulith.notifications.domain.Notification;
import com.finance.financespringmodulith.notifications.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    private final NotificationRepository repository;

    public NotificationService(NotificationRepository repository) {
        this.repository = repository;
    }

    public Notification save(Notification notification) {
        return repository.save(notification);
    }

    public List<Notification> findAll() {
        return repository.findAll();
    }
}

